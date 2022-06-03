<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/static/style/theme.css">
<meta charset="EUC-KR">
<title>������� ������</title>
</head>

 <body class="bg-light">
    <div id="db-wrapper">

      <div id="page-content">
        <div class="bg-primary pt-10 pb-21"></div>
        <div class="container-fluid mt-n22 px-6">
          <div class="row">
            <div class="col-lg-12 col-md-12 col-12">

            </div>
            
            <a href='<c:url value="/shop/deliveryMain.do"/>'><h1 align="center">������� ������</h1></a>
            <br/><br/><br/><br/><br/><br/><br/>
            
            <div class="col-xl-3 col-lg-6 col-md-12 col-12 mt-6">
              <!-- card -->
              <div class="card ">
                <!-- card body -->
                <div class="card-body"><a href="/shop/categoryDelivery.do?deliveryCategoryId=3">
                  <!-- heading -->
                  <div class="d-flex justify-content-between align-items-center
                    mb-3">
                    <div>
                      <h4 class="mb-0">�ѽ�</h4>
                    </div>
                  </div></a>
                </div>
              </div>
            </div>
            
            <div class="col-xl-3 col-lg-6 col-md-12 col-12 mt-6">
              <!-- card -->
              <div class="card ">
                <!-- card body -->
                <div class="card-body"><a href="/shop/categoryDelivery.do?deliveryCategoryId=2">
                  <!-- heading -->
                  <div class="d-flex justify-content-between align-items-center
                    mb-3">
                    <div>
                      <h4 class="mb-0">�߽�</h4>
                    </div>
                  </div></a>
                </div>
              </div>
            </div>
            
            <div class="col-xl-3 col-lg-6 col-md-12 col-12 mt-6">
              <!-- card -->
              <div class="card ">
                <!-- card body -->
                <div class="card-body"><a href="/shop/categoryDelivery.do?deliveryCategoryId=1">
                  <!-- heading -->
                  <div class="d-flex justify-content-between align-items-center
                    mb-3">
                    <div>
                      <h4 class="mb-0">�Ͻ�</h4>
                    </div>
                  </div></a>
                </div>
              </div>
            </div>
            
            <div class="col-xl-3 col-lg-6 col-md-12 col-12 mt-6">
              <!-- card -->
              <div class="card ">
                <!-- card body -->
                <div class="card-body"><a href="/shop/categoryDelivery.do?deliveryCategoryId=7">
                  <!-- heading -->
                  <div class="d-flex justify-content-between align-items-center
                    mb-3">
                    <div>
                      <h4 class="mb-0">�н�ƮǪ��</h4>
                    </div>
                  </div></a>
                </div>
              </div>
            </div>
            
            <div class="col-xl-3 col-lg-6 col-md-12 col-12 mt-6">
              <!-- card -->
              <div class="card ">
                <!-- card body -->
                <div class="card-body"><a href="/shop/categoryDelivery.do?deliveryCategoryId=5">
                  <!-- heading -->
                  <div class="d-flex justify-content-between align-items-center
                    mb-3">
                    <div>
                      <h4 class="mb-0">���</h4>
                    </div>
                  </div></a>
                </div>
              </div>
            </div>
            
            <div class="col-xl-3 col-lg-6 col-md-12 col-12 mt-6">
              <!-- card -->
              <div class="card ">
                <!-- card body -->
                <div class="card-body"><a href="/shop/categoryDelivery.do?deliveryCategoryId=6">
                  <!-- heading -->
                  <div class="d-flex justify-content-between align-items-center
                    mb-3">
                    <div>
                      <h4 class="mb-0">�ƽþ�</h4>
                    </div>
                  </div></a>
                </div>
              </div>
            </div>
            
            <div class="col-xl-3 col-lg-6 col-md-12 col-12 mt-6">
              <!-- card -->
              <div class="card ">
                <!-- card body -->
                <div class="card-body"><a href="/shop/categoryDelivery.do?deliveryCategoryId=4">
                  <!-- heading -->
                  <div class="d-flex justify-content-between align-items-center
                    mb-3">
                    <div>
                      <h4 class="mb-0">����Ʈ</h4>
                    </div>
                  </div></a>
                </div>
              </div>
            </div>
            
            <div class="col-xl-3 col-lg-6 col-md-12 col-12 mt-6">
              <!-- card -->
              <div class="card ">
                <!-- card body -->
                <div class="card-body"><a href="/shop/categoryDelivery.do?deliveryCategoryId=8">
                  <!-- heading -->
                  <div class="d-flex justify-content-between align-items-center
                    mb-3">
                    <div>
                      <h4 class="mb-0">���ö�</h4>
                    </div>
                  </div></a>
                </div>
              </div>
            </div>
            
       
            
		<p>
          <div class="d-flex justify-content-between align-items-center"">
            <div></div>
          	<div> <a href="/shop/deliveryForm.do" class="btn btn-white">�� �ۼ� ��ư</a> </div>
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
                        <th>����</th>
                        <th>�ۼ���</th>
                        <th>�뷫�� �ּ�</th>
                        <th>���ĸ�</th>
                        <th>�ϷῩ��</th>
                        <th>�ۼ���</th>
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
</div>


</body>
</html>