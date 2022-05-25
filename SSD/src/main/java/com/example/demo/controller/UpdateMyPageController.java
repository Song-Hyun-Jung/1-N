package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.UserInfo;
import com.example.demo.service.UserService;

@Controller
public class UpdateMyPageController {
	
	@Autowired
	UserService userService;

	@RequestMapping("/shop/mypageUpdate.do")
	public String myPageUpdate(HttpServletRequest request, HttpSession session, UpdateUserCommand updateUserCommand) throws Exception{
		
		updateUserCommand.setEmail((String)session.getAttribute("loginUserEmail"));
		
		int updateSuccess = userService.updateUser(updateUserCommand);
		System.out.println("user정보 수정: " + updateSuccess);
		
		return "redirect:/shop/mypageView.do";
	}
	
	
}
