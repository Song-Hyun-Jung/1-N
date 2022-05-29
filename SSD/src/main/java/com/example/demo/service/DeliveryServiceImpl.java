package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DeliveryPostDAO;
import com.example.demo.domain.DeliveryPost;

@Service
public class DeliveryServiceImpl implements DeliveryService{
	@Autowired
	private DeliveryPostDAO deliveryPostDao;
	
	@Override
	public DeliveryPost getDeliveryPost(int postId){
		return deliveryPostDao.getDeliveryPost(postId);
	}
}
