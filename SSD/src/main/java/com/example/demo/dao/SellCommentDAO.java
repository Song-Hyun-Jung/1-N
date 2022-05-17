package com.example.demo.dao;
import org.springframework.dao.DataAccessException;

public interface SellCommentDAO {
	void insertSellComment(SellCommentDAO comment) throws DataAccessException;
}
