package com.example.demo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.UserInfo;
import com.example.demo.service.TooMuchFacade;
import com.example.demo.service.UserService;

@Controller
public class SignController {
	@Autowired
	private TooMuchFacade tooMuchFacade;

	@Autowired
	UserService userService;
	
	@Autowired
	public void setFacade(TooMuchFacade tooMuchFacade) {
		this.tooMuchFacade = tooMuchFacade;
	}
	
	// 메인페이지 -> 로그인페이지 이동
	@RequestMapping("/shop/login.do")
	public ModelAndView loginView() throws Exception{
		ModelAndView mav = new ModelAndView();
		System.out.println("로그인 페이지로 이동");
		mav.setViewName("user/login");
		return mav;
	}
	
	//회원가입 페이지로 이동
	@RequestMapping("/shop/register.do")
	public ModelAndView registerView() throws Exception{
		ModelAndView mav = new ModelAndView();
		System.out.println("회원가입 페이지로 이동");
		mav.setViewName("user/register");
		return mav;
	}
	
//	로그인 페이지에서 -> 로그인 시도
	@SuppressWarnings("unused")
	@RequestMapping(value="/shop/login")
	public String loginDo(
			HttpServletRequest request,
			HttpServletResponse response,
			Model model,
			@RequestParam ("email") String email,
    		@RequestParam ("password") String password) throws IOException {
		
		UserInfo user = userService.getUserByEmail(email);
		
		
		if(user == null) {//받아온 이메일의 user가 없을 경우 ->로그인 실패
			System.out.println("여기");
			model.addAttribute("msg", "email이 존재하지 않습니다.");
	        model.addAttribute("url", "/shop/login.do");
	        return "alert/error";
			
		}else if(!(user.getPassword()).equals(password)){//email에 대한 비밀번호가 틀린경우
			System.out.println("여기2");
			model.addAttribute("msg", "비밀번호가 올바르지 않습니다.");
	        model.addAttribute("url", "/shop/login.do");
	        return "alert/error";
			
		}else {//로그인 성공 
			System.out.println("여기3");
			model.addAttribute("msg", user.getNickname() + "님 방문을 환영합니다");
			// 로그인 세션 처리 
			HttpSession session = request.getSession();
			session.setAttribute("loginMember", user);
			
			model.addAttribute("url","/");
			 return "alert/success";
		}
		
	}
	
	// 로그아웃(세션제거)
	@RequestMapping(value = "/shop/logout.do")
	public String logoutDo(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("loginMember");
	
		return "redirect:/";
	}
	
	
//	회원가입
	@RequestMapping(value="/shop/register")
	public ModelAndView joinDo(
			HttpServletRequest request,
			Model model,
			@RequestParam ("email") String email,
    		@RequestParam ("password") String password,
    		@RequestParam ("name") String name,
    		@RequestParam ("nickname") String nickname,
    		@RequestParam ("phone") String phone,
			@RequestParam ("address") String address,
			@RequestParam ("payment") String payment) {
		System.out.println("회원가입 시도");
		
		ModelAndView mav = new ModelAndView();
		
		UserInfo checkUserEmail = userService.getUserByEmail(email);
		UserInfo checkUserNickname = tooMuchFacade.getUserByNickname(nickname);
		UserInfo user;
		if(checkUserEmail != null) {//email 중복
			model.addAttribute("msg", "중복된 email이 존재합니다.");
	        model.addAttribute("url", "/shop/register.do");
	        mav.setViewName("alert/error");
			return mav;
		}else if(checkUserNickname != null) {//닉네임 중복
			model.addAttribute("msg", "중복된 닉네임이 존재합니다.");
	        model.addAttribute("url", "/shop/register.do");
	        mav.setViewName("alert/error");
			return mav;
			
		}else {
			user = new UserInfo(email, name, nickname, password, phone, address, payment);
		}
		
		tooMuchFacade.insertUser(user);
		System.out.println(user.getUserId());
		mav.setViewName("alert/success");
		model.addAttribute("msg", "가입을 축하합니다! 로그인을 해주세요");
	    model.addAttribute("url","/shop/login.do");
	    return mav;
		}
	}
