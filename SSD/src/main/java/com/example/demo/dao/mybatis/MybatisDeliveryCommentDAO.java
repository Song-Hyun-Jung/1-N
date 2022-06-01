package com.example.demo.dao.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.DeliveryCommentDAO;
import com.example.demo.dao.mybatis.mapper.DeliveryCommentMapper;
import com.example.demo.domain.DeliveryComment;

@Repository
public class MybatisDeliveryCommentDAO implements DeliveryCommentDAO{
	@Autowired
	private DeliveryCommentMapper deliveryCommentMapper;

	@Override
	public int insertDeliveryComment(DeliveryComment deliveryComment) throws DataAccessException {
		return deliveryCommentMapper.insertDeliveryComment(deliveryComment);
	}

	@Override
	public int updateChooseComment(int commentId) throws DataAccessException {
		return deliveryCommentMapper.updateChooseComment(commentId);
	}

}
