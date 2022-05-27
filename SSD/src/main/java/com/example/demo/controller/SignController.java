package com.example.demo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.TooMuchFacade;

@Controller
public class SignController {

//	private TooMuchFacade tooMuchFacade;
	
//	@Autowired
//	public void setFacade(TooMuchFacade tooMuchFacade) {
//		this.tooMuchFacade = tooMuchFacade;
//	}
	
	@RequestMapping("/shop/login.do")
	public ModelAndView myPageView() throws Exception{
		ModelAndView mav = new ModelAndView();
		System.out.println("signcontroller");
		mav.setViewName("user/login");
		return mav;
	}
	
	// 메인페이지 -> 로그인페이지 이동
//    @RequestMapping(value = "/user/login")
//    public String login(Model model, HttpSession session) {
//    	
//		return "user/login";
//    }
	
	// 로그아웃(세션제거)
//		@RequestMapping(value = "/shop/logout.do")
//		public String logoutDo(HttpServletRequest request) {
//			HttpSession session = request.getSession();
//			session.removeAttribute("loginMember");
//			
//			return "redirect:/";
//		}
	
	// 로그인 시도
//		@RequestMapping(value="/user/login.do")
//		public String loginDo(
//				HttpServletRequest request,
//				HttpServletResponse response,
//				Model model,
//				@RequestParam ("email") String member_id,
//	    		@RequestParam ("password") String member_pw) throws IOException {
//			
//			String saveId = request.getParameter("saveId");
//			model.addAttribute("url", "/user/login");
//			return "alert/success";
//		}
	
//	회원가입
//	@RequestMapping(value="/user/register.do")
//	public ModelAndView joinDo(
//			HttpServletRequest request,
//			Model model,
//			@RequestParam ("email") String email,
//    		@RequestParam ("password") String password,
//    		@RequestParam ("name") String name,
//    		@RequestParam ("nickname") String nickname,
//    		@RequestParam ("phone") String phone,
//			@RequestParam ("address") String address,
//			@RequestParam ("payment") String payment) {
//		ModelAndView mav = new ModelAndView();
//		
//		if (memberService.checkId(member_id) == null && memberService.checkNick(member_nickName) == null) {
//			Member member = new Member(member_id, member_pw, member_name, member_nickName, member_phone,
//					member_birth, sick_code, member_allergy, member_image, member_sex);
//			memberService.insertMember(member);
//			mav.setViewName("alert/success");
//			model.addAttribute("msg", "가입을 축하합니다! 로그인을 해주세요");
//	        model.addAttribute("url","/user/login");
//	        return mav;
//		}
//	}

//	@GetMapping
//	public String login(Model model) {
//        
//        return "user/login";
//    }
//	public ModelAndView handleRequest(HttpServletRequest request) throws Exception {
//		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("login");
//		return mav;
//		UserInfo user = tooMuchFacade.get
//		Account account = petStore.getAccount(username, password);
//		if (account == null) {
//			return new ModelAndView("Error", "message", 
//					"Invalid username or password.  Signon failed.");
//		}
//		else {
//			UserSession userSession = new UserSession(account);
//			PagedListHolder<Product> myList = new PagedListHolder<Product>(this.petStore.getProductListByCategory(account.getFavouriteCategoryId()));
//			myList.setPageSize(4);
//			userSession.setMyList(myList);
//			model.addAttribute("userSession", userSession);
//			if (forwardAction != null) 
//				return new ModelAndView("redirect:" + forwardAction);
//			else 
//				return new ModelAndView("index");
//		}
//	}
}
