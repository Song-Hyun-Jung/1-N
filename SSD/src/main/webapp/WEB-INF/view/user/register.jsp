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
	
	<script language="javascript">
	function checkAll() {
	    if (!checkExistData(registerForm.name.value, "이름")) {
	        return false;
	    }
	    if (!checkPassword(registerForm.password.value, registerForm.passwordCheck.value)) {
	        return false;
	    }
	    if (!checkMail(registerForm.email.value)) {
	        return false;
	    }
	    if (!checkExistData(registerForm.nickname.value, "닉네임")) {
	        return false;
	    }
	   
	    if (!checkExistData(registerForm.phone, "전화번호")) {
	        return false;
	    }
	    if (!checkExistData(registerForm.address, "주소")) {
	        return false;
	    }
	    if (!checkExistData(registerForm.payment, "결제정보")) {
	        return false;
	    }
	    
	    if (!checkIntro()) {
	        return false;
	    }
	
	    return true;
	}
	function checkMail(mail) {
        //mail이 입력되었는지 확인하기
        if (!checkExistData(mail, "이메일을"))
            return false;
 
        var emailRegExp = /^[A-Za-z0-9_]+[A-Za-z0-9]*[@]{1}[A-Za-z0-9]+[A-Za-z0-9]*[.]{1}[A-Za-z]{1,3}$/;
        if (!emailRegExp.test(mail)) {
            alert("이메일 형식이 올바르지 않습니다!");
            registerForm.email.value = "";
            registerForm.email.focus();
            return false;
        }
        return true; //확인이 완료되었을 때
    }
	function checkExistData(value, dataName) {
    	if (value == "") {
            alert(dataName + " 입력해주세요!");
            return false;
        }
        return true;
    }
	function checkPassword(password1, password2){
		if (!checkExistData(password1, "비밀번호를"))
            return false;
        //비밀번호 확인이 입력되었는지 확인하기
        if (!checkExistData(password2, "비밀번호 확인을"))
            return false;
	
		var pw = password1;
			
		var reg = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,32}$/;
		var hangulcheck = /[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;
		 
		if(false === reg.test(pw)) {
			alert('비밀번호는 8자 이상 32자 이하 이어야 하며, 숫자/대문자/소문자/특수문자를 모두 포함해야 합니다.');
			registerForm.password.focus();
			return false;
		}else if(/(\w)\1\1\1/.test(pw)){
		 	alert('같은 문자를 4번 이상 사용하실 수 없습니다.');
		 	registerForm.password.focus();
		 	return false;
		 }else if(pw.search(/\s/) != -1){
		 	alert("비밀번호는 공백 없이 입력해주세요.");
		 	registerForm.password.focus();
		 	return false;
		 }else if(hangulcheck.test(pw)){
			 alert("비밀번호에 한글을 사용 할 수 없습니다.");
			 registerForm.password.focus();
			return false; 
		 }else if(!checkIt(password1, password2)){
		 	return false;
		 }else{
			return true;
		}
		return true;
	}
	
	function checkIt(password1, password2){
		
		if (password1 != password2) {
			alert("비밀번호가 일치하지 않습니다");
			return false;
		}
		if(registerForm.password.value.length <8 || registerForm.password.value.length > 32){
			alert("비밀번호를 8~32자 사이로 입력하세요");
			return false;
		}
		
		return true;
	}
	
</script>
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
		
		<form name="registerForm" method="POST" onsubmit="return checkAll()" action="/shop/register">
			<div class="col-md-12 col-sm-12" ></div>
			<div class="form-group col-md-6 col-sm-6" style="padding-right:30px">
	            <label for="email">이메일</label>
	            <input type="email" class="form-control input-sm" id="email" name="email" placeholder="">
	           
	            <label for="name">이름</label>
	            <input type="text" class="form-control input-sm" id="name" name="name" placeholder="">
	           
	            <label for="nickname">닉네임</label>
	            <input type="text" class="form-control input-sm" id="nickname" name="nickname" placeholder="">
	            
	            <label for="password">비밀번호</label>
	            <input type="password" class="form-control input-sm" id="password" name="password" placeholder="">
	            
	            <label for="passwordCheck">비밀번호 재확인</label>
	            <input type="password" class="form-control input-sm" id="passwordCheck" name="passwordCheck" placeholder="">
	            
	            <label for="phone">전화번호</label>
	            <input type="text" class="form-control input-sm" id="phone" name="phone" placeholder="">
	   		</div>
	    
	   		<div class="form-group col-md-6 col-sm-6">
			    <label for="address">주소</label>
			    <textarea class="form-control input-sm" id="address" name="address" rows="4"></textarea>
			      
			    <label for="payment">결제정보</label>
		        <textarea class="form-control input-sm" id="payment" name="payment"  rows="3"></textarea>
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