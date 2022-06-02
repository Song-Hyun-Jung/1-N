package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.DeliveryPost;
import com.example.demo.service.DeliveryServiceImpl;

@Controller
public class ViewCategoryController {
	private DeliveryServiceImpl deliveryService;

	@Autowired
	public void setDeliveryService(DeliveryServiceImpl deliveryService) {
		this.deliveryService = deliveryService;
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
}
