package com.example.demo.dao.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dao.DeliveryCommentDAO;

@Mapper
public interface DeliveryCommentMapper {
	void insertDeliveryComment(DeliveryCommentDAO comment);
	void updateChooseComment(int commentId);
}
