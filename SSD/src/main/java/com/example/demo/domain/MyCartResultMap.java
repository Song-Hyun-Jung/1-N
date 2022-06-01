package com.example.demo.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MyCartResultMap implements Serializable {
	private int cartId; 
	private int itemId;
	private String name;
	private int price;
	private int totalPrice;
	private int soldQuantity;
	private int totalQuantity;
	private int remainedQuantity;
	private String description;
	private String memo;
	private String image;	
	private int shoppingCategoryId;
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getSoldQuantity() {
		return soldQuantity;
	}
	public void setSoldQuantity(int soldQuantity) {
		this.soldQuantity = soldQuantity;
	}
	public int getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	public int getRemainedQuantity() {
		return remainedQuantity;
	}
	public void setRemainedQuantity(int remainedQuantity) {
		this.remainedQuantity = remainedQuantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getShoppingCategoryId() {
		return shoppingCategoryId;
	}
	public void setShoppingCategoryId(int shoppingCategoryId) {
		this.shoppingCategoryId = shoppingCategoryId;
	}
	
	
	
}
