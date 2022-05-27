package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import com.example.demo.domain.UserInfo;
import com.example.demo.service.UserService;

//@SessionAttributes("loginUserEmail")
@Controller
public class GoMyPageController {
	
	@Autowired
	UserService userService;
	
	/*
	@ModelAttribute("loginUser")
	public UserInfo createUser(HttpSession session) {
		UserInfo userInfo = (UserInfo)session.getAttribute("sessionCart");
		if (userInfo == null) userInfo = new UserInfo();
		return userInfo;
	}
	*/
	
	
	@RequestMapping("/shop/mypageView.do")
	public ModelAndView myPageView(HttpServletRequest request, HttpSession session, @ModelAttribute("updateUserCommand") UpdateUserCommand updateUserCommand) throws Exception{
		session.setAttribute("loginUserEmail", "som@gmail.com");
		String userEmail = (String)session.getAttribute("loginUserEmail"); //userInfo 객체 받는거 loginMember로 수정할것
		
		UserInfo userInfo = userService.getUserByEmail(userEmail);
		session.setAttribute("loginMember", userInfo);
		
		//UserInfo userInfo = (UserInfo)session.getAtttribute("loginMember");
		
	
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/myPage");
		mav.addObject("userInfo", userInfo);
		System.out.println(userInfo.getEmail());
		return mav;
	}
	
	
}
