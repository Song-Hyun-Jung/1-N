package com.example.demo.controller;

import java.util.Date;

public class SellPostCommand {

	private String title;
	private String userNickname;
	private String sellCategoryId;	//form 정의 시 value값은 id로 하고 보여지는 건 카테고리 이름으로
	private Date writtenDate;
	private String content;
	private String complete;		//일단 string 타입으로 받고 boolean으로 변환은 다른 곳에서?
	
	
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	
	public String getUserNickname() {return userNickname;}
	public void setUserNickname(String userNickname) {this.userNickname = userNickname;}
	
	public String getSellCategoryId() {return sellCategoryId;}
	public void setSellCategoryId(String sellCategoryId) {this.sellCategoryId = sellCategoryId;}
	
	public Date getWrittenDate() {return writtenDate;}
	public void setWrittenDate(Date writtenDate) {this.writtenDate = writtenDate;}
	
	public String getContent() {return content;}
	public void setContent(String content) {this.content = content;}
	
	public String getComplete() {return complete;}
	public void setComplete(String complete) {this.complete = complete;}

}
