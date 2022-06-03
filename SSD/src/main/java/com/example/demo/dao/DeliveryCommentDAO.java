package com.example.demo.dao;
import org.springframework.dao.DataAccessException;

import com.example.demo.domain.DeliveryComment;

public interface DeliveryCommentDAO {
	int insertDeliveryComment(DeliveryComment deliveryComment) throws DataAccessException;
	int updateChooseComment(int commentId)throws DataAccessException; //??? 참여자 선택인가요?
}
