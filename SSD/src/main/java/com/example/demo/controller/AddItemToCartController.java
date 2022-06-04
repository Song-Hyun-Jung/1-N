package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.Cart;
import com.example.demo.domain.MyCartResultMap;
import com.example.demo.domain.UserInfo;
import com.example.demo.service.ShoppingService;
import com.example.demo.service.UserService;

@Controller
public class AddItemToCartController {
	
	@Autowired private ShoppingService shoppingService;
	@Autowired private UserService userService;

	@RequestMapping("/shop/addItemToCart.do")
	public ModelAndView handleRequest( 
			HttpSession session, Model model,
			@RequestParam("itemId") int itemId) throws Exception {
		
		ModelAndView mav = new ModelAndView();
				
		UserInfo userInfo = (UserInfo)session.getAttribute("loginMember");
		if (userInfo == null) {//로그인 상태가 아닌 경우
			mav.addObject("msg", "로그인 상태가 아닙니다. 로그인을 먼저 해주세요");
	        mav.addObject("url", "/shop/login.do");
	        mav.setViewName("alert/error");
	        return mav;
		}
		
		List<Cart> cartItemList = shoppingService.getCartByUserId(userInfo.getUserId());		//user의 cartList 가져옴

		int same = 0;	//cart에 이미 있는 item이면 same == 1
		for(Cart cart : cartItemList) {
			if(cart.getItemId() == itemId) { //user의 cart에 이미 들어있는 item을 추가하려는 상태, 나중에 alert창 같은 걸로 처리하기
				same = 1;
				break;
			}
				
		}
		
		//ModelAndView mav = new ModelAndView();
		
		if(same == 0) {		//cart에 같은 아이템 없는 경우에만 추가
			Cart newCart = new Cart(userInfo.getUserId(), itemId);	//cart 생성
			shoppingService.insertCart(newCart);
			
			List<MyCartResultMap> myCartItemList = userService.getCartItemList(userInfo.getUserId());
			mav.addObject("myCartItemList", myCartItemList);
			mav.addObject("myCartSize", myCartItemList.size()); //찜한 개수 보내기
			mav.setViewName("shopping/shoppingCart");
			mav.addObject("same", 0);
			return mav;

		}
		
		
		List<MyCartResultMap> myCartItemList = userService.getCartItemList(userInfo.getUserId());
		mav.addObject("myCartItemList", myCartItemList);
		mav.addObject("myCartSize", myCartItemList.size()); //찜한 개수 보내기
		mav.setViewName("shopping/shoppingCart");
		mav.addObject("same", 1);
		
		return mav;		//cart에 이미 있는 아이템을 넣은 경우
		
	}
	
	
	
	

}
