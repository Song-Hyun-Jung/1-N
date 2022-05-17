package com.example.demo.dao.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.example.demo.dao.DeliveryCommentDAO;
import com.example.demo.dao.mybatis.mapper.DeliveryCommentMapper;

public class MybatisDeliveryComment implements DeliveryCommentDAO{
	@Autowired
	private DeliveryCommentMapper deliveryCommentMapper;

	@Override
	public void insertDeliveryComment(DeliveryCommentDAO comment) throws DataAccessException {
		deliveryCommentMapper.insertDeliveryComment(comment);
	}

	@Override
	public void updateChooseComment(int commentId) throws DataAccessException {
		deliveryCommentMapper.updateChooseComment(commentId);
	}
	
}
