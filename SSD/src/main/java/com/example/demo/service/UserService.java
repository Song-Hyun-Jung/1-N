package com.example.demo.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.demo.controller.UpdateUserCommand;
import com.example.demo.domain.ShoppingItem;
import com.example.demo.domain.UserInfo;

public interface UserService {
	
	UserInfo getUserByEmail(String email);
	
	int updateUser(UpdateUserCommand updateUserCommand);

	List<ShoppingItem> getPurchaseItemList(int userId);

}
