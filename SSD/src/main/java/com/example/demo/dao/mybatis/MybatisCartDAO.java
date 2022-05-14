package com.example.demo.dao.mybatis;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.CartDAO;
import com.example.demo.dao.DeliveryPost;
import com.example.demo.dao.SellPost;
import com.example.demo.dao.ShoppingItem;
import com.example.demo.dao.mybatis.mapper.CartMapper;
import com.example.demo.domain.Cart;

@Repository
public class MybatisUserCartDAO implements CartDAO{
	
	@Autowired
	private CartMapper cartMapper;
	
	  public List<Cart> getCartByUserId(int userId) throws DataAccessException{
		  return cartMapper.getCartByUserId(userId);
	  }

	  public Cart getCart(int cartId) throws DataAccessException{
		  return cartMapper.getCart(cartId);
	  }

	  public void insertCart(Cart cart) throws DataAccessException{
		  cartMapper.insertCart(cart);
	  }

	  public void deleteCart(int cartId) throws DataAccessException{
		  cartMapper.deleteCart(cartId);
	  }


}

