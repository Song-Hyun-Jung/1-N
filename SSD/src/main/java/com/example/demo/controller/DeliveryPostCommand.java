package com.example.demo.controller;

public class DeliveryPostCommand {
	
	private String title;
	private String content;
	private int deliveryCategoryId;		//form 정의 시 value값은 id로 하고 보여지는 건 카테고리 이름으로
	private String foodName;
	private String address;		//대략적 주소

	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	
	public String getContent() {return content;}
	public void setContent(String content) {this.content = content;}
	
	public int getDeliveryCategoryId() {return deliveryCategoryId;}
	public void setDeliveryCategoryId(int deliveryCategoryId) {this.deliveryCategoryId = deliveryCategoryId;}
	
	public String getFoodName() {return foodName;}
	public void setFoodName(String foodName) {this.foodName = foodName;}
	
	public String getAddress() {return address;}
	public void setAddress(String address) {this.address = address;}
}
