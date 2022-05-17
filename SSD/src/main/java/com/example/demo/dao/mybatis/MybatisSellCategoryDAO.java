package com.example.demo.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.example.demo.dao.SellCategoryDAO;
import com.example.demo.dao.mybatis.mapper.SellCategoryMapper;
import com.example.demo.domain.SellCategory;

public class MybatisSellCategoryDAO implements SellCategoryDAO{

	@Autowired
	private SellCategoryMapper sellCategoryMapper;

	@Override
	public List<SellCategory> getSellCategoryList() throws DataAccessException {
		return sellCategoryMapper.getSellCategoryList();
	}

	@Override
	public String getSellCategoryName(int sellCategoryId) throws DataAccessException {
		return sellCategoryMapper.getSellCategoryName(sellCategoryId);
	}
	
	
}
