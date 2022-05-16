package com.example.demo.dao;

import java.util.List; 
import org.springframework.dao.DataAccessException;

import com.example.demo.domain.SellPost; 

public interface SellPostDAO { 
	
	void insertSellPost(SellPost post) throws DataAccessException; 
	
	void updateSellPost(SellPost post) throws DataAccessException; List<SellPost> getAllSellPost() throws DataAccessException; 
	
	List<SellComment> getAllSellComments(int postId) throws DataAccessException; 
	
	SellPost getSellPost(int postId) throws DataAccessException; 
	
	List<SellPost> getSellPostByCategoryId(int sellCategoryId) throws DataAccessException; 
	
} 

