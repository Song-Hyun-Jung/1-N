<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zxx">

<head>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
   
    <script>
		function updateInfo(targetUri) {
			orderForm.action = targetUri;
			orderForm.submit();
		}
		
		function cancel(targetUri) {
			orderForm.action = targetUri
			orderForm.submit();
		}
		
		function confirm(targetUri) {
			orderForm.action = targetUri
			orderForm.submit();
		}
	</script>
    
    
</head>

<body>
    <!-- Checkout Section Begin -->

     <section class="checkout spad">
        <div class="container">
            <div class="checkout__form">
                <h4>구매자 정보</h4>
                <form method="POST" name = "orderForm">
                	<input type="hidden" name="itemId" value="${purchaseItem.itemId}"/>
                	<input type="hidden" name="userId" value="${userInfo.userId}"/>
                	<input type="hidden" name="quantity" value="${param.quantity}"/>
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
                                <div class="checkout__order__subtotal">상품 남은 개수<span>${purchaseItem.totalQuantity - purchaseItem.soldQuantity}</span></div>
                                <!-- 0 이하 숫자 안 되게끔 처리 해야 함 -->
                                <div class="checkout__order__products">구매할 상품 개수<span>${param.quantity}</span></div>
		       					<div class="checkout__order__subtotal">확정 시 개당 가격<span>${purchaseItem.price}</span></div>
                                <div class="checkout__order__total">총 가격<span>${purchaseItem.price * param.quantity}</span></div>
                                <div class="checkout__input__checkbox">
                                </div>
                                <div class="checkout__input__checkbox">
                                    <label for="paypal">
                                        구매에 동의합니다.
                                        <input type="checkbox" id="paypal" required />
                                        <span class="checkmark"></span>
                                    </label>
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