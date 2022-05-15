package com.example.demo.dao.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.ShoppingItem;

@Mapper
public interface ShoppingItemMapper {
//	카테고리Id로 해당 카테고리의 아이템 List
	List<ShoppingItem> getItemsByCategoryId(int shoppingCategoryId);
	
//	카테고리Id로 해당 카테고리의 아이템 List 높은 가격순으로 
	List<ShoppingItem> getItemSortByHighPrice(int shoppingCategoryId);
	
//	카테고리Id로 해당 카테고리의 아이템 List 낮은 가격순으로 
	List<ShoppingItem> getItemSortByLowPrice(int shoppingCategoryId);
	
//	카테고리Id로 해당 카테고리의 아이템 List 판매량순으로 
	List<ShoppingItem> getItemSortBySoldQuantity(int shoppingCategoryId);
	
//	주문량 많은 top3 아이템 List
	List<ShoppingItem> getTop3Item();
	
//	아이템Id로 아이템객체
	ShoppingItem getItem(int shoppingItemId);
	
//	검색어로 아이템List
	List<ShoppingItem> itemSearch(String keyword);
	
//	교수님 코드
//	ShoppingItem.soldQuantity += OrderInfo.quantity
	void updateQuantity(Map<String, Object> param);

//	ShoppingItem.soldQuantity < ShoppingItem.totalQuantity면 참
	boolean isItemInStock(int shoppingItemId);
}
