<%@ page language="java" contentType="text/html;"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 화면 최적화 -->
<meta name="viewport" content="width-device-width", initial-scale="1">
<!-- 루트 폴더에 부트스트랩을 참조하는 링크 -->
<link rel="stylesheet" href="/static/style/myDelivery,mySell/css/bootstrap.css">
<title>작성한글-배달음식나누기</title>
<style type="text/css">
	.myPageNav{
		color: #000000;
		text-decoration: none;
		font-size: medium;
		padding-right:50px;
	}
	a:hover{
		text-decoration: none;
		color: blue;
		font-size: medium;
	
	}
	td{
		font-size: medium;
	}
</style>
</head>
<body>
<%@ include file="../top.jsp" %>
	<nav class="navbar navbar-default"> <!-- 네비게이션 -->
		<div class="navbar-header" style="margin-top:20px"> 	
			<a class="myPageNav" href="/shop/mypageView.do">마이페이지</a>
			<a class="myPageNav" href="/shop/mypagePurchase.do">구매내역</a>
			<a class="myPageNav" href="/shop/mypageCart.do">찜한 상품</a>
			<a class="myPageNav" href="/shop/mypageDelivery.do">작성한 배달 커뮤니티 글</a>
			<a class="myPageNav" href="/shop/mypageSell.do">작성한 이웃 커뮤니티 글</a>
		</div>
	</nav>
	<!-- 네비게이션 영역 끝 -->
	
	<!-- 게시판 메인 페이지 영역 시작 -->
	<div class="container">
		<div class="row">
			<table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
					<tr>
						<th style="background-color: #eeeeee; text-align: center; font-size:medium">글 제목</th>
						<th style="background-color: #eeeeee; text-align: center; font-size:medium">완료여부</th>
						<th style="background-color: #eeeeee; text-align: center; font-size:medium">작성일</th>
					</tr>
					<c:forEach var="myDeliveryPost" items="${myDeliveryPostList}">
					<tr>
						<!-- 게시글 제목을 누르면 해당 글을 볼 수 있도록 링크 걸어야함 -->
						<td><a href="<c:url value='/shop/viewDeliveryPost.do'>
																<c:param name="deliveryPostId" value="${myDeliveryPost.postId}" />
													 </c:url>"> ${myDeliveryPost.title}</a></td>
						<td>
							<c:if test="${myDeliveryPost.complete == 'y'}">완료</c:if>
							<c:if test="${myDeliveryPost.complete == 'n'}">미완료</c:if>
						</td>
						<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${myDeliveryPost.writtenDate}"/></td>		
					</tr>
					</c:forEach>
			</table>
			
			
			<!-- 글쓰기 버튼 생성 -->
			<a href="/shop/deliveryForm.do" class="btn btn-primary pull-right" style="font-size:medium">배달음식 글쓰기</a>
		</div>
	</div>
	<!-- 게시판 메인 페이지 영역 끝 -->
	
	<!-- 부트스트랩 참조 영역 -->
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="/static/style/myDelivery,mySell/js/bootstrap.js"></script>
</body>
</html>