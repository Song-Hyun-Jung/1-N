package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.DeliveryPost;
import com.example.demo.service.DeliveryService;
import com.example.demo.service.UserService;

@Controller
public class UpdatePostController {
	
	@Autowired
	private DeliveryService deliveryService;
	@Autowired
	private UserService userService;
	
		//commentId 추가해야함
		//참여자 선택
		@RequestMapping("/shop/choosePart.do")
		public String updateParticipantList(
				@RequestParam("chooseNickname") String chooseNickname, @RequestParam("deliveryPostId") int deliveryPostId, HttpSession session) throws Exception{
			DeliveryPost deliveryPost = deliveryService.getDeliveryPost(deliveryPostId); //post정보 가져오기
			String participantList = deliveryPost.getParticipantList();
			String newParticipantList = participantList + ", " + chooseNickname;
			
			int updateResult = deliveryService.updateParticipantList(newParticipantList, deliveryPostId);
			System.out.println("참여자 선택 업데이트 결과: " + updateResult);
			return "redirect:/shop/viewDeliveryPost.do?deliveryPostId=" + deliveryPostId;
			
		}

}
