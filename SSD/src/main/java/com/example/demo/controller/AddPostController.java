package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.DeliveryPost;
import com.example.demo.domain.SellPost;
import com.example.demo.domain.UserInfo;
import com.example.demo.service.DeliveryServiceImpl;
import com.example.demo.service.SellServiceImpl;
import com.example.demo.service.UserService;

@Controller
public class AddPostController {
	@Autowired
	private DeliveryServiceImpl deliveryService;
	
	@Autowired
	private SellServiceImpl sellService;
	
	//배달음식 나누기 글쓰기 폼 이동
	@RequestMapping("/shop/deliveryForm.do")
	public String deliveryForm(
			HttpSession session,
			ModelMap model) throws Exception {
		//현재 로그인중인 회원 가져오기
		UserInfo loginUser = (UserInfo)session.getAttribute("loginMember");
		if (loginUser == null) {//로그인 상태가 아닌 경우
			model.addAttribute("msg", "로그인 상태가 아닙니다. 로그인을 먼저 해주세요");
			model.addAttribute("url", "/shop/login.do");
		    return "alert/error";
		}
		return "/delivery/deliveryPost";
	}
	
	//배달음식 나누기 글쓰기
	@RequestMapping("/shop/insertDelivery.do")
	public String insertDelivery(
			HttpSession session,
			DeliveryPostCommand deliveryPostCommand,
			Model model) throws Exception {
		//현재 로그인중인 회원 가져오기
		UserInfo loginUser = (UserInfo)session.getAttribute("loginMember");
		if (loginUser == null) {//로그인 상태가 아닌 경우
			model.addAttribute("msg", "로그인 상태가 아닙니다. 로그인을 먼저 해주세요");
	        model.addAttribute("url", "/shop/login.do");
	        return "alert/error";
		}
		
		DeliveryPost deliveryPost = new DeliveryPost();
		deliveryPost.setDeliveryCategoryId(deliveryPostCommand.getDeliveryCategoryId());
		deliveryPost.setUserId(loginUser.getUserId());
		deliveryPost.setNickname(loginUser.getNickname());
		deliveryPost.setTitle(deliveryPostCommand.getTitle());
		deliveryPost.setContent(deliveryPostCommand.getContent());
		Date now = new Date();
		deliveryPost.setWrittenDate(now);
		deliveryPost.setAddress(deliveryPostCommand.getAddress());
		deliveryPost.setFoodName(deliveryPostCommand.getFoodName());
		deliveryPost.setComplete("n");
		deliveryPost.setParticipantList("");
		
		deliveryService.insertDeliveryPost(deliveryPost);
		
		return "redirect:/shop/deliveryMain.do";
	}
	
	//이웃 커뮤니티 거래 글쓰기 폼 이동
		@RequestMapping("/shop/sellForm.do")
		public String sellForm(
				HttpSession session,
				ModelMap model) throws Exception {
			//현재 로그인중인 회원 가져오기
			UserInfo loginUser = (UserInfo)session.getAttribute("loginMember");
			if (loginUser == null) {//로그인 상태가 아닌 경우
				model.addAttribute("msg", "로그인 상태가 아닙니다. 로그인을 먼저 해주세요");
				model.addAttribute("url", "/shop/login.do");
			    return "alert/error";
			}
			return "/sell/sellPost";
		}
		
		//배달음식 나누기 글쓰기
		@RequestMapping("/shop/insertSell.do")
		public String insertSell(
				HttpSession session,
				SellPostCommand sellPostCommand,
				Model model) throws Exception {
			//현재 로그인중인 회원 가져오기
			UserInfo loginUser = (UserInfo)session.getAttribute("loginMember");
			if (loginUser == null) {//로그인 상태가 아닌 경우
				model.addAttribute("msg", "로그인 상태가 아닙니다. 로그인을 먼저 해주세요");
		        model.addAttribute("url", "/shop/login.do");
		        return "alert/error";
			}
			
			SellPost sellPost = new SellPost();
			sellPost.setSellCategoryId(sellPostCommand.getSellCategoryId());
			sellPost.setUserId(loginUser.getUserId());
			sellPost.setNickname(loginUser.getNickname());
			sellPost.setTitle(sellPostCommand.getTitle());
			sellPost.setContent(sellPostCommand.getContent());
			Date now = new Date();
			sellPost.setWrittenDate(now);
			sellPost.setComplete("n");
			
			sellService.insertSellPost(sellPost);
			
			return "redirect:/shop/sellMain.do";
		}
}
