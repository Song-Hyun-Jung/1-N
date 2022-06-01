package com.example.demo.dao.mybatis;

import java.util.List;
import java.util.Map;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.DeliveryPost;
import com.example.demo.domain.MyCartResultMap;
import com.example.demo.domain.MyPurchaseResultMap;
import com.example.demo.domain.SellPost;
import com.example.demo.domain.ShoppingCategory;
import com.example.demo.domain.ShoppingItem;
import com.example.demo.controller.UpdateUserCommand;
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
		return userInfoMapper.getUserByUserEmail(email);
	}

	public UserInfo getUserByNickname(String nickname) throws DataAccessException {
		return userInfoMapper.getUserByUserNickname(nickname);
	}

	public void insertUser(UserInfo user) throws DataAccessException{
		userInfoMapper.insertUser(user);
	}
	 
	/*public int updateUser(UserInfo userInfo) throws DataAccessException{
		return userInfoMapper.updateUser(userInfo);
	}
	*/
	public int updateUser(UpdateUserCommand updateUserCommand) throws DataAccessException{
		return userInfoMapper.updateUser(updateUserCommand);
	}

	//List<String> getUsernameList() throws DataAccessException {} //????

	public List<MyPurchaseResultMap> getPurchaseItemList(int userId) throws DataAccessException{ //개인 구매 상품들
		return userInfoMapper.getPurchaseItemList(userId);
	}

	public List<MyCartResultMap> getCartItemList(int userId) throws DataAccessException{ //개인 찜 상품들
		return userInfoMapper.getCartItemList(userId);
		
	}

	public List<DeliveryPost> getMyDeliveryPostList(int userId) throws DataAccessException{
		return userInfoMapper.getMyDeliveryPostList(userId);
		
	}

	public List<SellPost> getMySellPostList(int userId) throws DataAccessException{
		return userInfoMapper.getMySellPostList(userId);
	}

}

