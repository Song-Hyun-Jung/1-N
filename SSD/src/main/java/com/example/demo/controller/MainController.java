package com.example.demo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.UserInfo;

@Controller
public class MainController {

	@RequestMapping("/")
	public ModelAndView main(HttpServletRequest request) throws IOException {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		
		System.out.println("MainController");
		
		HttpSession session = request.getSession();
		UserInfo user = (UserInfo) session.getAttribute("loginMember");
		if (user == null) {//로그인 상태가 아닌 경우
			mav.addObject("ses", 0);
			System.out.println("MainController - 로그인 기록 없음");
		} 
		else {
			mav.addObject("ses", 1);//로그인 상태인 경우
			System.out.println("MainController - 로그인성공");
			mav.addObject("user_email", user.getEmail());
			mav.addObject("user_nickName", user.getNickname());
		}
		return mav;
	}
}
