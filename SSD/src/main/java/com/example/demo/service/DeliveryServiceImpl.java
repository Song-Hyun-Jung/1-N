package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DeliveryCommentDAO;
import com.example.demo.dao.DeliveryPostDAO;
import com.example.demo.domain.DeliveryComment;
import com.example.demo.domain.DeliveryPost;

@Service
public class DeliveryServiceImpl implements DeliveryService{
	@Autowired
	private DeliveryPostDAO deliveryPostDao;
	@Autowired
	private DeliveryCommentDAO deliveryCommentDao;
	
	//글 상세정보 보기위해 글정보, 댓글들 가져오기
	@Override
	public DeliveryPost getDeliveryPost(int postId){
		return deliveryPostDao.getDeliveryPost(postId);
	}
	
	@Override
	public List<DeliveryComment> getAllDeliveryComments(int postId){
		return deliveryPostDao.getAllDeliveryComments(postId);
	}
	
	
	//참여자 추가 업데이트
	@Override
	public int updateParticipantList(String chooseNickname, int postId) {
		return deliveryPostDao.updateParticipantList(chooseNickname, postId);
	}
	
	//댓글등록
	@Override
	public int insertDeliveryComment(DeliveryComment deliveryComment) {
		return deliveryCommentDao.insertDeliveryComment(deliveryComment);
	}
	
	public List<DeliveryPost> getAllDeliveryPost() {
		return deliveryPostDao.getAllDeliveryPost();
	}
	
	public List<DeliveryPost> getDeliveryPostByCategoryId(int deliveryCategoryId) {
		return deliveryPostDao.getDeliveryPostByCategoryId(deliveryCategoryId);
	}
	
	public int insertDeliveryPost(DeliveryPost deliveryPost) {
		return deliveryPostDao.insertDeliveryPost(deliveryPost);
	}
}
