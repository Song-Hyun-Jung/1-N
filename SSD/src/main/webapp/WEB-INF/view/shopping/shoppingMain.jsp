
<%@ page language="java" contentType="text/html;"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>shoppingMain</title>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link href="/docs/5.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link href="/docs/5.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="/static/style/shoppingDetail,shoppingPurchase/css/style.css" type="text/css">
    
 <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }
      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
      
      .category-list-area .category-list-wrapper{
      display:flex;
      justify-content:center;
      flex-wrap:wrap;
      margin:0 -15px
      }
      .category-list-area .category-list-wrapper .category-list-item a{
      display:block;
      text-align:center;
      width:210px;
      background:#fff;
      border-radius:5px;
      padding:40px 25px;
      margin:15px;
      border:1px solid rgba(124,134,154,.25);
      box-shadow:0 3px 35px rgba(218,222,228,.3)
      }
      .category-list-area .category-list-wrapper .category-list-item a:hover
      {
      background-color:#ff6b6b
      }
      .category-list-area .category-list-wrapper .category-list-item a:hover .icon,.category-list-area .category-list-wrapper .category-list-item a:hover h3
      {
      color:#fff
      }
      .category-list-area .category-list-wrapper .category-list-item a .icon
      {
      font-size:35px;
      margin-bottom:10px;
      line-height:1;
      color:#ff6b6b;
      transition:all .3s ease-out 0s
      }
      .category-list-area .category-list-wrapper .category-list-item a h3
      {
      font-weight:400;
      color:#333f57;
      transition:all .3s ease-out 0s
      }
    </style>
    
    
        <script>
		
		function addCart(targetUri) {
			form1.action = targetUri
			form1.submit();
		}
	</script>
</head>
<body>

<%@ include file="../top.jsp" %>

<br/><a href='<c:url value="/shop/shoppingMain.do"/>'>
            <h1 align="center">쇼핑몰</h1></a><br><br/>


<div class="hero__search" style="display: table; margin-left: auto; margin-right: auto; margin: 0px auto;">
<div class="hero__search__form">
 <form action="<c:url value="/shop/searchItem.do"/>" method="post">
  <input type="hidden" name="search" value="true"/>
  <input type="text" name="keyword" placeholder="검색">
  <button type="submit" class="site-btn">SEARCH</button>
 </form>
</div>
</div>


<main>
<form name="form1" method="POST">
<div class="album py-5 bg-light">
    <div class="container">

      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
      
      
       <c:forEach var="item" items="${top3Item}">
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
              <p class="card-text">${item.name}</p>
              <div class="d-flex justify-content-between align-items-center">
                <small class="text-muted">${item.price}</small>
                  <div class="btn-group"> 
                  <button type="submit" class="btn btn-sm btn-outline-secondary" onClick="addCart('/shop/addItemToCart.do?itemId=${item.itemId}')">찜 목록에 넣기</button>
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
 </main>
 <section class="category-list-area pt-130">
 <div class="container">
<div class="category-list-wrapper">


	<c:forEach var = "category" items="${categories}">
		<div class="category-list-item">
		<a href="<c:url value='/shop/categoryItemShop.do'>
		<c:param name='shoppingCategoryId' value='${category.shoppingCategoryId}'/></c:url>">
			<svg class="bd-placeholder-img card-img-top" width="100%" height="100" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false">
            	<image href="/static/images/shoppingCategory_${category.shoppingCategoryId}.jpg" width="100%" height="100%" />
            	<h3>${category.name}</h3>
            </svg>	
		</a>
		</div>
	</c:forEach>
</div>
</div>
</section>
</body>
</html>