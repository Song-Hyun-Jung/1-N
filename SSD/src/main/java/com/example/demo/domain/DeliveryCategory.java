package com.example.demo.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DeliveryCategory implements Serializable{

	private int deliveryCategoryId;
	private String name;
	
	public int getDeliveryCategoryId() {
		return deliveryCategoryId;
	}
	public void setDeliveryCategoryId(int deliveryCategoryId) {
		this.deliveryCategoryId = deliveryCategoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
