package com.example.demo.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.SellCategory;

@Mapper
public interface SellCategoryMapper {
	List<SellCategory> getSellCategoryList();
	
	String getSellCategoryName(int sellCategoryId);
}
