package com.example.demo.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.SellComment;
import com.example.demo.dao.mybatis.mapper.SellPostMapper;
import com.example.demo.domain.SellPost;

@Repository
public class MybatisSellPostDAO {
	
	@Autowired
	private SellPostMapper sellPostMapper;
	
	void insertSellPost(SellPost post) throws DataAccessException{
		sellPostMapper.insertSellPost(post);
	}
	
	void updateSellPost(SellPost post) throws DataAccessException{
		sellPostMapper.updateSellPost(post);
	}
	
	List<SellPost> getAllSellPost() throws DataAccessException{
		return sellPostMapper.getAllSellPost();
	}
	
	List<SellComment> getAllSellComments(int postId) throws DataAccessException{
		return sellPostMapper.getAllSellComments(postId);
	}
	
	SellPost getSellPost(int postId) throws DataAccessException{
		return sellPostMapper.getSellPost(postId);
	}
	
	List<SellPost> getSellPostByCategoryId(int sellCategoryId) throws DataAccessException{
		return sellPostMapper.getSellPostByCategoryId(sellCategoryId);
	}

}
