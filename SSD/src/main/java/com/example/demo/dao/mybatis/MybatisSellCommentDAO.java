package com.example.demo.dao.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.example.demo.dao.SellCommentDAO;
import com.example.demo.dao.mybatis.mapper.SellCommentMapper;

public class MybatisSellCommentDAO implements SellCommentDAO{

	@Autowired
	private SellCommentMapper sellCommentMapper;

	@Override
	public void insertSellComment(SellCommentDAO comment) throws DataAccessException {
		sellCommentMapper.insertSellComment(comment);
	}
	
	
}
