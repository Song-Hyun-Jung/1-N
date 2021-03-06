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

@Controller
public class GoMyPageController {
	
	@Autowired
	UserService userService;
	
	
	@RequestMapping("/shop/mypageView.do")
	public ModelAndView myPageView(HttpServletRequest request, HttpSession session, @ModelAttribute("updateUserCommand") UpdateUserCommand updateUserCommand) throws Exception{
		UserInfo userInfo = (UserInfo)session.getAttribute("loginMember");

		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/myPage");
		mav.addObject("userInfo", userInfo);
		System.out.println(userInfo.getEmail());
		return mav;
	}
	
	
	/*
	 //타임리프로 구현한 페이지로 이동하기 위한 컨트롤러
	@RequestMapping("/shop/mypageView.do")
	public ModelAndView myPageView(HttpServletRequest request, HttpSession session, @ModelAttribute("updateUserCommand") UpdateUserCommand updateUserCommand) throws Exception{
		UserInfo userInfo = (UserInfo)session.getAttribute("loginMember");

		ModelAndView mav = new ModelAndView();
		mav.setViewName("thyme/mypageMenu");
		mav.addObject("userInfo", userInfo);
		System.out.println(userInfo.getEmail());
		return mav;
	}
	*/
}
