<%@ page language="java" contentType="text/html;"
    pageEncoding="UTF-8"%>
    <!-- 수정 금지 -->
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Welcome</title>
</head>
<body>
	<c:if test="${ses == 0}">
		<a href="/shop/login.do">로그인</a>/
		<a href="/shop/register.do">회원가입</a>
	</c:if>
	
	<c:if test="${ses == 1}">
	${nickName}님
		<a href="/shop/myPageView.do">마이페이지 이동</a>
		<a href="/shop/logout.do">로그아웃</a>
	</c:if>
	
</body>
</html>
