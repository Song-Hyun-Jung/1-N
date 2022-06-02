package com.example.demo.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.SellComment;
import com.example.demo.dao.SellPostDAO;
import com.example.demo.dao.mybatis.mapper.SellPostMapper;
import com.example.demo.domain.SellPost;

@Repository
public class MybatisSellPostDAO implements SellPostDAO {
	
	@Autowired
	private SellPostMapper sellPostMapper;
	
	public void insertSellPost(SellPost post) throws DataAccessException{
		sellPostMapper.insertSellPost(post);
	}
	
	public void updateSellPost(SellPost post) throws DataAccessException{
		sellPostMapper.updateSellPost(post);
	}
	
	public List<SellPost> getAllSellPost() throws DataAccessException{
		return sellPostMapper.getAllSellPost();
	}
	
	public List<SellComment> getAllSellComments(int postId) throws DataAccessException{
		return sellPostMapper.getAllSellComments(postId);
	}
	
	public SellPost getSellPost(int postId) throws DataAccessException{
		return sellPostMapper.getSellPost(postId);
	}
	
	public List<SellPost> getSellPostByCategoryId(int sellCategoryId) throws DataAccessException{
		return sellPostMapper.getSellPostByCategoryId(sellCategoryId);
	}

}
