package com.example.demo.controller;

public class UpdateUserCommand {
	
	//회원정보 수정 command 객체
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
	

}
