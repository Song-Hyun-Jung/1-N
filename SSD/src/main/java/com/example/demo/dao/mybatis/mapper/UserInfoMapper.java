package com.example.demo.dao.mybatis.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.example.demo.domain.ShoppingItem;
import com.example.demo.domain.DeliveryPost;
import com.example.demo.domain.SellPost;
import com.example.demo.domain.UserInfo;

public interface UserInfoMapper {
	 UserInfo getUserByUserId(int userId);


	 UserInfo getUserByEmail(String email);

	 UserInfo getUserByNickname(String nickname);

	 void insertUser(UserInfo user);
	 
	 void updateUser(int userId);

	//List<String> getUsernameList() throws DataAccessException {} //????

	List<ShoppingItem> getPurchaseItemList(int userId);

	List<ShoppingItem> getCartItemList(int userId);

	List<DeliveryPost> getMyDeliveryPostList(int userId);
	
	List<SellPost> getMySellPostList(int userId);

}
