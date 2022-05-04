<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
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
	        
    		<h2>배달음식 상세보기</h2>
    		
    		<form action="" method="POST" name="deliveryDetail">
    		    
    		    <div class="row col-md-12 col-sm-12">
	    		    <div class="form-group has-error col-md-9 col-sm-9" >
	    		        <label for="title">글 제목</label>
	    		        <input type="text" class="form-control no-gray" name="title" readonly/>
	    		    </div>
	    		    <div class="form-group has-error col-md-3 col-sm-3" >
	    		        <label for="writer">작성자</label>
	    		        <input type="text" class="form-control no-gray" name="writer" readonly />
    		   		 </div>
    		    </div>
    		   
    		
	    		<div class="form-group  col-md-6 col-sm-6"> 
	    			<div class="row">
	    				<div class="form-group  col-md-12 col-sm-12"> 
			    	        <label for="foodName">음식명</label>
			    	        <input type="text" class="form-control no-gray col-md-6 col-sm-6" name="foodName" readonly />
		    	        </div>
		    	        
		    	        <div class="form-group  col-md-12 col-sm-12"> 
			    	         <label for="address">대략적 주소</label>
		   		        	 <input type="text" class="form-control no-gray" name="address" readonly />
	           			</div>
	           			
	           			 <div class="form-group  col-md-12 col-sm-12">
	           			 	 <label for="address">완료 여부</label>
		   		        	 <input type="text" class="form-control no-gray" name="complete"  readonly />
	           			</div>
	           			
	           			 <div class="form-group  col-md-12 col-sm-12">
			    	         <label for="participants">참여자</label>
		   		        	 <input type="text" class="form-control no-gray" name="participants"  readonly />
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
<hr>

	<!-- 댓글 보기 -->
<div class="container mt-5">
    <div class="d-flex justify-content-center row">
         <div class="col-md-8 col-md-offset-2">
         	<h4>댓글</h4>
         	<form name="reply">
	            <div class="d-flex flex-column comment-section">
	                <div class="bg-white p-2">
	                    <div class="d-flex flex-row user-info">
	                        <div class="d-flex flex-column justify-content-start ml-2">
	                        	<span class="d-block font-weight-bold name">Marry Andrews</span>
	                        	<span><button type="submit" class="btn btn-info btn-xs">선택</button></span>
	                        </div>
	                    
	                    </div>
	                    <div class="mt-2">
	                    	<textarea class="form-control no-gray ml-1 shadow-none textarea" readonly>asdad</textarea>
	                    </div>
	                </div>
                </form>
               	<hr/>
               	<form name="addReply">
	                <div class="d-flex flex-row user-info">
	                     <div class="d-flex flex-column justify-content-start ml-2"><span class="d-block font-weight-bold name">Marry Andrews</span></div>
	                </div>
	                <div class="bg-light p-2">
	                    <div class="d-flex flex-row align-items-start"><textarea class="form-control ml-1 shadow-none textarea"></textarea></div>
	                    <div class="mt-2 text-right" style="padding-top:10px"><button class="btn btn-primary btn-sm shadow-none" type="button">댓글 등록</button></div>
	                </div>
	            </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>