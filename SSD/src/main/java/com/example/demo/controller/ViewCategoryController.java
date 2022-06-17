package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.DeliveryPost;
import com.example.demo.domain.SellPost;
import com.example.demo.service.DeliveryServiceImpl;
import com.example.demo.service.SellServiceImpl;

@Controller
public class ViewCategoryController {
	private DeliveryServiceImpl deliveryService;
	private SellServiceImpl sellService;

	@Autowired
	public void setDeliveryService(DeliveryServiceImpl deliveryService) {
		this.deliveryService = deliveryService;
	}
	
	@Autowired
	public void setSellService(SellServiceImpl sellService) {
		this.sellService = sellService;
	}
	//배달음식 나누기 카테고리 별로 보기
	@RequestMapping("/shop/categoryDelivery.do")
	public String categoryDelivery(
			@RequestParam("deliveryCategoryId") int deliveryCategoryId,
			ModelMap model) throws Exception {
		List<DeliveryPost> deliveryPostList = this.deliveryService.getDeliveryPostByCategoryId(deliveryCategoryId);
		model.put("deliveryPostList", deliveryPostList);
		return "/delivery/deliveryList";
	}
	
	//이웃 간 거래 카테고리 별로 보기
	@RequestMapping("/shop/categorySell.do")
	public String categorySell(
			@RequestParam("sellCategoryId") int sellCategoryId, ModelMap model) throws Exception 
	{
		List<SellPost> sellPostList = this.sellService.getSellPostByCategoryId(sellCategoryId);
		model.put("sellPostList", sellPostList);
		return "/sell/sellList";
	}
}
