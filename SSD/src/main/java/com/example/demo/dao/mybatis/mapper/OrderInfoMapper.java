package com.example.demo.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.OrderInfo;

@Mapper
public interface OrderInfoMapper {
//	�ֹ� �ִ´�
	void insertOrder(OrderInfo order);
	
//	userId�� orderInfo List
	List<OrderInfo> getOrdersByUserId(int userId);
	
//	itemId�� orderInfo List
	List<OrderInfo> getOrdersByItemId(int itemId);

//	OrderId�� OrderInfo��ü
	OrderInfo getOrder(int orderId);
}
