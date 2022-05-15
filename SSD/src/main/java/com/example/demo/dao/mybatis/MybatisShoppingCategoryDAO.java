package com.example.demo.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.ShoppingCategoryDAO;
import com.example.demo.dao.mybatis.mapper.ShoppingCategoryMapper;
import com.example.demo.domain.ShoppingCategory;

@Repository
public class MybatisShoppingCategoryDAO implements ShoppingCategoryDAO {
	@Autowired
	private ShoppingCategoryMapper shoppingCategoryMapper;
	
	@Override
	public String getNameByCategoryId(int shoppingCategoryId) throws DataAccessException {
		return shoppingCategoryMapper.getNameByCategoryId(shoppingCategoryId);
	}

	@Override
	public String getDescriptionByCategoryId(int shoppingCategoryId) throws DataAccessException {
		return shoppingCategoryMapper.getDescriptionByCategoryId(shoppingCategoryId);
	}

	@Override
	public List<ShoppingCategory> getAllCategory() throws DataAccessException {
		return shoppingCategoryMapper.getAllCategory();
	}

}
