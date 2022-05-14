package com.example.demo.controller;

import java.io.Serializable;
import org.springframework.beans.support.PagedListHolder;

import com.example.demo.domain.UserInfo;

@SuppressWarnings("serial")
public class UserSession implements Serializable {


	//private PagedListHolder<Product> myList;
	private UserInfo userInfo;

	public UserSession(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	/*
	public void setMyList(PagedListHolder<Product> myList) {
		this.myList = myList;
	}

	public PagedListHolder<Product> getMyList() {
		return myList;
	}
	*/
}