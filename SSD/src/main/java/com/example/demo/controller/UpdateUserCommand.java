package com.example.demo.controller;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class UpdateUserCommand {
	
	//회원정보 수정 command 객체
	@NotNull(message="닉네임 필수")
	private String nickname;
	@NotNull(message="비번 필수")
	private String password;
	@NotNull(message="전화 필수")
	private String phone;
	@NotNull(message="주소 필수")
	private String address; //주문 주소
	@NotNull(message="결제정보 필수")
	private String payment; //결제 정보
	private String email;
	
	public UpdateUserCommand() {}
	
	public UpdateUserCommand(String nickname, String password, String phone, String address, String payment,
			String email) {
		super();
		this.nickname = nickname;
		this.password = password;
		this.phone = phone;
		this.address = address;
		this.payment = payment;
		this.email = email;
	}
	
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
	
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	
	public UpdateUserCommand getUpdateUserCommand() { //이게 맞나....
		return new UpdateUserCommand(nickname, password, phone, address, payment, email);
	}
	

}
