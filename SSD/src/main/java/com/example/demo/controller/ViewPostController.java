package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.DeliveryComment;
import com.example.demo.domain.DeliveryPost;
import com.example.demo.domain.UserInfo;
import com.example.demo.service.DeliveryService;
import com.example.demo.service.UserService;

@Controller
public class ViewPostController {
	
	//배달음식 게시글 상세보기
	@Autowired
	private DeliveryService deliveryService;
	@Autowired
	private UserService userService;
	
	@RequestMapping("/shop/viewDeliveryPost.do")
	public ModelAndView getDeliveryPost(
			@RequestParam("deliveryPostId") int deliveryPostId, HttpSession session) throws Exception{
		DeliveryPost deliveryPost = deliveryService.getDeliveryPost(deliveryPostId); //post정보 가져오기
		System.out.println("게시글 상세보기: " + deliveryPost.getPostId() + " " + deliveryPost.getTitle());
		UserInfo writtenUser = userService.getUserByUserId(deliveryPost.getUserId());//작성자 닉네임 가져오기
		System.out.println("게시글 작성자: " + writtenUser.getNickname());
		String participants = deliveryPost.getParticipantList();
		System.out.println("참여자: " + participants);
		
		//post에 달린 댓글가져오기
		List<DeliveryComment> deliveryComments = deliveryService.getAllDeliveryComments(deliveryPostId);
		
		//현재 로그인중인 회원 가져오기
		UserInfo loginUser = (UserInfo)session.getAttribute("loginMember");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("deliveryPost", deliveryPost);//글 정보 
		mav.addObject("writtenUser", writtenUser); //글 작성자 userInfo 객체
		mav.addObject("deliveryComments", deliveryComments); //댓글들
		mav.addObject("loginUser", loginUser); //현재 로그인 중인 유저 userInfo 객체
		mav.setViewName("delivery/deliveryDetail");
		return mav;
	}
}
