package com.example.demo.controller;

public class SellPostCommand {

	private String title;
	private String content;
	private int sellCategoryId;	//form 정의 시 value값은 id로 하고 보여지는 건 카테고리 이름으로

	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	
	public String getContent() {return content;}
	public void setContent(String content) {this.content = content;}
	
	public int getSellCategoryId() {return sellCategoryId;}
	public void setSellCategoryId(int sellCategoryId) {this.sellCategoryId = sellCategoryId;}
}
