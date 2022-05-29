package com.example.demo.domain;

import java.util.ArrayList;
import java.util.Date;

public class DeliveryPost {
	private int postId;		//시퀀스로 생성
	private int deliveryCategoryId;	
	private int userId;
	private String title;
	private Date writtenDate;
	private String address;
	private String foodName;
	private String complete;		//완료 여부
	//private ArrayList<UserInfo> participantList;	//참여자 리스트
	private String participantList;
	//private String participantListNickname;		//참여자 닉네임 문자열
	
	public int getPostId() {return postId;}
	public void setPostId(int postId) {this.postId = postId;}
	
	public int getDeliveryCategoryId() {return deliveryCategoryId;}
	public void setDeliveryCategoryId(int deliveryCategoryId) {this.deliveryCategoryId = deliveryCategoryId;}
	
	public int getUserId() {return userId;}
	public void setUserId(int userId) {this.userId = userId;}
	
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	
	public Date getWrittenDate() {return writtenDate;}
	public void setWrittenDate(Date writtenDate) {this.writtenDate = writtenDate;}
	
	public String getAddress() {return address;}
	public void setAddress(String address) {this.address = address;}
	
	public String getFoodName() {return foodName;}
	public void setFoodName(String foodName) {this.foodName = foodName;}
	
	public String getComplete() {return complete;}
	public void setComplete(String complete) {this.complete = complete;}
	
	/*
	public ArrayList<UserInfo> getParticipantList() {return participantList;}
	public void setParticipantList(ArrayList<UserInfo> participantList) {this.participantList = participantList;}
	*/
	
	public String getParticipantList() { return participantList; }
	public void setParticipantList(String participantList) { this.participantList = participantList; }
	
	
	/*
	public String getParticipantListNickname() {
		String nicknames = "";
		for(UserInfo u : participantList) {
			nicknames += u.getNickname();			
		}
		return nicknames;
	}
	public void setParticipantListNickname(String participantListNickname) { this.participantListNickname = participantListNickname;}

	*/
	
	
}
