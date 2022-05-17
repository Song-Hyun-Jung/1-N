package com.example.demo.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.example.demo.domain.DeliveryPost;
import com.example.demo.domain.SellPost;
import com.example.demo.domain.ShoppingItem;
import com.example.demo.domain.UserInfo;

public interface UserInfoDAO {

	UserInfo getUserByUserId(int userId) throws DataAccessException;

	UserInfo getUserByEmail(String email) throws DataAccessException;

	UserInfo getUserByNickname(String nickname) throws DataAccessException;

	void insertUser(UserInfo user) throws DataAccessException;
	 
	void updateUser(int userId) throws DataAccessException;

	//List<String> getUsernameList() throws DataAccessException; //???

	List<ShoppingItem> getPurchaseItemList(int userId) throws DataAccessException;

	List<ShoppingItem> getCartItemList(int userId) throws DataAccessException;

	List<DeliveryPost> getMyDeliveryPostList(int userId) throws DataAccessException;

	List<SellPost> getMySellPostList(int userId) throws DataAccessException;


}
