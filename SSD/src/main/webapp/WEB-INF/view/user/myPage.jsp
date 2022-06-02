<%@ page language="java" contentType="text/html;"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<style>
	 table {
	 	width:550px; height:300px;
	 }
	 
	 
	 .smallTd {
	 	border-width:thin;
	 	border: 1px solid #dddddd;
	 }
	
	.card2 {
		 padding:10px 30px;
		 border-radius: 15px;
		 border-style:solid;
	  	 border-color:gray;
	  	 border-width:thin;
	  	 text-align:center;
	  	 width:230px; height:20px;
	}
 	#errorStyle{
 		color:red;
 		font-size:x-small;
 	}

</style>


</head>
<body>

<%@ include file="../top.jsp" %>
<div align="left" style="padding-left:380px;">
 <h2>마이페이지</h2>
 </div>
 <div align="center" >
  <table id="bigTable">
    <tr><td colspan="2" style="text-align: right; padding-right:50px" > <h4>${loginMember.nickname}님</h4> </td>
    </tr>
  	<tr>
	  	  <td style="text-align: center;">
	  	  <!-- 회원정보 수정 form -->
	  	  	<form:form modelAttribute="updateUserCommand" method="POST" action="/shop/mypageUpdate.do">
	  	    <table style="text-align: center; border: 1px solid #dddddd">
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">이메일</td>
					<td style="width:200px;" class="smallTd">${loginMember.email}</td>
					<td class="smallTd">*수정 불가</td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">이름</td>
					<td style="width:200px;" class="smallTd">${loginMember.name}</td>
					<td class="smallTd">*수정 불가</td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">비밀번호</td>
					<td style="width:200px;" class="smallTd">${loginMember.password}</td>
					<td class="smallTd"><form:input path="password" type="text" size="28" style="border:0 solid black" />
					<form:errors path="password"  id="errorStyle"></form:errors></td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">닉네임</td>
					<td style="width:200px;" class="smallTd">${loginMember.nickname}</td>
					<td class="smallTd"><form:input path="nickname" type="text" size="28" style="border:0 solid black" />
					<form:errors path="nickname" id="errorStyle"></form:errors></td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">전화번호</td>
					<td style="width:200px;" class="smallTd">${loginMember.phone}</td>
					<td class="smallTd"><form:input path="phone" type="text" size="28" style="border:0 solid black" />
					<form:errors path="phone"  id="errorStyle"></form:errors></td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">주소</td>
					<td style="width:200px;" class="smallTd">${loginMember.address}</td>
					<td class="smallTd"><form:input path="address" type="text" size="28" style="border:0 solid black" />
					<form:errors path="address"  id="errorStyle"></form:errors></td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">결제정보</td>
					<td style="width:200px;" class="smallTd">${loginMember.payment}</td>
					<td class="smallTd"><form:input path="payment" type="text" size="28" style="border:0 solid black" />
					<form:errors path="payment"  id="errorStyle"></form:errors></td>
				</tr>				
			</table>
			<br>
			<input type="submit" value="회원 정보 수정">
			</form:form>
	  	  </td>
	  	   <td  style="width:100px; padding: 50px;">
		  	  <h4 class="card2"><a href="/shop/mypagePurchase.do">구매한 상품 목록</a></h4>
		  	  <h4 class="card2"><a href="/shop/mypageCart.do">찜 목록</a></h4>
		  	  <h4 class="card2"><a href="/shop/mypageDelivery.do">작성한 배달 커뮤니티 글</a></h4>
		  	  <h4 class="card2"><a href="/shop/mypageSell.do">작성한 이웃 커뮤니티 글</a></h4>
		  	</td>
  	  </tr>
	  	 
  </table>
</div>


</body>
</html>