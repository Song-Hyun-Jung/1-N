<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html;" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
  
    <meta name="description" content="Ogani Template">
    <meta name="keywords" content="Ogani, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>shoppingPurchase</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

    <!--   Css Styles -->
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/style.css" type="text/css">
   
   <style>
   	#button1 {width: 60px;}
   	#quantity {width: 50px;}
   </style>
   
    <script>
		function updateInfo(targetUri) {
			var regex = /\s/gi;
			
			if (orderForm.phone.value.replace(regex, '') == "") {
				alert("전화번호를 입력하십시오.");
				orderForm.phone.focus();
			} else if(orderForm.address.value.replace(regex, '') == "") {
				alert("주소를 입력하십시오.");
				orderForm.address.focus();
			} else if(orderForm.payment.value.replace(regex, '') == "") {
				alert("결제정보를 입력하십시오.");
				orderForm.payment.focus();
			} else {
				orderForm.action = targetUri;
				orderForm.submit();
			}
		}
		
		function cancel(targetUri) {
			orderForm.action = targetUri
			orderForm.submit();
		}
		
		function confirm(targetUri) {
			var regex = /\s/gi;
			
			if (orderForm.phone.value.replace(regex, '') == "") {
				alert("전화번호를 입력하십시오.");
				orderForm.phone.focus();
			} else if(orderForm.address.value.replace(regex, '') == "") {
				alert("주소를 입력하십시오.");
				orderForm.address.focus();
			} else if(orderForm.payment.value.replace(regex, '') == "") {
				alert("결제정보를 입력하십시오.");
				orderForm.payment.focus();
			} else {
				orderForm.action = targetUri;
				orderForm.submit();
			}
		}
		
		function updateQuantity(targetUri) {
			orderForm.action = targetUri
			orderForm.submit();
		}
	</script>
    
    
</head>

<body>
<%@ include file="../top.jsp" %>
    <!-- Checkout Section Begin -->

     <section class="checkout spad">
        <div class="container">
            <div class="checkout__form">
                <h4>구매자 정보</h4>
                 <p style="color:red;">*정보 수정 시 반드시 정보 수정 버튼을 눌러주세요*</p>

                <form method="POST" name = "orderForm">
                	<input type="hidden" name="itemId" value="${purchaseItem.itemId}"/>
                	<input type="hidden" name="userId" value="${userInfo.userId}"/>

                    <div class="row">
                        <div class="col-lg-8 col-md-6">
       		  				<div class="checkout__input">
                                <p>이름<span>*</span><span>(수정 불가)</span></p>
                                <input type="text" name="name" value = "${userInfo.name}" required readonly />
                            </div>
                            <div class="checkout__input">
                                <p>전화번호<span>*</span></p>
                                <input type="text" name="phone" value = "${userInfo.phone}" required />
                            </div>
                            <div class="checkout__input">
                                <p>주소<span>*</span></p>
                                <input type="text" name="address" value = "${userInfo.address}" required/>
                            </div>
                            <div class="checkout__input">
                                <p>결제정보<span>*</span></p>
                                <input type="text" name="payment" value = "${userInfo.payment}" required />
                            </div>
                        </div>
                        <div class="col-lg-4 col-md-6">
                            <div class="checkout__order">
                                <div class="checkout__order__subtotal">상품 남은 개수<span>${purchaseItem.remainedQuantity}</span></div>
                                <div class="checkout__order__products">구매할 상품 개수&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="number" id="quantity" name="quantity" value="${param.quantity}" max="${purchaseItem.remainedQuantity}" min="1"/>&nbsp;&nbsp;<button type="button" class="button" id="button1" onclick="updateQuantity('<c:url value ='/shop/askPurchase.do'></c:url> ')">변경</button><span></span></div>
		       					<div class="checkout__order__subtotal">확정 시 개당 가격<span>${purchaseItem.price}</span></div>
                                <div class="checkout__order__total">총 가격<span>${purchaseItem.price * param.quantity}</span></div>
                                <div class="checkout__input__checkbox">
                                </div>
                             
                                
                                <button type="button" class="button" onclick="updateInfo('<c:url value ='/shop/OrderMypageUpdate.do'></c:url> ')">정보 수정</button>
																	
								<button type="button" class="button" onclick="cancel('<c:url value ='/shop/cancel.do'></c:url> ')">결제 취소</button>
																	
								<button type="button" class="button" onclick="confirm('<c:url value ='/shop/confirmPurchase.do'></c:url> ')">구매 확정</button>
         
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </section>
    <!-- Checkout Section End -->

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