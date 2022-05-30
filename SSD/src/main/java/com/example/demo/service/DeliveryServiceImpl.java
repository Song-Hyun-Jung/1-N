package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DeliveryPostDAO;
import com.example.demo.domain.DeliveryComment;
import com.example.demo.domain.DeliveryPost;

@Service
public class DeliveryServiceImpl implements DeliveryService{
	@Autowired
	private DeliveryPostDAO deliveryPostDao;
	
	@Override
	public DeliveryPost getDeliveryPost(int postId){
		return deliveryPostDao.getDeliveryPost(postId);
	}
	
	@Override
	public List<DeliveryComment> getAllDeliveryComments(int postId){
		return deliveryPostDao.getAllDeliveryComments(postId);
	}
}
