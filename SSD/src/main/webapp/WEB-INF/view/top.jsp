<%@ page language="java" contentType="text/html;"
    pageEncoding="UTF-8"%>
    <!-- 수정 금지 -->
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Welcome</title>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	
</head>
<body>
<div class="container">
  <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
    <p class="col-md-4 mb-0 text-muted">&copy; 2022 1/N, software system development</p>

    <a href="/" class="col-md-4 d-flex align-items-center justify-content-center mb-3 mb-md-0 me-md-auto link-dark text-decoration-none">
      <svg class="bi me-2" width="40" height="32">
      <img src="/static/mainImages/logo.png" width="200" height="100" />
      </svg>
    </a>

    <ul class="nav col-md-4 justify-content-end">
    	<c:if test="${ses == 0}">
    		<button type="button" class="btn btn-outline-primary me-2" style="height:40px"  onClick="location.href='/shop/login.do'">Login</button>
        	<button type="button" class="btn btn-primary" style="height:40px" onClick="location.href='/shop/register.do'">Sign-up</button>
    	</c:if>
    	<c:if test="${ses == 1}">
			<b class="px-2 link-dark">${nickName}님</b>
			<button type="button" class="btn btn-outline-primary me-2"  onClick="location.href='/shop/mypageView.do'">My page</button>
        	<button type="button" class="btn btn-primary"  onClick="location.href='/shop/logout.do'">Logout</button>
    	</c:if>
    </ul>
  </footer>
</div>
</body>
</html>
