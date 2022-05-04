<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
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
 <h2>마이페이지</h2>

  <table id="bigTable">
    <tr><td colspan="2" style="text-align: right;" > <h4>땡땡 님</h4> </td>
    </tr>
  	<tr>
	  	  <td style="text-align: center;">
	  	  <!-- 회원정보 수정 form -->
	  	    <table style="text-align: center; border: 1px solid #dddddd">
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">이메일</td>
					<td style="width:200px;" class="smallTd"></td>
					<td class="smallTd">*수정 불가</td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">이름</td>
					<td style="width:200px;" class="smallTd"></td>
					<td class="smallTd">*수정 불가</td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">비밀번호</td>
					<td style="width:200px;" class="smallTd"></td>
					<td class="smallTd"><input type="text" size="28" style="border:0 solid black"></td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">닉네임</td>
					<td style="width:200px;" class="smallTd"></td>
					<td class="smallTd"><input type="text" size="28" style="border:0 solid black"></td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">전화번호</td>
					<td style="width:200px;" class="smallTd"></td>
					<td class="smallTd"><input type="text" size="28" style="border:0 solid black"></td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">주소</td>
					<td style="width:200px;" class="smallTd"></td>
					<td class="smallTd"><input type="text" size="28" style="border:0 solid black"></td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">결제정보</td>
					<td style="width:200px;" class="smallTd"></td>
					<td class="smallTd"><input type="text" size="28" style="border:0 solid black" ></td>
				</tr>				
			</table>
			<br>
			<input type="submit" value="회원 정보 수정">
	  	  </td>
	  	   <td  style="width:100px; padding: 50px;">
		  	  <h4 class="card2">구매한 상품 목록</h4>
		  	  <h4 class="card2">찜 목록</h4>
		  	  <h4 class="card2">작성한 배달 커뮤니티 글</h4>
		  	  <h4 class="card2">작성한 이웃 커뮤니티 글</h4>
		  	</td>
  	  </tr>
	  	 
  </table>
	


</body>
</html>