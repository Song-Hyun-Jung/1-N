package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.DeliveryComment;
import com.example.demo.domain.DeliveryPost;

public interface DeliveryService {
	
	DeliveryPost getDeliveryPost(int postId);
	List<DeliveryComment> getAllDeliveryComments(int postId);
}
