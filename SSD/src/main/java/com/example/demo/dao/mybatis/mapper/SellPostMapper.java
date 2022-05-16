package com.example.demo.dao.mybatis.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.demo.dao.SellComment;
import com.example.demo.domain.SellPost;

public interface SellPostMapper {
	void insertSellPost(SellPost post); 
	
	void updateSellPost(SellPost post); 
	
	List<SellPost> getAllSellPost(); 
	
	List<SellComment> getAllSellComments(int postId); 
	
	SellPost getSellPost(int postId); 
	
	List<SellPost> getSellPostByCategoryId(int sellCategoryId); 

}
