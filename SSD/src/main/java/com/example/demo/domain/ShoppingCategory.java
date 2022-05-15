package com.example.demo.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ShoppingCategory implements Serializable {
	private int shoppingCategoryId;
	private String name;
	private String description;
	
	public int getShoppingCategoryId() {
		return shoppingCategoryId;
	}
	
	public void setShoppingCategoryId(int shoppingCategoryId) {
		this.shoppingCategoryId = shoppingCategoryId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ShoppingCategory [shoppingCategoryId=" + shoppingCategoryId + ", name=" + name + ", description="
				+ description + "]";
	}
}
