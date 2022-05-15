package com.example.demo.dao;

import java.util.List;

import com.example.demo.domain.ShoppingCategory;

import org.springframework.dao.DataAccessException;

public interface ShoppingCategoryDAO {
//	ī�װ�Id�� �ش� ī�װ� �̸�
	String getNameByCategoryId(int shoppingCategoryId) throws DataAccessException;
	
//	ī�װ�Id�� �ش� ī�װ� ����
	String getDescriptionByCategoryId(int shoppingCategoryId) throws DataAccessException;
	
//	��� ī�װ� List
	List<ShoppingCategory> getAllCategory() throws DataAccessException;
}
