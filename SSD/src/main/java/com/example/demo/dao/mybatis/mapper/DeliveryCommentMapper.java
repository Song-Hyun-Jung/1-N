package com.example.demo.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dao.DeliveryCommentDAO;
import com.example.demo.domain.DeliveryComment;

@Mapper
public interface DeliveryCommentMapper {
	int insertDeliveryComment(DeliveryComment deliveryComment);
	int updateChooseComment(int commentId);
}
