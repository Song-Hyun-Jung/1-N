package com.example.demo.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class OrderInfo implements Serializable {
	private int orderId;
	private Date orderDate;
	private int quantity;
	private int userID;
	private int itemId;
	
	public int getOrderId() {
		return orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public Date getOrderDate() {
		return orderDate;
	}
	
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getUserID() {
		return userID;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public int getItemId() {
		return itemId;
	}
	
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	@Override
	public String toString() {
		return "OrderInfo [orderId=" + orderId + ", orderDate=" + orderDate + ", quantity=" + quantity + ", userID="
				+ userID + ", itemId=" + itemId + "]";
	}
}
