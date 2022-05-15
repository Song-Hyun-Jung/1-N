package com.example.demo.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.ShoppingCategory;

@Mapper
public interface ShoppingCategoryMapper {
//	카테고리Id로 해당 카테고리 이름
	String getNameByCategoryId(int shoppingCategoryId);
	
//	카테고리Id로 해당 카테고리 설명
	String getDescriptionByCategoryId(int shoppingCategoryId);
	
//	모든 카테고리 List
	List<ShoppingCategory> getAllCategory();
}
