package com.example.demo.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.demo.dao.DeliveryCommentDAO;
import com.example.demo.domain.DeliveryCategory;
import com.example.demo.domain.DeliveryComment;
import com.example.demo.domain.DeliveryPost;

public interface DeliveryService {
	
	//글 상세보기 위해 글정보, 댓글들 가져오기
	DeliveryPost getDeliveryPost(int postId);
	List<DeliveryComment> getAllDeliveryComments(int postId);
	
	//참여자 추가 업데이트, 참여자 선택 상태 변경
	int updateParticipantList(String chooseNickname, int postId, int commentId);
	
	//댓글 등록
	int insertDeliveryComment(DeliveryComment deliveryComment);
	
	//완료여부 update
	void updateDeliveryPost(DeliveryPost post);
	
	//배달 음식 카테고리
	List<DeliveryCategory> getDeliveryCategoryList();
}
