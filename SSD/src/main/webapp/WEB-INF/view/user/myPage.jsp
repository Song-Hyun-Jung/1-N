<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
 <h2>����������</h2>

  <table id="bigTable">
    <tr><td colspan="2" style="text-align: right;" > <h4>���� ��</h4> </td>
    </tr>
  	<tr>
	  	  <td style="text-align: center;">
	  	  <!-- ȸ������ ���� form -->
	  	    <table style="text-align: center; border: 1px solid #dddddd">
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">�̸���</td>
					<td style="width:200px;" class="smallTd"></td>
					<td class="smallTd">*���� �Ұ�</td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">�̸�</td>
					<td style="width:200px;" class="smallTd"></td>
					<td class="smallTd">*���� �Ұ�</td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">��й�ȣ</td>
					<td style="width:200px;" class="smallTd"></td>
					<td class="smallTd"><input type="text" size="28" style="border:0 solid black"></td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">�г���</td>
					<td style="width:200px;" class="smallTd"></td>
					<td class="smallTd"><input type="text" size="28" style="border:0 solid black"></td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">��ȭ��ȣ</td>
					<td style="width:200px;" class="smallTd"></td>
					<td class="smallTd"><input type="text" size="28" style="border:0 solid black"></td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">�ּ�</td>
					<td style="width:200px;" class="smallTd"></td>
					<td class="smallTd"><input type="text" size="28" style="border:0 solid black"></td>
				</tr>
				<tr>
					<td style="background-color: #eeeeee; text-align: center; width:120px;" class="smallTd">��������</td>
					<td style="width:200px;" class="smallTd"></td>
					<td class="smallTd"><input type="text" size="28" style="border:0 solid black" ></td>
				</tr>				
			</table>
			<br>
			<input type="submit" value="ȸ�� ���� ����">
	  	  </td>
	  	   <td  style="width:100px; padding: 50px;">
		  	  <h4 class="card2">������ ��ǰ ���</h4>
		  	  <h4 class="card2">�� ���</h4>
		  	  <h4 class="card2">�ۼ��� ��� Ŀ�´�Ƽ ��</h4>
		  	  <h4 class="card2">�ۼ��� �̿� Ŀ�´�Ƽ ��</h4>
		  	</td>
  	  </tr>
	  	 
  </table>
	


</body>
</html>