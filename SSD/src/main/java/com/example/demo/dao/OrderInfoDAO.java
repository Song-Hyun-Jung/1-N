package com.example.demo.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.demo.domain.OrderInfo;

public interface OrderInfoDAO {
//	�ֹ��� �ִ´�
	void insertOrder(OrderInfo order) throws DataAccessException;
	
//	userId�� orderInfo List
	List<OrderInfo> getOrdersByUserId(int userId) throws DataAccessException;
	
//	itemId�� orderInfo List
	List<OrderInfo> getOrdersByItemId(int itemId) throws DataAccessException;

//	OrderId�� OrderInfo��ü
	OrderInfo getOrder(int orderId) throws DataAccessException;
}
