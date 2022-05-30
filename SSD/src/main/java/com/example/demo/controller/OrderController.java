package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.Cart;
import com.example.demo.domain.OrderInfo;
import com.example.demo.domain.ShoppingItem;
import com.example.demo.domain.UserInfo;
import com.example.demo.service.ShoppingService;
import com.example.demo.service.UserService;

@Controller
public class OrderController {
	
	@Autowired private ShoppingService shoppingService;
	@Autowired private UserService userService;
	
	@RequestMapping("/shop/askPurchase.do")
	public ModelAndView initNewOrder( 
			HttpServletRequest request, HttpSession session, @RequestParam("itemId") int itemId) throws Exception {
		
		session.setAttribute("loginUserEmail", "som@gmail.com");		//test용으로 세션 설정
		String userEmail = (String)session.getAttribute("loginUserEmail");	//session에서 얻은 email로 현재 로그인한 UserInfo 얻기
		
		UserInfo userInfo = userService.getUserByEmail(userEmail);		
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("shopping/shoppingPurchase");
		ShoppingItem purchaseItem = shoppingService.getItem(itemId);
		mav.addObject("purchaseItem", purchaseItem);	//구매하는 item 정보
		mav.addObject("userInfo", userInfo);		//userInfo 정보
		
		return mav;
	}
	
	
	@RequestMapping("/shop/OrderMypageUpdate.do")
	public String updateMyPageOrder( 
			HttpServletRequest request, HttpSession session, @RequestParam("itemId") int itemId,
			 @ModelAttribute("orderCommand") OrderCommand orderCommand) throws Exception {
		
		String userEmail = (String)session.getAttribute("loginUserEmail");	
		UserInfo userInfo = userService.getUserByEmail(userEmail);
		
		UpdateUserCommand userC = new UpdateUserCommand(userInfo.getNickname(), userInfo.getPassword(), 
				orderCommand.getPhone(), orderCommand.getAddress(), orderCommand.getPayment(), userEmail);
		userService.updateUser(userC);
		
		int updateSuccess = userService.updateUser(userC);
		
		return "redirect:/shop/askPurchase.do?itemId="+itemId;
	}

	
	
	@RequestMapping("/shop/cancel.do")
	public ModelAndView cancleOrder(@RequestParam("itemId") int itemId) throws Exception {	//itemId에 해당하는 shoppingDetail페이지로
		ModelAndView mav = new ModelAndView();
		mav.setViewName("shopping/shoppingDetail");
		
		ShoppingItem viewItem = shoppingService.getItem(itemId);
		mav.addObject("viewItem", viewItem);	//shoppingDetail.jsp 어떻게 구현돼있는지 확인 후 수정, 구매하려다 취소한 item 정보
		
		return mav;
	}
	
	@RequestMapping("/shop/confirmPurchase.do")
	public String donePurchase(OrderCommand orderCommand) throws Exception{	//OrderCommand 받아와야함
	
		Date now = new Date();	//현재 시간 구하기
		
		OrderInfo order = new OrderInfo(now, orderCommand.getQuantity(), orderCommand.getUserId(), orderCommand.getItemId());
		
		shoppingService.insertOrder(order);
		shoppingService.updateQuantity(order);
		
		return "redirect:/shop/mypagePurchase.do";
	}
	

}
