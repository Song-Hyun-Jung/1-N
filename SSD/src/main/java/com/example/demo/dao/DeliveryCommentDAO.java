package com.example.demo.dao;
import org.springframework.dao.DataAccessException;

public interface DeliveryCommentDAO {
	void insertDeliveryComment(DeliveryCommentDAO comment) throws DataAccessException;
	void updateChooseComment(int commentId)throws DataAccessException;
}
