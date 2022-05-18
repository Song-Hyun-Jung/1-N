package com.example.demo.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.OrderInfo;

@Mapper
public interface OrderInfoMapper {
//	주문을 넣는다
	void insertOrder(OrderInfo order);
	
//	userId로 orderInfo List
	List<OrderInfo> getOrdersByUserId(int userId);
	
//	itemId로 orderInfo List
	List<OrderInfo> getOrdersByItemId(int itemId);

//	OrderId로 OrderInfo객체
	OrderInfo getOrder(int orderId);
}
