<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
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
 

</style>


</head>
<body>

<div align="left" style="padding-left:380px;">
 <h2>마이페이지</h2>
 </div>
 <div align="center" >
  <table id="bigTable">
    <tr><td colspan="2" style="text-align: right; padding-right:50px" > <h4>${userInfo.nickname}님</h4> </td>
    </tr>
  	<tr>
	  	  <td style="text-align: center;">
	  	  <!-- 회원정보 수정 form -->
	  	  	<form:form modelAttribute="updateUserCommand" method="POST" action="/shop/mypageUpdate.do">
	  	    <table style="text-align: center; border: 1px solid #dddddd">
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">이메일</td>
					<td style="width:200px;" class="smallTd">${userInfo.email}</td>
					<td class="smallTd">*수정 불가</td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">이름</td>
					<td style="width:200px;" class="smallTd">${userInfo.name}</td>
					<td class="smallTd">*수정 불가</td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">비밀번호</td>
					<td style="width:200px;" class="smallTd">${userInfo.password}</td>
					<td class="smallTd"><form:input path="password" type="text" size="28" style="border:0 solid black" /></td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">닉네임</td>
					<td style="width:200px;" class="smallTd">${userInfo.nickname}</td>
					<td class="smallTd"><form:input path="nickname" type="text" size="28" style="border:0 solid black" /></td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">전화번호</td>
					<td style="width:200px;" class="smallTd">${userInfo.phone}</td>
					<td class="smallTd"><form:input path="phone" type="text" size="28" style="border:0 solid black" /></td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">주소</td>
					<td style="width:200px;" class="smallTd">${userInfo.address}</td>
					<td class="smallTd"><form:input path="address" type="text" size="28" style="border:0 solid black" /></td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">결제정보</td>
					<td style="width:200px;" class="smallTd">${userInfo.payment}</td>
					<td class="smallTd"><form:input path="payment" type="text" size="28" style="border:0 solid black" /></td>
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