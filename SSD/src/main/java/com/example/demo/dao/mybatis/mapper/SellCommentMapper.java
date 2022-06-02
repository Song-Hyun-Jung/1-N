package com.example.demo.dao.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dao.SellCommentDAO;
import com.example.demo.domain.SellComment;

@Mapper
public interface SellCommentMapper {
	int insertSellComment(SellComment comment);
}
