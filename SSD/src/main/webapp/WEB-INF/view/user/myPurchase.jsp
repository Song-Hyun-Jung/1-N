<%@ page language="java" contentType="text/html;"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구매 내역</title>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link href="/docs/5.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<style>
#forDisplay{
	display:flex;
}
</style>
</head>
<body>
<%@ include file="../top.jsp" %>
<div class="album py-5 bg-light">
    <div class="container">
      <h3 align="center" style="padding-bottom:30px">구매 상품 목록</h3>

		<div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
			<c:forEach var="myPurchaseItem" items="${myPurchaseItemList}">
		        <div class="col" style="padding-right:50px">
		          <div class="card shadow-sm"> 
		            <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false">
		            	<image href="/static/images/${myPurchaseItem.image}.jpg" width="100%" height="100%" />
		            </svg>
		            <div class="card-body">
		              <p class="card-text">구매 상품: ${myPurchaseItem.name}</p>
		              <p>가격: ${myPurchaseItem.price}</p>
		              <div class="d-flex justify-content-between align-items-center">
		                <small class="text-muted"> <p>구매 확정 날짜: <fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${myPurchaseItem.orderDate}"/></p></small>
		              </div>
		            </div>
		          </div>
		        </div>
	        </c:forEach>
        </div>
        
      <p/>
    </div>
   </div>
</body>
</html>