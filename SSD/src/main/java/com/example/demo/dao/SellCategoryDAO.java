package com.example.demo.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.example.demo.domain.SellCategory;


public interface SellCategoryDAO {
	
	//모든 카테고리 리스트 반환
	List<SellCategory> getSellCategoryList() throws DataAccessException;
	
	//카테고리 id에대한 카테고리 이름 반환
	String getSellCategoryName(int sellCategoryId) throws DataAccessException;

}
