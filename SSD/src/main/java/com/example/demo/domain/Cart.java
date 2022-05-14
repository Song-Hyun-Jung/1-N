package com.example.demo.domain;

import java.io.Serializable;

public class Cart implements Serializable { 
	//찜 목록 domain
	private int cartId; //시퀀스
	private int userId;
	private int itemId;
	private int quantity; //수량
	
	//getter, setter
	public int getCartId() { return cartId; }
	public void setCartId(int cartId) { this.cartId = cartId; }
	
	public int getUserId() { return userId; }
	public void setUserId(int userId) { this.userId = userId; }
	
	public int getItemId() { return itemId; }
	public void setItemId(int itemId) { this.itemId = itemId; }
	
	public int getQuantity() { return quantity; }
	public void setQuantity(int quantity) { this.quantity = quantity; }
	
	

}
