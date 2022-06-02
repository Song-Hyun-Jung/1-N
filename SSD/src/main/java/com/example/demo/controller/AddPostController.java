package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.DeliveryPost;
import com.example.demo.service.DeliveryServiceImpl;
import com.example.demo.service.UserService;

@Controller
public class AddPostController {
	@Autowired
	private DeliveryServiceImpl deliveryService;
	@Autowired
	private UserService userService;
	
	//배달음식 나누기 글쓰기 폼 이동
	@RequestMapping("/shop/deliveryForm.do")
	public String deliveryForm(
			ModelMap model) throws Exception {
		return "/delivery/deliveryPost";
	}
	
	//배달음식 나누기 글쓰기 폼 이동
	@RequestMapping("/shop/insertDelivery.do")
	public String insertDelivery(
			HttpServletRequest request,
			ModelMap model,
			@RequestParam ("title") String title,
    		@RequestParam ("userNickname") String userNickname,
    		@RequestParam ("deliveryCategoryId") String deliveryCategoryId,
    		@RequestParam ("writtenDate") Date writtenDate,
    		@RequestParam ("foodName") String foodName,
			@RequestParam ("address") String address,
			@RequestParam ("complete") String complete) throws Exception {
		return "/delivery/deliveryPost";
	}
}
