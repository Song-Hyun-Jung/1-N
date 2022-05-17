package com.example.demo.domain;

import java.util.Date;

public class SellPost {
	private int postId;		//시퀀스로 생성
	private int sellCategoryId;	
	private int userId;
	private String title;
	private Date writtenDate;
	private String content;
	private boolean complete;		//완료 여부
	
	public int getPostId() {return postId;}
	public void setPostId(int postId) {this.postId = postId;}
	
	public int getSellCategoryId() {return sellCategoryId;}
	public void setSellCategoryId(int sellCategoryId) {this.sellCategoryId = sellCategoryId;}
	
	public int getUserId() {return userId;}
	public void setUserId(int userId) {this.userId = userId;}
	
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	
	public Date getWrittenDate() {return writtenDate;}
	public void setWrittenDate(Date writtenDate) {this.writtenDate = writtenDate;}
	
	public String getContent() {return content;}
	public void setContent(String content) {this.content = content;}
	
	public boolean isComplete() {return complete;}
	public void setComplete(boolean complete) {this.complete = complete;}
	
}
