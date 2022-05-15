package com.example.demo.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.demo.domain.OrderInfo;
import com.example.demo.domain.ShoppingItem;

public interface ShoppingItemDAO {
//	ī�װ�Id�� �ش� ī�װ��� ������ List
	List<ShoppingItem> getItemsByCategoryId(int shoppingCategoryId) throws DataAccessException;
	
//	ī�װ�Id�� �ش� ī�װ��� ������ List ���� ���ݼ����� 
	List<ShoppingItem> getItemSortByHighPrice(int shoppingCategoryId) throws DataAccessException;
	
//	ī�װ�Id�� �ش� ī�װ��� ������ List ���� ���ݼ����� 
	List<ShoppingItem> getItemSortByLowPrice(int shoppingCategoryId) throws DataAccessException;
	
//	ī�װ�Id�� �ش� ī�װ��� ������ List �Ǹŷ������� 
	List<ShoppingItem> getItemSortBySoldQuantity(int shoppingCategoryId) throws DataAccessException;
	
//	�ֹ��� ���� top3 ������ List
	List<ShoppingItem> getTop3Item() throws DataAccessException;
	
//	������Id�� �����۰�ü
	ShoppingItem getItem(int shoppingItemId) throws DataAccessException;
	
//	�˻���� ������List
	List<ShoppingItem> itemSearch(String keyword) throws DataAccessException;
	
//	������ �ڵ�
//	ShoppingItem.soldQuantity += OrderInfo.quantity
	public void updateQuantity(OrderInfo order) throws DataAccessException;

//	ShoppingItem.soldQuantity < ShoppingItem.totalQuantity�� ��
	boolean isItemInStock(int shoppingItemId) throws DataAccessException;
}
