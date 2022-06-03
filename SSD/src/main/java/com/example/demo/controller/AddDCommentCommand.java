package com.example.demo.controller;

public class AddDCommentCommand {
	//댓글등록 delivery comment 객체
	private String deliveryPostId;
	private String comments;
	
	public String getDeliveryPostId() {
		return deliveryPostId;
	}
	public void setDeliveryPostId(String deliveryPostId) {
		this.deliveryPostId = deliveryPostId;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	

}
