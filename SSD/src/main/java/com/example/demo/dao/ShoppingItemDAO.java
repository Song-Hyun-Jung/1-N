package com.example.demo.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.demo.domain.OrderInfo;
import com.example.demo.domain.ShoppingItem;

public interface ShoppingItemDAO {
//	카테고리Id로 해당 카테고리의 아이템 List
	List<ShoppingItem> getItemsByCategoryId(int shoppingCategoryId) throws DataAccessException;
	
//	카테고리Id로 해당 카테고리의 아이템 List 높은 가격순으로 
	List<ShoppingItem> getItemSortByHighPrice(int shoppingCategoryId) throws DataAccessException;
	
//	카테고리Id로 해당 카테고리의 아이템 List 낮은 가격순으로 
	List<ShoppingItem> getItemSortByLowPrice(int shoppingCategoryId) throws DataAccessException;
	
//	카테고리Id로 해당 카테고리의 아이템 List 판매량순으로 
	List<ShoppingItem> getItemSortBySoldQuantity(int shoppingCategoryId) throws DataAccessException;
	
//	주문량 많은 top3 아이템 List
	List<ShoppingItem> getTop3Item() throws DataAccessException;
	
//	아이템Id로 아이템객체
	ShoppingItem getItem(int shoppingItemId) throws DataAccessException;
	
//	검색어로 아이템List
	List<ShoppingItem> itemSearch(String keyword) throws DataAccessException;
	
//	교수님 코드
//	ShoppingItem.soldQuantity += OrderInfo.quantity
	public void updateQuantity(OrderInfo order) throws DataAccessException;

//	ShoppingItem.soldQuantity < ShoppingItem.totalQuantity면 참
	boolean isItemInStock(int shoppingItemId) throws DataAccessException;
}
