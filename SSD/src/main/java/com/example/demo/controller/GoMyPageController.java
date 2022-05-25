package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import com.example.demo.domain.UserInfo;

//@SessionAttributes("loginUser")
@Controller
public class GoMyPageController {
	
	/*
	@ModelAttribute("loginUser")
	public UserInfo createUser(HttpSession session) {
		UserInfo userInfo = (UserInfo)session.getAttribute("sessionCart");
		if (userInfo == null) userInfo = new UserInfo();
		return userInfo;
	}
	*/
	
	@RequestMapping("/shop/myPageView.do")
	public ModelAndView myPageView() throws Exception{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/myPage");
		return mav;
	}
	
	


}
