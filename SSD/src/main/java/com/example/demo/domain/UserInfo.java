package com.example.demo.domain;

import java.io.Serializable;


@SuppressWarnings("serial")
public class UserInfo implements Serializable{
	private int userId; //시퀀스
	private String email; //로그인 id로 사용
	private String name;
	private String nickname;
	private String password;
	private String phone;
	private String address; //주문 주소
	private String payment; //결제 정보
	
	public UserInfo() {}
	
	public UserInfo(String email, String name, String nickname, String password, String phone,
			String address, String payment) {
		super();
		this.email = email;
		this.name = name;
		this.nickname = nickname;
		this.password = password;
		this.phone = phone;
		this.address = address;
		this.payment = payment;
	}
	public UserInfo(int userId, String email, String name, String nickname, String password, String phone,
			String address, String payment) {
		super();
		this.userId = userId;
		this.email = email;
		this.name = name;
		this.nickname = nickname;
		this.password = password;
		this.phone = phone;
		this.address = address;
		this.payment = payment;
	}
	//getter, setter 
	public int getUserId() { return userId; }
	public void setUserId(int userId) { this.userId = userId; }
	
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
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
