package com.example.demo.dao.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.ShoppingItemDAO;
import com.example.demo.dao.mybatis.mapper.ShoppingItemMapper;
import com.example.demo.domain.OrderInfo;
import com.example.demo.domain.ShoppingItem;

@Repository
public class MybatisShoppingItemDAO implements ShoppingItemDAO {
	@Autowired
	private ShoppingItemMapper shoppingItemMapper;
	
	@Override
	public List<ShoppingItem> getItemsByCategoryId(int shoppingCategoryId) throws DataAccessException {
		return shoppingItemMapper.getItemsByCategoryId(shoppingCategoryId);
	}

	@Override
	public List<ShoppingItem> getItemSortByHighPrice(int shoppingCategoryId) throws DataAccessException {
		return shoppingItemMapper.getItemSortByHighPrice(shoppingCategoryId);
	}

	@Override
	public List<ShoppingItem> getItemSortByLowPrice(int shoppingCategoryId) throws DataAccessException {
		return shoppingItemMapper.getItemSortByLowPrice(shoppingCategoryId);
	}

	@Override
	public List<ShoppingItem> getItemSortBySoldQuantity(int shoppingCategoryId) throws DataAccessException {
		return shoppingItemMapper.getItemSortBySoldQuantity(shoppingCategoryId);
	}

	@Override
	public List<ShoppingItem> getTop3Item() throws DataAccessException {
		return shoppingItemMapper.getTop3Item();
	}

	@Override
	public ShoppingItem getItem(int shoppingItemId) throws DataAccessException {
		return shoppingItemMapper.getItem(shoppingItemId);
	}

	@Override
	public List<ShoppingItem> itemSearch(String keyword) throws DataAccessException {
		return shoppingItemMapper.itemSearch(keyword);
	}

	@Override
	@Transactional
	public void updateQuantity(OrderInfo order) throws DataAccessException {
		int itemId = order.getItemId();
		int quantity = order.getQuantity();
		Map<String, Object> param = new HashMap<String, Object>(2);
		param.put("itemId", itemId);
		param.put("quantity", quantity);
		shoppingItemMapper.updateQuantity(param);
	}

	@Override
	public boolean isItemInStock(int shoppingItemId) throws DataAccessException {
		ShoppingItem item = getItem(shoppingItemId);
		int soldQuantity = item.getSoldQuantity();
		int totalQuantity = item.getTotalQuantity();
		return (totalQuantity - soldQuantity > 0);
	}

}
