package com.example.demo.domain;

import java.io.Serializable;

public class Cart implements Serializable { 
	//찜 목록 domain
	private int cartId; //시퀀스
	private int userId;
	private int itemId;
	
	public Cart() {};
	public Cart(int userId, int itemId) {	//addItemToCart Controller에서 사용 addItem 할 때 사용
		this.userId = userId;
		this.itemId = itemId;
	}
	
	
	public Cart(int userId, int itemId, int cartId) {	//cartList 가져오는 거 구현 전 test하느라 만든 생성자, 나중에 지우긴
		super();
		this.cartId = cartId;
		this.userId = userId;
		this.itemId = itemId;
	}
	//getter, setter
	public int getCartId() { return cartId; }
	public void setCartId(int cartId) { this.cartId = cartId; }
	
	public int getUserId() { return userId; }
	public void setUserId(int userId) { this.userId = userId; }
	
	public int getItemId() { return itemId; }
	public void setItemId(int itemId) { this.itemId = itemId; }

}