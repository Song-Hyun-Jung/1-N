package com.example.demo.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DeliveryCategory implements Serializable{

	private int deliveryCategoryId;
	private int name;
	
	public int getDeliveryCategoryId() {
		return deliveryCategoryId;
	}
	public void setDeliveryCategoryId(int deliveryCategoryId) {
		this.deliveryCategoryId = deliveryCategoryId;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	
}
