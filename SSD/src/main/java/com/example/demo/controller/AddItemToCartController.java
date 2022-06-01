package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.Cart;
import com.example.demo.domain.UserInfo;
import com.example.demo.service.ShoppingService;
import com.example.demo.service.UserService;

@Controller
public class AddItemToCartController {
	
	@Autowired private ShoppingService shoppingService;
	@Autowired private UserService userService;

	@RequestMapping("/shop/addItemToCart.do")
	public String handleRequest( 
			HttpSession session, @RequestParam("itemId") int itemId) throws Exception {
		
		UserInfo userInfo = (UserInfo)session.getAttribute("loginMember");	//session에서 현재 로그인한 userInfo객체 얻어옴
		
		List<Cart> cartItemList = shoppingService.getCartByUserId(userInfo.getUserId());		//user의 cartList 가져옴

		int same = 0;	//cart에 이미 있는 item이면 same == 1
		for(Cart cart : cartItemList) {
			if(cart.getItemId() == itemId) { //user의 cart에 이미 들어있는 item을 추가하려는 상태, 나중에 alert창 같은 걸로 처리하기
				same = 1;
				break;
			}
				
		}
		
		if(same == 0) {		//cart에 같은 아이템 없는 경우에만 추가
			Cart newCart = new Cart(userInfo.getUserId(), itemId);	//cart 생성
			shoppingService.insertCart(newCart);
			return "redirect:/shop/mypageCart.do";
		}
		
		return "redirect:/shop/mypageCart.do?same=1";		//cart에 이미 있는 아이템을 넣은 경우
		
	}

}
