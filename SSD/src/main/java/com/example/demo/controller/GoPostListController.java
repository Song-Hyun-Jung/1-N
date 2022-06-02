package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.DeliveryPost;
import com.example.demo.service.DeliveryServiceImpl;

@Controller
public class GoPostListController {
	private DeliveryServiceImpl deliveryService;

	@Autowired
	public void setDeliveryService(DeliveryServiceImpl deliveryService) {
		this.deliveryService = deliveryService;
	}
	
	//배달음식 나누기 메인
	@RequestMapping("/shop/deliveryMain.do")
	public String deliveryList(
			ModelMap model) throws Exception {
		List<DeliveryPost> deliveryPostList = this.deliveryService.getAllDeliveryPost();
		model.put("deliveryPostList", deliveryPostList);
		return "/delivery/deliveryList";
	}
}
