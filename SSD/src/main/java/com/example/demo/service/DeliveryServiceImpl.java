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
	
	//글 상세정보 보기위해 글정보, 댓글들 가져오기
	@Override
	public DeliveryPost getDeliveryPost(int postId){
		return deliveryPostDao.getDeliveryPost(postId);
	}
	
	@Override
	public List<DeliveryComment> getAllDeliveryComments(int postId){
		return deliveryPostDao.getAllDeliveryComments(postId);
	}
}
