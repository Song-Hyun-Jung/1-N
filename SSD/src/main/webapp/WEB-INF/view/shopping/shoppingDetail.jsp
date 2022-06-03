<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html;" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

<head>

    <meta name="description" content="Ogani Template">
    <meta name="keywords" content="Ogani, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>shoppingDetail</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/style.css" type="text/css">

</head>

<body>
<%@ include file="../top.jsp" %>
    <!-- Product Details Section Begin -->
    <section class="product-details spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-6">
	       <div class="product__details__text">
                        <h3>상품설명</h3>
                    </div>
                    <div class="product__details__pic">
                        <div class="product__details__pic__item">
                            <img class="product__details__pic__item--large"
                                src="/static/images/${shoppingItem.image}.jpg" alt="">
                        </div>
                    </div>

                </div>
                
	                <div class="col-lg-6 col-md-6">
	                    <div class="product__details__text">
	                        <div class="product__details__price">확정시 개당 가격(전체 가격 / 전체 가격) : ${shoppingItem.totalPrice}원 / ${shoppingItem.totalQuantity}개 = ${shoppingItem.price}원</div>
		            		<div class="product__details__price">남은 상품의 개수/전체 상품의 개수 : ${shoppingItem.remainedQuantity}개 / ${shoppingItem.totalQuantity}개</div>
	                         <ul>
	                            <li><b>상품 이름</b> <span>${shoppingItem.name}</span></li>
	                            <li><b>상품 설명</b> <span>${shoppingItem.description}</span></li>
	                            <li><b>주의사항</b> <span>${shoppingItem.memo}</span></li>
	                        </ul>
		          			<br><br><br>
		          			<form name= "goOrder" method="POST" action="/shop/askPurchase.do">
		          			<input type="hidden" name="itemId" value="${shoppingItem.itemId}" />
					           <div class="product__details__quantity">
				                            <div class="quantity">
				                                <div class="pro-qty">
				                                	<c:if test="${shoppingItem.remainedQuantity < 1}"> <input type="text" name="quantity" value="0"></c:if>
				                                    <c:if test="${shoppingItem.remainedQuantity >= 1}"> <input type="text" name="quantity" value="1"></c:if>
				                                   
				                                </div>
				                            </div>
				               </div>
		                
					           <a href="/shop/addItemToCart.do?itemId=${shoppingItem.itemId }" class="heart-icon"><span class="icon_heart_alt"></span></a>&nbsp;	 			  
				 			 
				 			 
				 			 <c:if test="${shoppingItem.remainedQuantity < 1}"><input type="button" class="site-btn" value="품절" /></c:if>
							 <c:if test="${shoppingItem.remainedQuantity >= 1}"><input type="submit" class="site-btn" value = "공동구매신청버튼" /></c:if>
							</form>
	                    
	                    </div>
	                </div>
               
            </div>
        </div>
    </section>
    <!-- Product Details Section End -->

    <!-- Js Plugins -->
    <script src="/static/style/shoppingDetail,shoppingPurchase/js/jquery-3.3.1.min.js"></script>
    <script src="/static/style/shoppingDetail,shoppingPurchase/js/bootstrap.min.js"></script>
    <script src="/static/style/shoppingDetail,shoppingPurchase/js/jquery.nice-select.min.js"></script>
    <script src="/static/style/shoppingDetail,shoppingPurchase/js/jquery-ui.min.js"></script>
    <script src="/static/style/shoppingDetail,shoppingPurchase/js/jquery.slicknav.js"></script>
    <script src="/static/style/shoppingDetail,shoppingPurchase/js/mixitup.min.js"></script>
    <script src="/static/style/shoppingDetail,shoppingPurchase/js/owl.carousel.min.js"></script>
    <script src="/static/style/shoppingDetail,shoppingPurchase/js/main.js"></script>


</body>

</html>