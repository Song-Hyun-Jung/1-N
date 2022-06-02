package com.example.demo.dao.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.SellCommentDAO;
import com.example.demo.dao.mybatis.mapper.SellCommentMapper;
import com.example.demo.domain.SellComment;

@Repository
public class MybatisSellCommentDAO implements SellCommentDAO{

	@Autowired
	private SellCommentMapper sellCommentMapper;

	@Override
	public int insertSellComment(SellComment comment) throws DataAccessException {
		return sellCommentMapper.insertSellComment(comment);
	}
	
	
}
