package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.UserInfoDAO;
import com.example.demo.domain.UserInfo;

@Service
@Transactional
public class TooMachImpl implements TooMuchFacade{
	@Autowired
	private UserInfoDAO userInfoDao;

	@Override
	public void insertUser(UserInfo user) {
		userInfoDao.insertUser(user);
		
	}

	@Override
	public void updateUser(int userId) {
		// TODO Auto-generated method stub
		userInfoDao.updateUser(userId);
	}

	@Override
	public UserInfo getUserByUserId(int userId) {
		// TODO Auto-generated method stub
		return userInfoDao.getUserByUserId(userId);
	}

	@Override
	public UserInfo getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return userInfoDao.getUserByEmail(email);
	}

	@Override
	public UserInfo getUserByNickname(String nickname) {
		// TODO Auto-generated method stub
		return userInfoDao.getUserByNickname(nickname);
	}
	
	
}
