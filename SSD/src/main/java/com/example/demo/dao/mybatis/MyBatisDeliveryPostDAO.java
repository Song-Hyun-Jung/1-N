package com.example.demo.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.DeliveryComment;
import com.example.demo.dao.mybatis.mapper.DeliveryPostMapper;
import com.example.demo.domain.DeliveryPost;



@Repository
public class MyBatisDeliveryPostDAO {
	
	@Autowired
	private DeliveryPostMapper deliveryPostMapper;
	
	void insertDeliveryPost(DeliveryPost post) throws DataAccessException{
		deliveryPostMapper.insertDeliveryPost(post);
	}
	
	void updateDeliveryPost(DeliveryPost post) throws DataAccessException{
		deliveryPostMapper.updateDeliveryPost(post);
	}
	
	List<DeliveryPost> getAllDeliveryPost() throws DataAccessException{
		return deliveryPostMapper.getAllDeliveryPost();
	}
	
	List<DeliveryComment> getAllDeliveryComments(int postId) throws DataAccessException{
		return deliveryPostMapper.getAllDeliveryComments(postId);
	}
	
	void updateParticipantList(int userId, int postId) throws DataAccessException{	//userId는 댓글 작성자 userId 
		deliveryPostMapper.updateDeliveryPost(userId, postId);
	}
	
	DeliveryPost getDeliveryPost(int postId) throws DataAccessException{
		return deliveryPostMapper.getDeliveryPost(postId);
	}
	
	List<DeliveryPost> getDeliveryPostByCategoryId(int deliveryCategoryId) throws DataAccessException{
		return deliveryPostMapper.getDeliveryPostByCategoryId(deliveryCategoryId);
	}

}
