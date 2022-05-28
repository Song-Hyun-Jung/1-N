package com.example.demo.service;

import com.example.demo.domain.UserInfo;

public interface TooMuchFacade {
	//user 추가
	void insertUser(UserInfo user);
	
	//user 정보 수정
	//void updateUser(int userId);
	
	//userId로 user 받아오기
	UserInfo getUserByUserId(int userId);
		
	//user email(로그인 ID)로 user 받아오기
	UserInfo getUserByEmail(String email);
		
	//user nickname으로 user 받아오기
	UserInfo getUserByNickname(String nickname);
}
