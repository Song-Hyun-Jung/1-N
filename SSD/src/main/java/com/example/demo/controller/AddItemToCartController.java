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
		
		//List<Cart> cartItemList = userService.getCartItemList(userId); 			//user의 cartList 가져옴

		session.setAttribute("loginUserEmail", "star@gmail.com");		//test용으로 세션 설정 userId:5
		String userEmail = (String)session.getAttribute("loginUserEmail");	//session에서 얻은 email로 현재 로그인한 UserInfo 얻기
		UserInfo user = userService.getUserByEmail(userEmail);
		
		ArrayList<Cart> cartItemList = new ArrayList<>();
		//userId, itemId, cartId
		cartItemList.add(new Cart(5, 5, 5));
		cartItemList.add(new Cart(5, 2, 6));
		cartItemList.add(new Cart(5, 3, 8));
		
		int same = 0;	//cart에 이미 있는 item이면 same == 1
		for(Cart cart : cartItemList) {
			if(cart.getItemId() == itemId) { //user의 cart에 이미 들어있는 item을 추가하려는 상태, 나중에 alert창 같은 걸로 처리하기
				same = 1;
				break;
			}
				
		}
		
		if(same == 0) {		//cart에 같은 아이템 없는 경우에만 추가
			Cart newCart = new Cart(user.getUserId(), itemId);	//cart 생성
			shoppingService.insertCart(newCart);
		}
		
		
		return "redirect:/shop/mypageCart.do";
	}

}
