package com.example.demo.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;
import com.example.demo.domain.Cart;


public interface CartDAO {
	
	  List<Cart> getCartByUserId(int userId) throws DataAccessException;

	  Cart getCart(int cartId) throws DataAccessException;

	  void insertCart(Cart cart) throws DataAccessException;

	  void deleteCart(int cartId) throws DataAccessException;

}
