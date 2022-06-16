package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.SellComment;
import com.example.demo.domain.SellPost;

public interface SellService {
		//글 상세보기 위해 글정보, 댓글들 가져오기
		SellPost getSellPost(int postId);
		List<SellComment> getAllSellComments(int postId);
	
		//댓글 등록
		int insertSellComment(SellComment sellComment);
		
		void updateSellPost(SellPost sellpost);
		
		//글 목록 가져오기
		List<SellPost> getAllSellPost();
}
