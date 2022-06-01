package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.ShoppingItem;
import com.example.demo.service.ShoppingService;

@Controller
public class SearchItemController {
	private ShoppingService shoppingService;

	@Autowired
	public void setShoppingService(ShoppingService shoppingService) {
		this.shoppingService = shoppingService;
	}
	
	@RequestMapping("/shop/searchItem.do")
	public String searchItem(
			@RequestParam("keyword") String keyword,
			@RequestParam("search") String search,
			ModelMap model) throws Exception {
		List<ShoppingItem> shoppingItemList = this.shoppingService.itemSearch(keyword);
		model.put("shoppingItemList", shoppingItemList);
		model.put("search", search);
		return "/shopping/shoppingCategory";
	}
}
