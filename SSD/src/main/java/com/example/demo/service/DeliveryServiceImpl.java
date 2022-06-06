package com.example.demo.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import com.example.demo.dao.DeliveryCommentDAO;
import com.example.demo.dao.DeliveryPostDAO;
import com.example.demo.domain.DeliveryComment;
import com.example.demo.domain.DeliveryPost;

@Service
@Transactional
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
	
	@Override
	public void updateDeliveryPost(DeliveryPost deliveryPost) {
		deliveryPostDao.updateDeliveryPost(deliveryPost);
	}
	
	
	//참여자 추가 업데이트, 참여자 선택 상태 변경
	@Transactional
	@Override
	public int updateParticipantList(String chooseNickname, int postId, int commentId) {
		int commentResult = deliveryCommentDao.updateChooseComment(commentId);
		int postResult = deliveryPostDao.updateParticipantList(chooseNickname, postId);
		if(commentResult == 1 && postResult == 1) return 1; //둘다 성공일 경우 성공 결과 1
		else return 0;
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
