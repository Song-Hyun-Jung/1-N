<%@ page language="java" contentType="text/html; charset=UTF-8"
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
<div class="container">
	<div class="row">
	    <div class="col-md-8 col-md-offset-2">
	        
    		<h2>회원간 거래 글 수정</h2>
    		
    		<form action="" method="POST" name="deliveryDetail">
    		    
    		    <div class="row col-md-12 col-sm-12">
	    		    <div class="form-group has-error col-md-9 col-sm-9" >
	    		        <label for="title">글 제목<span class="require"></span></label>
	    		        <input type="text" class="form-control" name="title" />
	    		    </div>
	    		    <div class="form-group has-error col-md-3 col-sm-3" >
	    		        <label for="writer">작성자<span class="require"></span></label>
	    		        <input type="text" class="form-control no-gray" name="writer" readonly />
    		   		 </div>
    		   		 <div class = "form-group col-md-6 col-sm-6">
					      <label for="category">음식 카테고리</label>	 
					      <select class="form-control input-sm" id="category">				      
								<option>--카테고리--</option>
								<option value="digital">디지털기기</option>
								<option value="appliance">생활가전</option>
								<option value="furniture">가구/인테리어</option>
								<option value="living">생활/가공식품</option>
								<option value="sport"> 스포츠/레저</option>
								<option value="fashion">패션/잡화/의류</option>
								<option value="hobby">게임/취미</option>
								<option value="beauty">뷰티/미용</option>
								<option value="pet">반려동물용품</option>
								<option value="plant">식물</option>
								<option value="book">도서/티켓/음반</option>
								<option value="etc">기타 중고물품</option>
						   </select>
					</div>
					<div class = "form-group col-md-6 col-sm-6">
						<label for="date">작성일자<span class="require"></span></label>
	    		        <input type="text" class="form-control no-gray" name="date" readonly />
					</div>
    		    </div>
    		   
    		
	    		<div class="form-group  col-md-8 col-sm-8"> 
	    			<div class="row">
	    				<div class="form-group  col-md-12 col-sm-12"> 
			    	        <label for="detail">상세 내용</label>
			    	        <textarea class="form-control no-gray ml-1 shadow-none textarea" rows="4" name="detail"></textarea>
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