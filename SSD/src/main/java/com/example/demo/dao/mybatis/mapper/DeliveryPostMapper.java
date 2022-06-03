package com.example.demo.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import com.example.demo.domain.DeliveryComment;
import com.example.demo.domain.DeliveryPost;

@Mapper
public interface DeliveryPostMapper {
	
	int insertDeliveryPost(DeliveryPost post) throws DataAccessException; 
	
	void updateDeliveryPost(DeliveryPost post);
	
	List<DeliveryPost> getAllDeliveryPost(); 
	
	List<DeliveryComment> getAllDeliveryComments(int postId); 
	
	int updateParticipantList(String chooseNickname, int postId); //chooseNickname은 선택된 댓글 작성자 닉네임 

	DeliveryPost getDeliveryPost(int postId); 
	
	List<DeliveryPost> getDeliveryPostByCategoryId(int deliveryCategoryId);


}
