package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.DeliveryPost;
import com.example.demo.domain.SellCategory;
import com.example.demo.domain.SellPost;
import com.example.demo.service.DeliveryServiceImpl;
import com.example.demo.service.SellService;

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
	
	//이웃 커뮤니티 메인
	@Autowired
	SellService sellService;
	
	@RequestMapping("/shop/sellMain.do")
	public ModelAndView sellList() throws Exception{
		List<SellPost> sellPostList = sellService.getAllSellPost();
		List<SellCategory> sellCategoryList = sellService.getSellCategoryList();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("sell/sellList");
		mav.addObject("sellPostList", sellPostList);
		mav.addObject("sellCategoryList", sellCategoryList);
		return mav;
	}
}
