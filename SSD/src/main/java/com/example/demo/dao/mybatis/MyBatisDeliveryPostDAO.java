package com.example.demo.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.DeliveryComment;
import com.example.demo.dao.DeliveryPostDAO;
import com.example.demo.dao.mybatis.mapper.DeliveryPostMapper;
import com.example.demo.domain.DeliveryPost;


@Repository
public class MyBatisDeliveryPostDAO implements DeliveryPostDAO{
	
	@Autowired
	private DeliveryPostMapper deliveryPostMapper;
	
	public int insertDeliveryPost(DeliveryPost post) throws DataAccessException{
		return deliveryPostMapper.insertDeliveryPost(post);
	}
	
	public void updateDeliveryPost(DeliveryPost post) throws DataAccessException{
		deliveryPostMapper.updateDeliveryPost(post);
	}
	
	public List<DeliveryPost> getAllDeliveryPost() throws DataAccessException{
		return deliveryPostMapper.getAllDeliveryPost();
	}
	
	public List<DeliveryComment> getAllDeliveryComments(int postId) throws DataAccessException{
		return deliveryPostMapper.getAllDeliveryComments(postId);
	}
	
	public int updateParticipantList(String chooseNickname, int postId) throws DataAccessException{	//userId는 댓글 작성자 userId 
		return deliveryPostMapper.updateParticipantList(chooseNickname, postId);
	}
	
	public DeliveryPost getDeliveryPost(int postId) throws DataAccessException{
		return deliveryPostMapper.getDeliveryPost(postId);
	}
	
	public List<DeliveryPost> getDeliveryPostByCategoryId(int deliveryCategoryId) throws DataAccessException{
		return deliveryPostMapper.getDeliveryPostByCategoryId(deliveryCategoryId);
	}

}
