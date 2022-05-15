package com.example.demo.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.demo.domain.OrderInfo;

public interface OrderInfoDAO {
//	주문을 넣는다
	void insertOrder(OrderInfo order) throws DataAccessException;
	
//	userId로 orderInfo List
	List<OrderInfo> getOrdersByUserId(int userId) throws DataAccessException;
	
//	itemId로 orderInfo List
	List<OrderInfo> getOrdersByItemId(int itemId) throws DataAccessException;

//	OrderId로 OrderInfo객체
	OrderInfo getOrder(int orderId) throws DataAccessException;
}
