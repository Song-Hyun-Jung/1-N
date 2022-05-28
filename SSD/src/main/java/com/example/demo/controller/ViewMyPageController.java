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
import com.example.demo.domain.SellPost;
import com.example.demo.domain.ShoppingItem;
import com.example.demo.domain.UserInfo;
import com.example.demo.service.UserService;

@Controller
public class ViewMyPageController {
	
	@Autowired
	UserService userService;
	
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
	public ModelAndView mypageCart(HttpServletRequest request, HttpSession session) throws Exception{
		UserInfo userInfo = (UserInfo)session.getAttribute("loginMember");
		List<ShoppingItem> myCartItemList = userService.getCartItemList(userInfo.getUserId());
		ModelAndView mav = new ModelAndView();
		mav.addObject("myCartItemList", myCartItemList);
		for(ShoppingItem s : myCartItemList) {
			System.out.println("카트아이템: " + s.getName() + " 아이템이미지: " + s.getImage() );
		}
		mav.addObject("myCartSize", myCartItemList.size());
		mav.setViewName("shopping/shoppingCart");
		return mav;
	}
	
	@RequestMapping("/shop/mypageSell.do")
	public ModelAndView mypageSell(HttpServletRequest request, HttpSession session) throws Exception{
		UserInfo userInfo = (UserInfo)session.getAttribute("loginMember");
		List<SellPost> mySellList = userService.getMySellPostList(userInfo.getUserId());
		ModelAndView mav = new ModelAndView();
		mav.addObject("mySellList", mySellList);
		for(SellPost s : mySellList) {
			System.out.println("작성글: " + s.getTitle());
		}
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

