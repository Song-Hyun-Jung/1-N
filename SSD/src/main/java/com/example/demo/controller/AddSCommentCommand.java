package com.example.demo.controller;

public class AddSCommentCommand {
		//댓글등록 Sell comment 객체
		private String sellPostId;
		private String comments;
		
		public String getSellPostId() {
			return sellPostId;
		}
		public void setSellPostId(String sellPostId) {
			this.sellPostId = sellPostId;
		}
		public String getComments() {
			return comments;
		}
		public void setComments(String comments) {
			this.comments = comments;
		}
}
