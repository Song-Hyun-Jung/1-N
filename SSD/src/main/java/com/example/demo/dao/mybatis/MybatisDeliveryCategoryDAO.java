package com.example.demo.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.DeliveryCategoryDAO;
import com.example.demo.dao.mybatis.mapper.DeliveryCategoryMapper;
import com.example.demo.domain.DeliveryCategory;

@Repository
public class MybatisDeliveryCategoryDAO implements DeliveryCategoryDAO{
	@Autowired
	private DeliveryCategoryMapper deliveryCategoryMapper;

	@Override
	public List<DeliveryCategory> getDeliveryCategoryList() throws DataAccessException {
		return deliveryCategoryMapper.getDeliveryCategoryList();
	}

	@Override
	public String getDeliveryCategoryName(int deliveryCategoryId) throws DataAccessException {
		return deliveryCategoryMapper.getDeliveryCategoryName(deliveryCategoryId);
	}
	
}
