package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.ShoppingItem;
import com.example.demo.service.ShoppingService;

@Controller
public class ViewItemController {
	private ShoppingService shoppingService;

	@Autowired
	public void setShoppingService(ShoppingService shoppingService) {
		this.shoppingService = shoppingService;
	}

	
	@RequestMapping("/shop/viewItem.do")
	public String viewItem(
			@RequestParam("shoppingItemId") int shoppingItemId,
			ModelMap model) throws Exception {
		ShoppingItem shoppingItem = this.shoppingService.getItem(shoppingItemId);
		model.put("shoppingItem", shoppingItem);
		return "/shopping/shoppingDetail";
	}
}
