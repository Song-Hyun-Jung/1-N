package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.DeliveryComment;
import com.example.demo.domain.SellComment;
import com.example.demo.domain.UserInfo;
import com.example.demo.service.DeliveryService;
import com.example.demo.service.SellService;
import com.example.demo.service.UserService;

@Controller
public class AddCommentController {
	
	@Autowired
	private DeliveryService deliveryService;
	@Autowired
	private SellService sellService;
	@Autowired
	private UserService userService;
	
	//배달음식 댓글 등록
	@RequestMapping("/shop/insertDComment.do")
	public String insertDeliveryComment(HttpSession session, AddDCommentCommand addDCommentCommand, Model model) {
		System.out.println("댓글등록-postId: " + addDCommentCommand.getDeliveryPostId() + "댓글 내용: " + addDCommentCommand.getComments());
		
		//현재 로그인중인 회원 가져오기
		UserInfo loginUser = (UserInfo)session.getAttribute("loginMember");
		if (loginUser == null) {//로그인 상태가 아닌 경우
			model.addAttribute("msg", "로그인 상태가 아닙니다. 로그인을 먼저 해주세요");
	        model.addAttribute("url", "/shop/login.do");
	        return "alert/error";
		}
		
		DeliveryComment deliveryComment = new DeliveryComment();
		deliveryComment.setUserId(loginUser.getUserId());
		deliveryComment.setChoice("n");
		deliveryComment.setComments(addDCommentCommand.getComments());
		deliveryComment.setPostId(Integer.parseInt(addDCommentCommand.getDeliveryPostId()));
		
		deliveryService.insertDeliveryComment(deliveryComment);
		
		
		return "redirect:/shop/viewDeliveryPost.do?deliveryPostId=" + addDCommentCommand.getDeliveryPostId();
	}
	
	//이웃간 거래 댓글 등록
		@RequestMapping("/shop/insertSComment.do")
		public String insertSellComment(HttpSession session, AddSCommentCommand addSCommentCommand, Model model) {
			System.out.println("댓글등록-postId: " + addSCommentCommand.getSellPostId() + "댓글 내용: " + addSCommentCommand.getComments());
	
			//현재 로그인중인 회원 가져오기
			UserInfo loginUser = (UserInfo)session.getAttribute("loginMember");
			if (loginUser == null) {//로그인 상태가 아닌 경우
				model.addAttribute("msg", "로그인 상태가 아닙니다. 로그인을 먼저 해주세요");
		        model.addAttribute("url", "/shop/login.do");
		        return "alert/error";
			}
					
			SellComment sellComment = new SellComment();
			sellComment.setUserId(loginUser.getUserId());
			sellComment.setComments(addSCommentCommand.getComments());
			sellComment.setPostId(Integer.parseInt(addSCommentCommand.getSellPostId()));
			
			sellService.insertSellComment(sellComment);
			
			
			return "redirect:/shop/viewSellPost.do?sellPostId=" + addSCommentCommand.getSellPostId();
		}
	
}
