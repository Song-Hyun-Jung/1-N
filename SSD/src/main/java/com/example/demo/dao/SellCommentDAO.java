package com.example.demo.dao;
import org.springframework.dao.DataAccessException;

import com.example.demo.domain.SellComment;

public interface SellCommentDAO {
	int insertSellComment(SellComment comment) throws DataAccessException;
}
