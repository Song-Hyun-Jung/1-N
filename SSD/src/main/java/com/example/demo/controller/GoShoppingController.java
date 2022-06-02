package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.ShoppingCategory;
import com.example.demo.domain.ShoppingItem;
import com.example.demo.service.ShoppingService;

@Controller
public class GoShoppingController {		//쇼핑몰 메인으로 이동
	
	private ShoppingService shoppingService;

	@Autowired
	public void setShoppingService(ShoppingService shoppingService) {
		this.shoppingService = shoppingService;
	}
	
	@RequestMapping("/shop/shoppingMain.do")
	public ModelAndView myPageView() throws Exception{
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("shopping/shoppingMain");
		List<ShoppingItem> top3Item = shoppingService.getTop3Item();
		mav.addObject("top3Item", top3Item);		//top3Item 담아서 main.jsp로 이동
		
		List<ShoppingCategory> categories = shoppingService.getAllCategory();
		mav.addObject("categories", categories);
		
		return mav;
	}
}
