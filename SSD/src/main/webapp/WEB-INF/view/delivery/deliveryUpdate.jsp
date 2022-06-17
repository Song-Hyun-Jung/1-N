<%@ page language="java" contentType="text/html;"
    pageEncoding="UTF-8"%>

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

</head>
<body>
<%@ include file="../top.jsp" %>
<div class="container">
	<div class="row">
	    <div class="col-md-8 col-md-offset-2">
	        
    		<h2>배달음식 글 수정</h2>
    		
    		<form action="" method="POST" name="deliveryDetail">
    		    
    		    <div class="row col-md-12 col-sm-12">
	    		    <div class="form-group has-error col-md-9 col-sm-9" >
	    		        <label for="title">글 제목<span class="require"></span></label>
	    		        <input type="text" class="form-control" name="title" value="${deliveryPost.title}" />
	    		    </div>
	    		    <div class="form-group has-error col-md-3 col-sm-3" >
	    		        <label for="writer">작성자<span class="require"></span></label>
	    		        <input type="text" class="form-control no-gray" name="writer" value="${writtenUser.nickname}" readonly />
    		   		 </div>
    		   		 <div class = "form-group col-md-6 col-sm-6">
					      <label for="category">음식 카테고리</label>	 
					      <select class="form-control input-sm" id="category">
								<option>--카테고리--</option>
								<option value="japanese">돈까스 회 일식</option>
								<option value="chinese">중식</option>
								<option value="chicken">치킨</option>
								<option value="noodle">백반 죽 국수</option>
								<option value="dessert">카페 디저트</option>
								<option value="snackBar">분식</option>
								<option value="soup">찜 탕 찌개</option>
								<option value="western">양식</option>
								<option value="meet">고기 구이</option>
								<option value="asian">아시안</option>
								<option value="fastFood">패스트푸드</option>
								<option value="lunchBox">도시락</option>
						   </select>
					</div>
					<div class = "form-group col-md-6 col-sm-6">
						<label for="date">작성일자<span class="require"></span></label>
	    		        <input type="text" class="form-control no-gray" name="date" readonly />
					</div>
    		    </div>
    		   
    		
	    		<div class="form-group  col-md-6 col-sm-6"> 
	    			<div class="row">
	    				<div class="form-group  col-md-12 col-sm-12"> 
			    	        <label for="foodName">음식명</label>
			    	        <input type="text" class="form-control col-md-6 col-sm-6" name="foodName" value="${deliveryPost.title}" readonly/>
		    	        </div>
		    	        <div class="form-group  col-md-12 col-sm-12"> 
			    	        <label for="divide">나눌 인원</label>
			    	        <input type="text" class="form-control col-md-6 col-sm-6" name="divide"  value="${deliveryPost.title}" readonly/>
		    	        </div>
		    	        <div class="form-group  col-md-12 col-sm-12"> 
			    	         <label for="address">대략적 주소</label>
		   		        	 <input type="text" class="form-control" name="address" value="${deliveryPost.title}" readonly/>
	           			</div>
	           			
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
	           			
	           			 <div class="form-group  col-md-12 col-sm-12"> 
			    	         <label for="participants">참여자</label>
		   		        	 <input type="text" class="form-control" name="participants" readonly/>
	           			</div>
	           			
	           		</div>
	           		<div class="form-group">
				    		  <button type="submit" class="btn btn-primary"> 수정 </button>
				    		  <button class="btn btn-default"> 목록으로 돌아가기 </button>
				     </div>
	    	     </div>
    		</form>	
		</div>
	</div>
</div>


</body>
</html>