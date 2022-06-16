<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	
	<style>
		hr {
		  border: 0;
		  clear:both;
		  display:block;
		        
		  background-color:#428BCA;
		  height: 2px;
		}
				
		
		.date {
		    font-size: 11px
		}
		
		.comment-text {
		    font-size: 12px
		}
		
		.fs-12 {
		    font-size: 12px
		}
		
		.shadow-none {
		    box-shadow: none
		}
		
		.name {
		    color: #007bff
		}
		
		.cursor:hover {
		    color: blue
		}
		
		.cursor {
		    cursor: pointer
		}
		
		.textarea {
		    resize: none
		}
		.form-control[readonly].no-gray {
		  background-color:white;
		}
	</style>
<script language="javascript">
function checkAll() {
    if (registerForm.title.value=="") {
    	alert("글 제목 확인하세요");
        return false;
    }
    if (registerForm.content.value=="") {
    	alert("글 내용 확인하세요");
        return false;
    }
    if (registerForm.sellCategoryId.value==0) {
    	alert("거래 카테고리 확인하세요");
        return false;
    }
   	registerForm.submit();
}
</script>
</head>
<body>
<div class="container">
	<div class="row">
	    <div class="col-md-8 col-md-offset-2">
	        
    		<h2>회원간 거래 글 작성</h2>
    		
    		<form:form name="registerForm" modelAttribute="SellPostCommand" method="POST" onsubmit="return checkAll()" action="/shop/insertSell.do">   
    		    <div class="row col-md-12 col-sm-12">
	    		    <div class="form-group has-error col-md-9 col-sm-9" >
	    		        <label for="title">글 제목<span class="require"></span></label>
	    		        <input type="text" class="form-control" name="title" />
	    		    </div>
    		   		 <div class = "form-group col-md-6 col-sm-6">
					      <label for="sellCategoryId">거래 카테고리</label>	 
					      <select class="form-control input-sm" name="sellCategoryId">				      
								<option>--카테고리--</option>
								<option value="1" selected>디지털기기</option>
								<option value="2">생활가전</option>
								<option value="3">가구/인테리어</option>
								<option value="4">게임/취미</option>
								<option value="5">패션/잡화/의류</option>
								<option value="6">반려동물용품</option>
								<option value="8">기타 중고물품</option>
						   </select>
					</div>
    		    </div>
    		   
    		
	    		<div class="form-group  col-md-8 col-sm-8"> 
	    			<div class="row">
	    				<div class="form-group  col-md-12 col-sm-12"> 
			    	        <label for="content">상세 내용</label>
			    	        <textarea class="form-control no-gray ml-1 shadow-none textarea" rows="4" name="content"></textarea>
		    	        </div>	
		    	        <!--  
	           			<div class="form-group  col-md-12 col-sm-12">
	           			 	 <label for="address">완료 여부</label>
			    	         <div>
								  <input type="radio" id="completed" name="complete" value="완료">
								  <label for="complete">완료</label>
							</div>
							<div>
								  <input type="radio" id="uncompleted" name="complete" value="미완료"   checked>
								  <label for="uncomplete">미완료</label>
							</div>
	           			</div>
	           			-->
	           		</div>
	           		<div class="form-group">
				    		  <button type="submit" class="btn btn-primary">글 등록</button>
				    </div>
				    </form:form>
				    
				    <div class="form-group">
			  		  <button class="btn btn-default">
				   		<a href='<c:url value="/shop/sellMain.do"/>'>목록으로 돌아가기</a>
				       </button>
				    </div>
		</div>
	</div>
</div>


</body>
</html>