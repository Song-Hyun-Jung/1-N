package com.example.demo.controller;

public class UserCommand {

	//회원가입
	private String email; //로그인 id로 사용
	private String name;
	private String nickname;
	private String password;
	private String checkPassword; //비밀번호 재확인
	private String phone;
	private String address; //주문 주소
	private String payment; //결제 정보
	
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getNickname() { return nickname; }
	public void setNickname(String nickname) { this.nickname = nickname; }
	
	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }
	
	public String getCheckPassword() { return checkPassword; }
	public void setCheckPassword(String checkPassword) { this.checkPassword = checkPassword; }
	
	public String getPhone() { return phone; }
	public void setPhone(String phone) { this.phone = phone; }
	
	public String getAddress() { return address; }
	public void setAddress(String address) { this.address = address; }
	
	public String getPayment() { return payment; }
	public void setPayment(String payment) { this.payment = payment; }
	
	/*
	//회원정보 수정
	private String nickname;
	private String password;
	private String phone;
	private String address; //주문 주소
	private String payment; //결제 정보
	
	public String getNickname() { return nickname; }
	public void setNickname(String nickname) { this.nickname = nickname; }
	
	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }
	
	public String getPhone() { return phone; }
	public void setPhone(String phone) { this.phone = phone; }
	
	public String getAddress() { return address; }
	public void setAddress(String address) { this.address = address; }
	
	public String getPayment() { return payment; }
	public void setPayment(String payment) { this.payment = payment; }
	*/

}
