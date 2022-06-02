<%@ page language="java" contentType="text/html;"
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

</head>
<body>
<%@ include file="../top.jsp" %>
<div class="container">
	<div class="row">
	    <div class="col-md-8 col-md-offset-2">
	        
    		<h2>회원간 거래 상세보기</h2>
 	    
    		    <div class="row col-md-12 col-sm-12">
	    		    <div class="form-group has-error col-md-9 col-sm-9" >
	    		        <label for="title">글 제목</label>
	    		        <input type="text" class="form-control no-gray" name="title" value="${sellPost.title}" readonly/>
	    		    </div>
	    		    <div class="form-group has-error col-md-3 col-sm-3" >
	    		        <label for="writer">작성자</label>
	    		        <input type="text" class="form-control no-gray" name="writer" value="${writtenUser.nickname}" readonly />
    		   		 </div>
    		    </div>
    		   
    		   	<div class="form-group  col-md-6 col-sm-6">
	           	 	<label for="address">완료 여부</label>
	           		 	 <c:if test="${sellPost.complete eq 'Y' or sellPost.complete eq 'y'}"><input type="text" class="form-control no-gray" name="complete" value="완료" readonly /></c:if>
						 <c:if test="${sellPost.complete eq 'N' or sellPost.complete eq 'n'}"><input type="text" class="form-control no-gray" name="complete" value="미완료" readonly /></c:if>    	 
	           	</div>
				<div class = "form-group col-md-6 col-sm-6">
					<label for="date">작성일자<span class="require"></span></label>
	    		       <input type="text" class="form-control no-gray" name="date" readonly value="<fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" 
	    		       		value="${sellPost.writtenDate}"/> "/>    	
				</div>
    		</div>
    		   
    		
	    		<div class="form-group col-md-8 col-md-offset-2 col-sm-8"> 
	    			<div class="row">
	    				<div class="form-group  col-md-12 col-sm-12"> 
			    	        <label for="detail">상세 내용</label>
			    	        <textarea class="form-control no-gray ml-1 shadow-none textarea" rows="4" name="detail" readonly>${sellPost.content}</textarea>
		    	        </div>	
		    	        
	           			
	           		</div>
	           		<div class="form-group">
				    		  <c:if test="${loginUser.nickname eq writtenUser.nickname}"><button type="submit" class="btn btn-primary"> 수정 </button></c:if>
				    		  <button class="btn btn-default"> 목록으로 돌아가기 </button>
				     </div>
	    	     </div>
		</div>
	</div>

<hr>

<!-- 댓글 보기 -->
<div class="container mt-5">
    <div class="d-flex justify-content-center row">
         <div class="col-md-8 col-md-offset-2">
         	<h4>댓글</h4>
         	
         	<c:forEach var="sellComment" items="${sellComments}">
         	<form name="reply">
	            <div class="d-flex flex-column comment-section">
	                <div class="bg-white p-2">
	                    <div class="d-flex flex-row user-info">
	                        <div class="d-flex flex-column justify-content-start ml-2">
	                        	<span class="d-block font-weight-bold name">${sellComment.nickname}</span>
	                        </div>
	                    
	                    </div>
	                    <div class="mt-2">
	                    	<textarea class="form-control no-gray ml-1 shadow-none textarea" readonly>${sellComment.comments}</textarea>
	                    </div>
	                </div>
                </form>
               	<hr/>
              </c:forEach>
              
              <!-- 댓글 등록 -->
             <form:form modelAttribute="addSCommentCommand" method="POST" action="/shop/insertSComment.do">
	                <div class="d-flex flex-row user-info">
	                     <div class="d-flex flex-column justify-content-start ml-2"><span class="d-block font-weight-bold name">${loginUser.nickname}</span></div>
	                </div>
	                <div class="bg-light p-2">
	                    <div class="d-flex flex-row align-items-start"><textarea class="form-control ml-1 shadow-none textarea" name="comments"></textarea></div>
	                    <div class="mt-2 text-right" style="padding-top:10px"><button class="btn btn-primary btn-sm shadow-none" type="submit">댓글 등록</button></div>
	                </div>
	                <input type="hidden" name="sellPostId" value="${sellPost.postId}"/>
	            </form:form>
        </div>
    </div>
</div>


</body>
</html>