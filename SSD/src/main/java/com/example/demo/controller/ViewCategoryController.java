package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.ShoppingCategory;
import com.example.demo.service.ShoppingService;

@Controller
public class ViewCategoryController {
	private ShoppingService shoppingService;

	@Autowired
	public void setShoppingService(ShoppingService shoppingService) {
		this.shoppingService = shoppingService;
	}

	/*
	@RequestMapping("/shop/categoryItemShop.do")
	public String categoryItemShop(
			ModelMap model) throws Exception {
		List<ShoppingCategory> shoppingCategoryList = this.shoppingService.getAllCategory();
		model.put("shoppingCategoryList", shoppingCategoryList);
		return "/shopping/shoppingCategory";
	}*/
}
