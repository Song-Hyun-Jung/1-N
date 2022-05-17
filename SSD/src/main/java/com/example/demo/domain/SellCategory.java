package com.example.demo.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SellCategory implements Serializable {
	private int sellCategoryId;
	private String name;
	
	
	public int getSellCategoryId() {
		return sellCategoryId;
	}
	public void setSellCategoryId(int sellCategoryId) {
		this.sellCategoryId = sellCategoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
