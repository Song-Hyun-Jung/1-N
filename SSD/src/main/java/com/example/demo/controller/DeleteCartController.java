package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.Cart;
import com.example.demo.service.ShoppingService;
import com.example.demo.service.UserService;


@Controller
public class DeleteCartController { 
	
	@Autowired private ShoppingService shoppingService;
	@Autowired private UserService userService;

	@RequestMapping("/shop/deleteCart.do")
	public String handleRequest(
			@RequestParam("cartId") int cartId) throws Exception {
		shoppingService.deleteCart(cartId);
		
		return "redirect:/shop/mypageCart.do";
	}
}