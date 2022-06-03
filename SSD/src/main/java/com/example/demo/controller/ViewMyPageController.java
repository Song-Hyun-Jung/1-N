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

import com.example.demo.domain.DeliveryPost;
import com.example.demo.domain.MyCartResultMap;
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
	
	//찜 목록 가져오기
	@RequestMapping("/shop/mypageCart.do")
	public ModelAndView mypageCart(HttpServletRequest request, HttpSession session) throws Exception{
		UserInfo userInfo = (UserInfo)session.getAttribute("loginMember");
		List<MyCartResultMap> myCartItemList = userService.getCartItemList(userInfo.getUserId());
		ModelAndView mav = new ModelAndView();
		mav.addObject("myCartItemList", myCartItemList);
		for(MyCartResultMap c : myCartItemList) {
			System.out.println("카트 아이디: " + c.getCartId() +  "카트 아이템: "+ c.getName() + " 아이템이미지: " + c.getImage() );
		}
		mav.addObject("myCartSize", myCartItemList.size()); //찜한 개수 보내기
		mav.addObject("same", 0);
		mav.setViewName("shopping/shoppingCart");
		return mav;
	}
	
	//내 판매글 가져오기
	@RequestMapping("/shop/mypageSell.do")
	public ModelAndView mypageSell(HttpServletRequest request, HttpSession session) throws Exception{
		UserInfo userInfo = (UserInfo)session.getAttribute("loginMember");
		List<SellPost> mySellPostList = userService.getMySellPostList(userInfo.getUserId());
		ModelAndView mav = new ModelAndView();
		mav.addObject("mySellPostList", mySellPostList);
		for(SellPost s : mySellPostList) {
			System.out.println("작성글: " + s.getTitle());
		}
		mav.setViewName("user/mySell");
		return mav;
	}
	
	//내 배달글 가져오기
	@RequestMapping("/shop/mypageDelivery.do")
	public ModelAndView mypageDelivery(HttpServletRequest request, HttpSession session) throws Exception{
		UserInfo userInfo = (UserInfo)session.getAttribute("loginMember");
		List<DeliveryPost> myDeliveryPostList = userService.getMyDeliveryPostList(userInfo.getUserId());
		ModelAndView mav = new ModelAndView();
		mav.addObject("myDeliveryPostList", myDeliveryPostList);
		for(DeliveryPost d : myDeliveryPostList) {
			System.out.println("작성글: " + d.getTitle());
		}
		mav.setViewName("user/myDelivery");
		return mav;
	}
	
}

