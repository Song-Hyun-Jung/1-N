package com.example.demo.dao;

import java.util.List;

import com.example.demo.domain.ShoppingCategory;

import org.springframework.dao.DataAccessException;

public interface ShoppingCategoryDAO {
//	카테고리Id로 해당 카테고리 이름
	String getNameByCategoryId(int shoppingCategoryId) throws DataAccessException;
	
//	카테고리Id로 해당 카테고리 설명
	String getDescriptionByCategoryId(int shoppingCategoryId) throws DataAccessException;
	
//	모든 카테고리 List
	List<ShoppingCategory> getAllCategory() throws DataAccessException;
}
