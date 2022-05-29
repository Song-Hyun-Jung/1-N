package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.ShoppingItem;
import com.example.demo.service.ShoppingService_jinhee;

@Controller
public class ViewItemController {
	private ShoppingService_jinhee shoppingService;

	@Autowired
	public void setShoppingService(ShoppingService_jinhee shoppingService) {
		this.shoppingService = shoppingService;
	}

	
	@RequestMapping("/shop/viewItem.do")
	public String viewItem(
			@RequestParam("shoppingItemId") int shoppingItemId,
			ModelMap model) throws Exception {
		ShoppingItem shoppingItem = this.shoppingService.getItem(shoppingItemId);
		model.put("shoppingItem", shoppingItem);
		return "/shopping/shoppingPurchase";
	}
}
