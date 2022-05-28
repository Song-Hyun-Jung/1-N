package com.example.demo.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.example.demo.domain.ShoppingItem;
import com.example.demo.controller.UpdateUserCommand;
import com.example.demo.domain.DeliveryPost;
import com.example.demo.domain.SellPost;
import com.example.demo.domain.UserInfo;

@Mapper
public interface UserInfoMapper {
	
	 UserInfo getUserByUserId(int userId);

	 UserInfo getUserByUserEmail(String email);

	 UserInfo getUserByUserNickname(String nickname);

	 //UserInfo 객체 매개변수
	 void insertUser(UserInfo user);
	 
	 //userInfo 매개변수
	 int updateUser(UpdateUserCommand updateUserCommand);

	//List<String> getUsernameList() throws DataAccessException {} //????

	//사용자 userId 받아서 order에서 userId에 해당하는 shoppingItem 가져오기 
	List<ShoppingItem> getPurchaseItemList(int userId);

	//사용자 userId 받아서 cart에서 userId에 해당하는 shoppingItem 가져오기 
	List<ShoppingItem> getCartItemList(int userId);

	//사용자 userId 받아서 deliveryPost에서 작성자가 userId인 글들 가져오기
	List<DeliveryPost> getMyDeliveryPostList(int userId);
	
	//사용자 userId 받아서 sellPost에서 작성자가 userId인 글들 가져오기
	List<SellPost> getMySellPostList(int userId);

}
