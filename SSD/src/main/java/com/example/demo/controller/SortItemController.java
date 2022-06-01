package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.ShoppingCategory;
import com.example.demo.domain.ShoppingItem;
import com.example.demo.service.ShoppingService;

@Controller
public class SortItemController {
	private ShoppingService shoppingService;

	@Autowired
	public void setShoppingService(ShoppingService shoppingService) {
		this.shoppingService = shoppingService;
	}
	
	@RequestMapping("/shop/categoryItemShop.do")
	public String categoryItemShop(
			@RequestParam("shoppingCategoryId") int shoppingCategoryId,
			ModelMap model) throws Exception {
		List<ShoppingItem> shoppingItemList = this.shoppingService.getItemsByCategoryId(shoppingCategoryId);
		String shoppingCategoryName = this.shoppingService.getNameByCategoryId(shoppingCategoryId);
		String shoppingCategoryDescription = this.shoppingService.getDescriptionByCategoryId(shoppingCategoryId);
		model.put("shoppingItemList", shoppingItemList);
		model.put("shoppingCategoryId", shoppingCategoryId);
		model.put("shoppingCategoryName", shoppingCategoryName);
		model.put("shoppingCategoryDescription", shoppingCategoryDescription);
		return "/shopping/shoppingCategory";
	}
	
	@RequestMapping("/shop/sortItemHigh.do")
	public String sortItemHigh(
			@RequestParam("shoppingCategoryId") int shoppingCategoryId,
			ModelMap model) throws Exception {
		List<ShoppingItem> shoppingItemList = this.shoppingService.getItemSortByHighPrice(shoppingCategoryId);
		String shoppingCategoryName = this.shoppingService.getNameByCategoryId(shoppingCategoryId);
		String shoppingCategoryDescription = this.shoppingService.getDescriptionByCategoryId(shoppingCategoryId);
		model.put("shoppingItemList", shoppingItemList);
		model.put("shoppingItemList", shoppingItemList);
		model.put("shoppingCategoryId", shoppingCategoryId);
		model.put("shoppingCategoryName", shoppingCategoryName);
		model.put("shoppingCategoryDescription", shoppingCategoryDescription);
		return "/shopping/shoppingCategory";
	}
	
	@RequestMapping("/shop/sortItemLow.do")
	public String sortItemLow(
			@RequestParam("shoppingCategoryId") int shoppingCategoryId,
			ModelMap model) throws Exception {
		List<ShoppingItem> shoppingItemList = this.shoppingService.getItemSortByLowPrice(shoppingCategoryId);
		String shoppingCategoryName = this.shoppingService.getNameByCategoryId(shoppingCategoryId);
		String shoppingCategoryDescription = this.shoppingService.getDescriptionByCategoryId(shoppingCategoryId);
		model.put("shoppingItemList", shoppingItemList);
		model.put("shoppingItemList", shoppingItemList);
		model.put("shoppingCategoryId", shoppingCategoryId);
		model.put("shoppingCategoryName", shoppingCategoryName);
		model.put("shoppingCategoryDescription", shoppingCategoryDescription);
		return "/shopping/shoppingCategory";
	}
	
	@RequestMapping("/shop/sortItemSell.do")
	public String sortItemSell(
			@RequestParam("shoppingCategoryId") int shoppingCategoryId,
			ModelMap model) throws Exception {
		List<ShoppingItem> shoppingItemList = this.shoppingService.getItemSortBySoldQuantity(shoppingCategoryId);
		String shoppingCategoryName = this.shoppingService.getNameByCategoryId(shoppingCategoryId);
		String shoppingCategoryDescription = this.shoppingService.getDescriptionByCategoryId(shoppingCategoryId);
		model.put("shoppingItemList", shoppingItemList);
		model.put("shoppingItemList", shoppingItemList);
		model.put("shoppingCategoryId", shoppingCategoryId);
		model.put("shoppingCategoryName", shoppingCategoryName);
		model.put("shoppingCategoryDescription", shoppingCategoryDescription);
		return "/shopping/shoppingCategory";
	}
}
