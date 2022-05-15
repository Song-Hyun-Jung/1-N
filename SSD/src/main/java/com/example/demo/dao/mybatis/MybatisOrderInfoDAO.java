package com.example.demo.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.example.demo.dao.OrderInfoDAO;
import com.example.demo.dao.mybatis.mapper.OrderInfoMapper;
import com.example.demo.domain.OrderInfo;

public class MybatisOrderInfoDAO implements OrderInfoDAO {
	@Autowired
	private OrderInfoMapper orderInfoMapper;
	
	@Override
	public void insertOrder(OrderInfo order) throws DataAccessException {
		orderInfoMapper.insertOrder(order);
	}

	@Override
	public List<OrderInfo> getOrdersByUserId(int userId) throws DataAccessException {
		return orderInfoMapper.getOrdersByUserId(userId);
	}

	@Override
	public List<OrderInfo> getOrdersByItemId(int itemId) throws DataAccessException {
		return orderInfoMapper.getOrdersByItemId(itemId);
	}

	@Override
	public OrderInfo getOrder(int orderId) throws DataAccessException {
		return orderInfoMapper.getOrder(orderId);
	}

}
