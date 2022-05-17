package com.example.demo.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.example.demo.domain.DeliveryPost;
import com.example.demo.domain.SellPost;
import com.example.demo.domain.ShoppingItem;
import com.example.demo.domain.UserInfo;

public interface UserInfoDAO {

	//userId로 user 받아오기
	UserInfo getUserByUserId(int userId) throws DataAccessException;
	
	//user email(로그인 ID)로 user 받아오기
	UserInfo getUserByEmail(String email) throws DataAccessException;
	
    //user nickname으로 user 받아오기
	UserInfo getUserByNickname(String nickname) throws DataAccessException;
	
	//user 추가
	void insertUser(UserInfo user) throws DataAccessException;
	
	//user 정보 수정
	void updateUser(int userId) throws DataAccessException;

	//List<String> getUsernameList() throws DataAccessException; //???
	
	//user 구매 목록 가져오기
	List<ShoppingItem> getPurchaseItemList(int userId) throws DataAccessException;
	
	//user 찜 목록 가져오기
	List<ShoppingItem> getCartItemList(int userId) throws DataAccessException;
	
	//user가 작성한 글 가져오기
	//배달음식
	List<DeliveryPost> getMyDeliveryPostList(int userId) throws DataAccessException;
	
	//회원간 거래
	List<SellPost> getMySellPostList(int userId) throws DataAccessException;


}
