package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

import com.example.demo.domain.UserInfo;
import com.example.demo.service.UpdateUserValidator;
import com.example.demo.service.UserService;

@Controller
public class UpdateMyPageController {
	
	@Autowired
	UserService userService;

	@RequestMapping("/shop/mypageUpdate.do")
	public String myPageUpdate(HttpServletRequest request, HttpSession session, Model model, @Valid UpdateUserCommand updateUserCommand, BindingResult result)throws Exception{
		UserInfo userInfo = (UserInfo)session.getAttribute("loginMember");
		updateUserCommand.setEmail(userInfo.getEmail());
		
		if(result.hasErrors()) {
			System.out.println(result);
			
			return "/user/myPage";
		}
		
		int updateSuccess = userService.updateUser(updateUserCommand);
		System.out.println("user정보 수정: " + updateSuccess);
		
		UserInfo newUserInfo = userService.getUserByEmail(userInfo.getEmail());
		session.setAttribute("loginMember", newUserInfo);
		
		
		return "redirect:/shop/mypageView.do";
		
		
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new UpdateUserValidator());
	}
	
}
