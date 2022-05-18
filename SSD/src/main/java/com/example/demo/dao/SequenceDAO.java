package com.example.demo.dao;

import org.springframework.dao.DataAccessException;

public interface SequenceDAO {
	public int getNextId(String name) throws DataAccessException;
}