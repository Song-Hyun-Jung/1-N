<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>����������</title>
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
 <h2>����������</h2>
 </div>
 <div align="center" >
  <table id="bigTable">
    <tr><td colspan="2" style="text-align: right; padding-right:50px" > <h4>${userInfo.nickname}��</h4> </td>
    </tr>
  	<tr>
	  	  <td style="text-align: center;">
	  	  <!-- ȸ������ ���� form -->
	  	  	<form:form modelAttribute="updateUserCommand" method="POST" action="/shop/mypageUpdate.do">
	  	    <table style="text-align: center; border: 1px solid #dddddd">
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">�̸���</td>
					<td style="width:200px;" class="smallTd">${userInfo.email}</td>
					<td class="smallTd">*���� �Ұ�</td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">�̸�</td>
					<td style="width:200px;" class="smallTd">${userInfo.name}</td>
					<td class="smallTd">*���� �Ұ�</td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">��й�ȣ</td>
					<td style="width:200px;" class="smallTd">${userInfo.password}</td>
					<td class="smallTd"><form:input path="password" type="text" size="28" style="border:0 solid black" /></td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">�г���</td>
					<td style="width:200px;" class="smallTd">${userInfo.nickname}</td>
					<td class="smallTd"><form:input path="nickname" type="text" size="28" style="border:0 solid black" /></td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">��ȭ��ȣ</td>
					<td style="width:200px;" class="smallTd">${userInfo.phone}</td>
					<td class="smallTd"><form:input path="phone" type="text" size="28" style="border:0 solid black" /></td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">�ּ�</td>
					<td style="width:200px;" class="smallTd">${userInfo.address}</td>
					<td class="smallTd"><form:input path="address" type="text" size="28" style="border:0 solid black" /></td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">��������</td>
					<td style="width:200px;" class="smallTd">${userInfo.payment}</td>
					<td class="smallTd"><form:input path="payment" type="text" size="28" style="border:0 solid black" /></td>
				</tr>				
			</table>
			<br>
			<input type="submit" value="ȸ�� ���� ����">
			</form:form>
	  	  </td>
	  	   <td  style="width:100px; padding: 50px;">
		  	  <h4 class="card2"><a href="/shop/mypagePurchase.do">������ ��ǰ ���</a></h4>
		  	  <h4 class="card2"><a href="/shop/mypageCart.do">�� ���</a></h4>
		  	  <h4 class="card2"><a href="/shop/mypageDelivery.do">�ۼ��� ��� Ŀ�´�Ƽ ��</a></h4>
		  	  <h4 class="card2"><a href="/shop/mypageSell.do">�ۼ��� �̿� Ŀ�´�Ƽ ��</a></h4>
		  	</td>
  	  </tr>
	  	 
  </table>
</div>


</body>
</html>