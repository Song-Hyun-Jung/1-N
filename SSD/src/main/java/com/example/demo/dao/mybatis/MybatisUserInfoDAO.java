package com.example.demo.dao.mybatis;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.DeliveryPost;
import com.example.demo.dao.SellPost;
import com.example.demo.dao.ShoppingItem;
import com.example.demo.dao.UserInfoDAO;
import com.example.demo.domain.UserInfo;
import com.example.demo.dao.mybatis.mapper.UserInfoMapper;

@Repository
public class MybatisUserInfoDAO implements UserInfoDAO{
	
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	
	public UserInfo getUserByUserId(int userId) throws DataAccessException {
		return userInfoMapper.getUserByUserId(userId);
	}

	public UserInfo getUserByEmail(String email) throws DataAccessException{
		return userInfoMapper.getUserByEmail(email);
	}

	public UserInfo getUserByNickname(String nickname) throws DataAccessException {
		return userInfoMapper.getUserByNickname(nickname);
	}

	public void insertUser(UserInfo user) throws DataAccessException{
		userInfoMapper.insertUser(user);
	}
	 
	public void updateUser(int userId) throws DataAccessException{
		userInfoMapper.updateUser(userId);
	}

	//List<String> getUsernameList() throws DataAccessException {} //????

	public List<ShoppingItem> getPurchaseItemList(int userId) throws DataAccessException{ //개인 구매 상품들
		return userInfoMapper.getPurchaseItemList(userId);
	}

	public List<ShoppingItem> getCartItemList(int userId) throws DataAccessException{ //개인 찜 상품들
		return userInfoMapper.getCartItemList(userId);
		
	}

	public List<DeliveryPost> getMyDeliveryPostList(int userId) throws DataAccessException{
		return userInfoMapper.getMyDeliveryPostList(userId);
		
	}

	public List<SellPost> getMySellPostList(int userId) throws DataAccessException{
		return userInfoMapper.getMySellPostList(userId);
	}

}

