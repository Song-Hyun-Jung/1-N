package com.example.demo.dao.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.ShoppingItem;

@Mapper
public interface ShoppingItemMapper {
//	ī�װ�Id�� �ش� ī�װ��� ������ List
	List<ShoppingItem> getItemsByCategoryId(int shoppingCategoryId);
	
//	ī�װ�Id�� �ش� ī�װ��� ������ List ���� ���ݼ����� 
	List<ShoppingItem> getItemSortByHighPrice(int shoppingCategoryId);
	
//	ī�װ�Id�� �ش� ī�װ��� ������ List ���� ���ݼ����� 
	List<ShoppingItem> getItemSortByLowPrice(int shoppingCategoryId);
	
//	ī�װ�Id�� �ش� ī�װ��� ������ List �Ǹŷ������� 
	List<ShoppingItem> getItemSortBySoldQuantity(int shoppingCategoryId);
	
//	�ֹ��� ���� top3 ������ List
	List<ShoppingItem> getTop3Item();
	
//	������Id�� �����۰�ü
	ShoppingItem getItem(int shoppingItemId);
	
//	�˻���� ������List
	List<ShoppingItem> itemSearch(String keyword);
	
//	������ �ڵ�
//	ShoppingItem.soldQuantity += OrderInfo.quantity
	void updateQuantity(Map<String, Object> param);

//	ShoppingItem.soldQuantity < ShoppingItem.totalQuantity�� ��
	boolean isItemInStock(int shoppingItemId);
}
