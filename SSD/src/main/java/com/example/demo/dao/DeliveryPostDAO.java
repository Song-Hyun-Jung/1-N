package com.example.demo.dao;

import java.util.List; 
import org.springframework.dao.DataAccessException;

import com.example.demo.domain.DeliveryPost; 

public interface DeliveryPostDAO { 
	void insertDeliveryPost(DeliveryPost post) throws DataAccessException; 
	
	void updateDeliveryPost(DeliveryPost post) throws DataAccessException;
	
	List<DeliveryPost> getAllDeliveryPost() throws DataAccessException; 
	
	List<DeliveryComment> getAllDeliveryComments(int postId) throws DataAccessException; 
	
	void updateParticipantList(int userId, int postId) throws DataAccessException; //userId는 댓글 작성자 userId 
	
	DeliveryPost getDeliveryPost(int postId) throws DataAccessException; 
	
	List<DeliveryPost> getDeliveryPostByCategoryId(int deliveryCategoryId) throws DataAccessException; 
} 

