<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>shoppingCategory</title>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link href="/docs/5.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/style.css" type="text/css">
    
    
	<script>
		
		function addCart(targetUri) {
			form1.action = targetUri
			form1.submit();
		}
	</script>
</head>
<body>

<c:choose>

<c:when test="${search eq 'true'}">
<br/><br/><br><a href='<c:url value="/shop/shoppingMain.do"/>'>
            <h1 align="center">쇼핑몰</h1></a><br><br/>
</c:when>

<c:otherwise>
<br><br><h2 align="center">${shoppingCategoryName}</h2><br><br>
<h3 align="center">${shoppingCategoryDescription}</h3><br><br><br>
</c:otherwise>

</c:choose>

<div class="hero__search" style="display: table; margin-left: auto; margin-right: auto; margin: 0px auto;">	 
	 <c:choose>
	 <c:when test="${search ne 'true'}">
	 <a href="<c:url value='/shop/sortItemSell.do'>
	 <c:param name='shoppingCategoryId' value='${shoppingCategoryId}'/></c:url>">
	 <button type="submit" class="site-btn">판매순</button>&nbsp;
	 </a>
	 
	 <a href="<c:url value='/shop/sortItemHigh.do'>
	 <c:param name='shoppingCategoryId' value='${shoppingCategoryId}'/></c:url>">
	 <button type="submit" class="site-btn">가격 높은 순</button>&nbsp;
	 </a>
	 
	 <a href="<c:url value='/shop/sortItemLow.do'>
	 <c:param name='shoppingCategoryId' value='${shoppingCategoryId}'/></c:url>">
	 <button type="submit" class="site-btn">가격 낮은 순</button>&nbsp;
	 </a>
	 </c:when>
	 </c:choose>	
	 
</div>

 <form name="form1" method="POST">                       
<div class="album py-5 bg-light">
    <div class="container">
      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
      
      <c:forEach var="item" items="${shoppingItemList}">
      <input type="hidden" name="itemId" value="${item.itemId}" />
        <div class="col">
          <div class="card shadow-sm">
          
          	<a href="<c:url value='/shop/viewItem.do'>
      		<c:param name='shoppingItemId' value='${item.itemId}'/></c:url>">
            <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/>
            <image href="/static/images/${item.image}.jpg" width="100%" height="100%" />
            </svg>  
            </a>
            
            <div class="card-body">
              <p class="card-text"><c:out value="${item.name}" /></p>
              <div class="d-flex justify-content-between align-items-center">
                <small class="text-muted">${item.price}</small>
                  <div class="btn-group"> 
                  <button type="button" class="btn btn-sm btn-outline-secondary" onClick="addCart('/shop/addItemToCart.do')">찜 목록에 넣기</button>
                  </div>
              </div>
            </div>
          </div>
        </div>
        
		
       </c:forEach>
       
    </div>
   </div>
   </div>
   </form>
</body>
</html>