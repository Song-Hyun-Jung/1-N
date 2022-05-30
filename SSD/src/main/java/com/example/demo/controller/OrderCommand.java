package com.example.demo.controller;

public class OrderCommand {
	private int quantity;		//구매할 상품 개수
	private int userId;		//구매자 id
	private int itemId;		//구매할 상품 id
	private String name;	//구매할 상품 이름
	private String phone;	//수신자 전화번호
	private String address; //수신자 주소
	private String payment; //결제정보
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userID) {
		this.userId = userID;
	}
	
	public int getItemId() {
		return itemId;
	}
	
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
}