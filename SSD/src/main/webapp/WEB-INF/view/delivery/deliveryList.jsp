<%@ page language="java" contentType="text/html;"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/static/style/theme.css">
<meta charset="UTF-8">
<title>배달음식 나누기</title>
<style>
	a{
	  	text-decoration: none !important;
	}
	a:hover{
		text-decoration: none !important;
		color: blue !important;
		font-size: medium !important;
	
	}
</style>

</head>

 <body class="bg-light">
	 <%@ include file="../top.jsp" %>
    <div id="db-wrapper">

      <div id="page-content">
        <div class="bg-primary pt-10 pb-21"></div>
        <div class="container-fluid mt-n22 px-6">
          <div class="row">
            <div class="col-lg-12 col-md-12 col-12">

            </div>
            
            <a href='<c:url value="/shop/deliveryMain.do"/>'><h1 align="center">배달음식 나누기</h1></a>
            <br/><br/><br/>
            
             <c:forEach var="deliveryCategory" items="${deliveryCategoryList}">
	              <div class="col-xl-3 col-lg-6 col-md-12 col-12 mt-6">
	              <!-- card -->
	              <div class="card ">
	                <!-- card body -->
	                <div class="card-body"><a href="/shop/categoryDelivery.do?deliveryCategoryId=${deliveryCategory.deliveryCategoryId }">
	                  <!-- heading -->
	                  <div class="d-flex justify-content-between align-items-center
	                    mb-3">
	                    <div>
	                      <h4 class="mb-0">${deliveryCategory.name }</h4>
	                    </div>
	                  </div></a>
	                </div>
	              </div>
	            </div>             
             </c:forEach>
            
		<p>
          <div class="d-flex justify-content-between align-items-center"">
            <div></div>
          	<div> <a href="/shop/deliveryForm.do" class="btn btn-white">글 작성 버튼</a> </div>
          </div>
          
          <!-- row  -->
          <div class="row mt-6">
            <div class="col-md-12 col-12">
              <!-- card  -->
              <div class="card">
                <!-- table  -->
                <div class="table-responsive">
                  <table class="table text-nowrap mb-0">
                    <thead class="table-light">
                      <tr>
                        <th>제목</th>
                        <th>작성자</th>
                        <th>대략적 주소</th>
                        <th>음식명</th>
                        <th>완료여부</th>
                        <th>작성일</th>
                      </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="deliveryPost" items="${deliveryPostList}">
      					<tr>
      					<td class="align-middle text-dark">
      					
      					<a href='<c:url value="/shop/viewDeliveryPost.do">
            			<c:param name="deliveryPostId" value="${deliveryPost.postId}"/></c:url>'>
                        ${deliveryPost.title}</a></td>
                        
                        <td class="align-middle text-dark">${deliveryPost.nickname}</td>
                        <td class="align-middle text-dark">${deliveryPost.address}</td>
                        <td class="align-middle text-dark">${deliveryPost.foodName}</td>
                        
                        <c:if test="${deliveryPost.complete eq 'y'}">
                        <td class="align-middle text-dark">O</td>
                        </c:if>
                        <c:if test="${deliveryPost.complete eq 'n'}">
                        <td class="align-middle text-dark">X</td>
                        </c:if>
                        
                        <td class="align-middle text-dark">${deliveryPost.writtenDate}</td>
                        </tr>
                     
                     </c:forEach>
                    </tbody>
                  </table>
                </div>
                <!-- card footer  -->
                <!--  <div class="card-footer bg-white text-center">
                  <a href="#" class="link-primary">View All</a> -->

                </div>
              </div>

            </div>
          </div>
        </div>
      </div>
    </div>


</body>
</html>