package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.DeliveryComment;
import com.example.demo.domain.DeliveryPost;

public interface DeliveryService {
	
	//글 상세보기 위해 글정보, 댓글들 가져오기
	DeliveryPost getDeliveryPost(int postId);
	List<DeliveryComment> getAllDeliveryComments(int postId);
}