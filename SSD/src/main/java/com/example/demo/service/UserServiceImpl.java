package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.UpdateUserCommand;
import com.example.demo.dao.UserInfoDAO;
import com.example.demo.domain.ShoppingItem;
import com.example.demo.domain.UserInfo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserInfoDAO userInfoDao;
	
	@Override
	public UserInfo getUserByEmail(String email) {
		return userInfoDao.getUserByEmail(email);
	}
	
	@Override
	public int updateUser(UpdateUserCommand updateUserCommand) {
		return userInfoDao.updateUser(updateUserCommand);
	}
	
	@Override
	public List<ShoppingItem> getPurchaseItemList(int userId){
		return userInfoDao.getPurchaseItemList(userId);
	}

}
