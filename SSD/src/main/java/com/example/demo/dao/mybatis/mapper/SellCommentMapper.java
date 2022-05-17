package com.example.demo.dao.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dao.SellCommentDAO;

@Mapper
public interface SellCommentMapper {
	void insertSellComment(SellCommentDAO comment);
}
