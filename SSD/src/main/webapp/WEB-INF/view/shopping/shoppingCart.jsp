<%@ page language="java" contentType="text/html;"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>찜한 상품</title>
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

<script>


	function deleteCart(targetUri) {
		cart.action = targetUri
		cart.submit();
	}

	if(${same} == 1) {
		alert("이미 찜 목록에 있는 상품입니다.");
	} 
		
		
</script>


</head>
<body>
<%@ include file="../top.jsp" %>
<div class="album py-5 bg-light">
    <div class="container">
      <h3 align="center" style="padding-bottom:30px">찜한 상품</h3>
      <form name="cart" method="POST">
      	
		<div><h4>찜한 상품: ${myCartSize}</h4></div>
		<div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
			<c:forEach var="myCartItem" items="${myCartItemList}">
				
		        <div class="col" style="padding-right:50px">
		          <div class="card shadow-sm"> 
		          	 <a href="<c:url value='/shop/viewItem.do'>
      					<c:param name='shoppingItemId' value='${myCartItem.itemId}'/></c:url>">
			            <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false">
			            	<image href="/static/images/${myCartItem.image}.jpg" width="100%" height="100%" />
			            </svg>
		            </a>
		            <div class="card-body">
		              <p class="card-text">찜한 상품: ${myCartItem.name}</p>
		              <p>가격: ${myCartItem.price}</p>
		              <p><button type="button" class="button" onclick="deleteCart('<c:url value ='/shop/deleteCart.do?cartId=${myCartItem.cartId}'>
																		
																	</c:url> ')">찜 삭제</button></p>
		            </div>
		          </div>
		        </div>
	        </c:forEach>
        </div>
        </form>
      <p/>
    </div>
   </div>
</body>
</html>