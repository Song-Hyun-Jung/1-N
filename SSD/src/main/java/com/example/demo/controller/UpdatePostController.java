package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.DeliveryPost;
import com.example.demo.domain.SellPost;
import com.example.demo.service.DeliveryService;
import com.example.demo.service.SellService;
import com.example.demo.service.UserService;

@Controller
public class UpdatePostController {
	
	@Autowired
	private DeliveryService deliveryService;
	@Autowired
	private SellService sellService;
	@Autowired
	private UserService userService;
	
		
		//참여자 선택
		@RequestMapping("/shop/choosePart.do")
		public String updateParticipantList(
				@RequestParam("chooseNickname") String chooseNickname, 
				@RequestParam("deliveryPostId") int deliveryPostId, 
				@RequestParam("commentId") int commentId,
				HttpSession session) throws Exception{
			DeliveryPost deliveryPost = deliveryService.getDeliveryPost(deliveryPostId); //post정보 가져오기
			String participantList = deliveryPost.getParticipantList();
			
			String newParticipantList = "";
			if(participantList != null)
				newParticipantList = participantList + ", " + chooseNickname;
			else
				newParticipantList = chooseNickname;
			
			int updateResult = deliveryService.updateParticipantList(newParticipantList, deliveryPostId, commentId);
			System.out.println("참여자 선택 업데이트 결과: " + updateResult);
			return "redirect:/shop/viewDeliveryPost.do?deliveryPostId=" + deliveryPostId;
			
		}
		
		
		@RequestMapping("/shop/updateDelivery.do")
		public String updateCompleteD( @RequestParam("deliveryPostId") int deliveryPostId) throws Exception{
			DeliveryPost deliveryPost = deliveryService.getDeliveryPost(deliveryPostId); //post정보 가져오기
			
			if(deliveryPost.getComplete().equals("y") | deliveryPost.getComplete().equals("Y")) deliveryPost.setComplete("n");
			else if (deliveryPost.getComplete().equals("n") | deliveryPost.getComplete().equals("N")) deliveryPost.setComplete("y");
			
			deliveryService.updateDeliveryPost(deliveryPost);

			return "redirect:/shop/viewDeliveryPost.do?deliveryPostId=" + deliveryPostId;
		}
		
		//자취생간 거래 완료 여부 update
		@RequestMapping("/shop/updateSell.do")
		public String updateCompletS( @RequestParam("sellPostId") int sellPostId) throws Exception{
			SellPost sellPost = sellService.getSellPost(sellPostId); //post정보 가져오기

			if(sellPost.getComplete().equals("y") | sellPost.getComplete().equals("Y")) sellPost.setComplete("n");
			else if (sellPost.getComplete().equals("n") | sellPost.getComplete().equals("N")) sellPost.setComplete("y");
			
			sellService.updateSellPost(sellPost);

			return "redirect:/shop/viewSellPost.do?sellPostId=" + sellPostId;
					
		}

}
