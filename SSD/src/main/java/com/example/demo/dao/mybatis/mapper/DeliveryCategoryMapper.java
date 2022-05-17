package com.example.demo.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.DeliveryCategory;

@Mapper
public interface DeliveryCategoryMapper {
	List<DeliveryCategory> getDeliveryCategoryList();
	String getDeliveryCategoryName(int deliveryCategoryId);
	
}
