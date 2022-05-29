package com.example.demo.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.demo.controller.UpdateUserCommand;
import com.example.demo.domain.DeliveryPost;
import com.example.demo.domain.MyPurchaseResultMap;
import com.example.demo.domain.SellPost;
import com.example.demo.domain.ShoppingItem;
import com.example.demo.domain.UserInfo;

public interface UserService {
	
	UserInfo getUserByEmail(String email);
	
	int updateUser(UpdateUserCommand updateUserCommand);

	List<MyPurchaseResultMap> getPurchaseItemList(int userId);
	
	List<ShoppingItem> getCartItemList(int userId);
	
	List<SellPost> getMySellPostList(int userId);
	
	List<DeliveryPost> getMyDeliveryPostList(int userId);
}
