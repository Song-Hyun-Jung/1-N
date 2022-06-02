package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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

		UserInfo userInfo = (UserInfo)session.getAttribute("loginMember");	//session에서 현재 로그인한 userInfo객체 얻어옴
		System.out.println("주문서 UserInfo: "+userInfo.getUserId()+", "+userInfo.getName() + ", "+userInfo.getAddress());
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("shopping/shoppingPurchase");
		ShoppingItem purchaseItem = shoppingService.getItem(itemId);
		mav.addObject("purchaseItem", purchaseItem);	//구매하는 item 정보
		mav.addObject("userInfo", userInfo);		//userInfo 정보
		
		return mav;
	}
	
	
	@RequestMapping("/shop/OrderMypageUpdate.do")
	public String updateMyPageOrder( 
			HttpServletRequest request, HttpSession session, @RequestParam("itemId") int itemId, @RequestParam("quantity") int quantity,
			 @ModelAttribute("orderCommand") OrderCommand orderCommand) throws Exception {

		
		UserInfo userInfo = (UserInfo)session.getAttribute("loginMember");	//session에서 현재 로그인한 userInfo객체 얻어옴
		System.out.println("update 전 UserInfo: "+userInfo.getUserId()+", "+userInfo.getName() + ", "+userInfo.getAddress());
		
		UpdateUserCommand userC = new UpdateUserCommand(userInfo.getNickname(), userInfo.getPassword(), 
				orderCommand.getPhone(), orderCommand.getAddress(), orderCommand.getPayment(), userInfo.getEmail());
		userService.updateUser(userC);
		
		UserInfo updateUser = userService.getUserByUserId(userInfo.getUserId());	//userId는 바뀌지 않으므로 id로 update된 정보 가져옴
		session.setAttribute("loginMember", updateUser);
		System.out.println("update 후 UserInfo: "+userInfo.getUserId()+", "+userInfo.getName() + ", "+userInfo.getAddress());
		
		
		return "redirect:/shop/askPurchase.do?itemId="+itemId+"&quantity="+quantity;
	}

	
	
	@RequestMapping("/shop/cancel.do")
	public ModelAndView cancleOrder(@RequestParam("itemId") int itemId) throws Exception {	//itemId에 해당하는 shoppingDetail페이지로
		ModelAndView mav = new ModelAndView();
		mav.setViewName("shopping/shoppingDetail");
		
		ShoppingItem shoppingItem = shoppingService.getItem(itemId);
		mav.addObject("shoppingItem", shoppingItem);	//shoppingDetail.jsp 어떻게 구현돼있는지 확인 후 수정, 구매하려다 취소한 item 정보
		
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
