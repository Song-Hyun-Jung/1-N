package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SellCategoryDAO;
import com.example.demo.dao.SellCommentDAO;
import com.example.demo.dao.SellPostDAO;
import com.example.demo.domain.SellCategory;
import com.example.demo.domain.SellComment;
import com.example.demo.domain.SellPost;

@Service
public class SellServiceImpl implements SellService{
	@Autowired
	private SellPostDAO SellPostDao;
	@Autowired
	private SellCommentDAO SellCommentDao;
	@Autowired
	private SellCategoryDAO sellCategoryDao;
	
	//글 상세정보 보기위해 글정보, 댓글들 가져오기
	@Override
	public SellPost getSellPost(int postId){
		return SellPostDao.getSellPost(postId);
	}
	
	@Override
	public List<SellComment> getAllSellComments(int postId){
		return SellPostDao.getAllSellComments(postId);
	}
	
	//댓글등록
	@Override
	public int insertSellComment(SellComment SellComment) {
		return SellCommentDao.insertSellComment(SellComment);
	}
	
	//complete
	@Override
	public void updateSellPost(SellPost sellPost) {
		SellPostDao.updateSellPost(sellPost);
	}
	
	//글 목록 가져오기
	public List<SellPost> getAllSellPost(){
		return SellPostDao.getAllSellPost();
	}
	
	//글 작성하기
	public int insertSellPost(SellPost sellPost) {
		return SellPostDao.insertSellPost(sellPost);
	}
	
	//카테고리 id에 따른 post리스트 가져오기
	@Override
	public List<SellPost> getSellPostByCategoryId(int sellCategoryId) {
		return SellPostDao.getSellPostByCategoryId(sellCategoryId);
	}

	//모든 카테고리 리스트 반환
	@Override
	public List<SellCategory> getSellCategoryList() {
		// TODO Auto-generated method stub
		return sellCategoryDao.getSellCategoryList();
	}

}
