package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CartDAO;
import com.example.demo.dao.OrderInfoDAO;
import com.example.demo.dao.ShoppingCategoryDAO;
import com.example.demo.dao.ShoppingItemDAO;
import com.example.demo.dao.UserInfoDAO;
import com.example.demo.domain.Cart;
import com.example.demo.domain.OrderInfo;
import com.example.demo.domain.ShoppingCategory;
import com.example.demo.domain.ShoppingItem;

@Service
public class ShoppingService_jinhee {
	
	@Autowired
	private CartDAO cartDAO;
	
	@Autowired
	private ShoppingItemDAO shoppingItemDAO;
	
	@Autowired
	private UserInfoDAO userInfoDAO;
	
	@Autowired
	private OrderInfoDAO orderInfoDAO;
	
	@Autowired
	private ShoppingCategoryDAO shoppingCategoryDAO;
	
	public List<ShoppingItem> getTop3Item() {
		return shoppingItemDAO.getTop3Item();
	}
	
	public Cart getCart(int cartId) {
		return cartDAO.getCart(cartId);
	}

	public void insertCart(Cart cart) {
		cartDAO.insertCart(cart);  
	}

	public void deleteCart(int cartId) {
		cartDAO.deleteCart(cartId);
	}
	
	public List<Cart> getCartByUserId(int userId) {
		return cartDAO.getCartByUserId(userId);
	}
	
	public void insertOrder(OrderInfo order) {
		orderInfoDAO.insertOrder(order);
	}
	
	public ShoppingItem getItem(int shoppingItemId) {
		return shoppingItemDAO.getItem(shoppingItemId);
	}
	
	public List<ShoppingItem> itemSearch(String keyword) {
		return shoppingItemDAO.itemSearch(keyword);
	}
	
	public List<ShoppingItem> getItemsByCategoryId(int shoppingCategoryId) {
		return shoppingItemDAO.getItemsByCategoryId(shoppingCategoryId);
	}
	
	public List<ShoppingItem> getItemSortByHighPrice(int shoppingCategoryId) {
		return shoppingItemDAO.getItemSortByHighPrice(shoppingCategoryId);
	}

	public List<ShoppingItem> getItemSortByLowPrice(int shoppingCategoryId) {
		return shoppingItemDAO.getItemSortByLowPrice(shoppingCategoryId);
	}
	
	public List<ShoppingItem> getItemSortBySoldQuantity(int shoppingCategoryId) {
		return shoppingItemDAO.getItemSortBySoldQuantity(shoppingCategoryId);
	}
	
	public List<ShoppingCategory> getAllCategory() {
		return shoppingCategoryDAO.getAllCategory();
	}
	
	public String getNameByCategoryId(int shoppingCategoryId) {
		return shoppingCategoryDAO.getNameByCategoryId(shoppingCategoryId);
	}
	
	public String getDescriptionByCategoryId(int shoppingCategoryId) {
		return shoppingCategoryDAO.getDescriptionByCategoryId(shoppingCategoryId);
	}
}