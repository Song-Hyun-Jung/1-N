<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<title>회원가입</title>
		
	<!-- Bootstrap -->
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/dcalendar.picker.css" rel="stylesheet">
	<style type="text/css">
		#deceased{
		   background-color:#FFF3F5;
		   padding-top:10px;
		   margin-bottom:10px;
		}
		.remove_field{
			float:right;	
			cursor:pointer;
			position : absolute;
		}
		.remove_field:hover{
			text-decoration:none;
		}
		label{
			font-size:15px;
		    display: block; /* add this */
		    padding-top: 15px;
		}
	</style>
	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="js/jquery-1.12.4.js"></script>
	<script src="js/dcalendar.picker.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
  </head>
  <body>
	<div class="panel panel-primary" style="margin:40px;">
		<div class="panel-heading">
	        <h3 class="panel-title">Registration Form</h3>
		</div>
		<div class="panel-body">
		<form name="registerForm">
			<div class="col-md-12 col-sm-12" ></div>
			<div class="form-group col-md-6 col-sm-6" style="padding-right:30px">
	            <label for="email">이메일</label>
	            <input type="email" class="form-control input-sm" id="email" placeholder="">
	           
	            <label for="name">이름</label>
	            <input type="text" class="form-control input-sm" id="name" placeholder="">
	           
	            <label for="nickname">닉네임</label>
	            <input type="text" class="form-control input-sm" id="nickname" placeholder="">
	            
	            <label for="password">비밀번호</label>
	            <input type="password" class="form-control input-sm" id="password" placeholder="">
	            
	            <label for="passwordCheck">비밀번호 재확인</label>
	            <input type="password" class="form-control input-sm" id="passwordCheck" placeholder="">
	            
	            <label for="phone">전화번호</label>
	            <input type="text" class="form-control input-sm" id="phone" placeholder="">
	   		</div>
	    
	   		<div class="form-group col-md-6 col-sm-6">
			    <label for="address">주소</label>
			    <textarea class="form-control input-sm" id="address" rows="4"></textarea>
			      
			    <label for="payment">결제정보</label>
		        <textarea class="form-control input-sm" id="payment" rows="3"></textarea>
			</div>
	  
	   		<div class="col-md-12 col-sm-12"> </div>
			<div class="form-group col-md-6 col-sm-6 pull-right" align="right">
				<input type="submit" class="btn btn-primary" value="회원가입" style="width:200px;height:50px; font-size:20px"/>
			</div>
		</form>
		</div>
	</div>
	</body>
</html>