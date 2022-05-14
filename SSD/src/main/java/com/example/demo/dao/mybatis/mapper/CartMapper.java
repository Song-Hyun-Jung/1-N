package com.example.demo.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import com.example.demo.domain.Cart;

@Mapper
public interface CartMapper {
	
	List<Cart> getCartByUserId(int userId);
	
	Cart getCart(int cartId);
	
	void insertCart(Cart cart);
	
	void deleteCart(int cartId);
	
}
