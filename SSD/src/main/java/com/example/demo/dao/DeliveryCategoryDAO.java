package com.example.demo.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.example.demo.domain.DeliveryCategory;

public interface DeliveryCategoryDAO {
	List<DeliveryCategory> getDeliveryCategoryList() throws DataAccessException;

	String getDeliveryCategoryName(int deliveryCategoryId) throws DataAccessException;

}
