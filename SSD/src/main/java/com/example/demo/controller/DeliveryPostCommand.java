package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Date;

public class DeliveryPostCommand {
	
	private String title;
	private String userNickname;
	private String deliveryCategoryId;		//form 정의 시 value값은 id로 하고 보여지는 건 카테고리 이름으로
	private Date writtenDate;
	private String foodName;
	private String partNum;		//나눌 인원
	private String address;		//대략적 주소
	private String complete;		//일단 string 타입으로 받고 boolean으로 변환은 다른 곳에서?
	private ArrayList<String> participantList;		//db에서 list로 해서 list로 수정했는데 나중에 복잡하면 다시 String으로 하기
	
	
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	
	public String getUserNickname() {return userNickname;}
	public void setUserNickname(String userNickname) {this.userNickname = userNickname;}
	
	public String getDeliveryCategoryId() {return deliveryCategoryId;}
	public void setDeliveryCategoryId(String deliveryCategoryId) {this.deliveryCategoryId = deliveryCategoryId;}
	
	public Date getWrittenDate() {return writtenDate;}
	public void setWrittenDate(Date writtenDate) {this.writtenDate = writtenDate;}
	
	public String getFoodName() {return foodName;}
	public void setFoodName(String foodName) {this.foodName = foodName;}
	
	public String getPartNum() {return partNum;}
	public void setPartNum(String partNum) {this.partNum = partNum;}
	
	public String getAddress() {return address;}
	public void setAddress(String address) {this.address = address;}
	
	public String getComplete() {return complete;}
	public void setComplete(String complete) {this.complete = complete;}
	
	public ArrayList<String> getParticipantList() {return participantList;}
	public void setParticipantList(ArrayList<String> participantList) {this.participantList = participantList;}
}
