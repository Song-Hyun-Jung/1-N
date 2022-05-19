package com.example.demo.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import com.example.demo.domain.DeliveryComment;
import com.example.demo.domain.DeliveryPost;

@Mapper
public interface DeliveryPostMapper {
	
	void insertDeliveryPost(DeliveryPost post) throws DataAccessException; 
	
	void updateDeliveryPost(DeliveryPost post);
	
	List<DeliveryPost> getAllDeliveryPost(); 
	
	List<DeliveryComment> getAllDeliveryComments(int postId); 
	
	//void updateParticipantList(int userId, int postId); //userId는 댓글 작성자 userId 

	
	DeliveryPost getDeliveryPost(int postId); 
	
	List<DeliveryPost> getDeliveryPostByCategoryId(int deliveryCategoryId);


}
