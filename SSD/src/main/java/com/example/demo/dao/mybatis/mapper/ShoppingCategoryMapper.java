package com.example.demo.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.ShoppingCategory;

@Mapper
public interface ShoppingCategoryMapper {
//	ī�װ�Id�� �ش� ī�װ� �̸�
	String getNameByCategoryId(int shoppingCategoryId);
	
//	ī�װ�Id�� �ش� ī�װ� ����
	String getDescriptionByCategoryId(int shoppingCategoryId);
	
//	��� ī�װ� List
	List<ShoppingCategory> getAllCategory();
}
