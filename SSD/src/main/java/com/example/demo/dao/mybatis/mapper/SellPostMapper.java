package com.example.demo.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import com.example.demo.domain.SellComment;
import com.example.demo.domain.SellPost;

@Mapper
public interface SellPostMapper {
	int insertSellPost(SellPost post); 
	
	void updateSellPost(SellPost post); 
	
	List<SellPost> getAllSellPost(); 
	
	List<SellComment> getAllSellComments(int postId); 
	
	SellPost getSellPost(int postId); 
	
	List<SellPost> getSellPostByCategoryId(int sellCategoryId); 

}
