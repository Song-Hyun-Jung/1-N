package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.MyPurchaseResultMap;
import com.example.demo.domain.ShoppingItem;
import com.example.demo.domain.UserInfo;
import com.example.demo.service.UserService;

@Controller
public class ViewMyPageController {
	
	@Autowired
	UserService userService;
	/*
	@RequestMapping("/shop/mypageView.do")
	public ModelAndView myPageView(HttpServletRequest request, HttpSession session, @ModelAttribute("updateUserCommand") UpdateUserCommand updateUserCommand) throws Exception{
		session.setAttribute("loginUserEmail", "som@gmail.com");
		String userEmail = (String)session.getAttribute("loginUserEmail");
		
		UserInfo userInfo = userService.getUserByEmail(userEmail);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/myPage");
		mav.addObject("userInfo", userInfo);
		System.out.println(userInfo.getEmail());
		return mav;
	}
	*/
	
	//구매목록 가져오기
	@RequestMapping("/shop/mypagePurchase.do")
	public ModelAndView mypagePurchase(HttpServletRequest request, HttpSession session) throws Exception{
		UserInfo userInfo = (UserInfo)session.getAttribute("loginMember");
	
		List<MyPurchaseResultMap> myPurchaseItemList = userService.getPurchaseItemList(userInfo.getUserId());
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/myPurchase");
		mav.addObject("myPurchaseItemList", myPurchaseItemList);
		for(MyPurchaseResultMap s : myPurchaseItemList) {
			System.out.println("구매아이템: " + s.getName() + " 아이템이미지: " + s.getImage() + " 구매날짜: " + s.getOrderDate());
		}
		return mav;
	}
	
	@RequestMapping("/shop/mypageCart.do")
	public ModelAndView mypageCart() throws Exception{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("shopping/shoppingCart");
		return mav;
	}
	
	@RequestMapping("/shop/mypageSell.do")
	public ModelAndView mypageSell() throws Exception{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/mySell");
		return mav;
	}
	
	@RequestMapping("/shop/mypageDelivery.do")
	public ModelAndView mypageDelivery() throws Exception{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/myDelivery");
		return mav;
	}
	
}

