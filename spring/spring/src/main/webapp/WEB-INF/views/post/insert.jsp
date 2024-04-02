<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.js"></script>
</head>
<body>
<form action="<c:url value="/post/insert"/>" method="post">
	<h1>게시글 등록</h1>
	<div class="form-group">
		<label for="bo_title">게시판</label>
		<select name="po_bo_num" class="form-control">
			<c:forEach items="${boardList}" var="board">
				<option value="${board.bo_num}">${board.bo_title}</option>
			</c:forEach>
		</select>
	</div>
	<div class="form-group">
		<label for="po_title">제목</label>
		<input type="text" class="form-control" id="po_title" name="po_title">
	</div>
	<div class="form-group">
		<label for="po_content">내용</label>
		<textarea class="form-control" id="po_content" name="po_content"></textarea>
	</div>
	<button class="btn btn-outline-success col-12">게시글 등록</button>
</form>

<script type="text/javascript">
// 서버에 전송하기 전에 제목과 내용의  글자수 확인
  $("form").submit(function(){
	  let title = $("[name=po_title]").val();
	  if(title.length == 0){
		  alert("제목은 1글자 이상 입력해야 합니다.");
		  $("[name=po_titl]").focus();
		  return false;
	  }
	  let content = $("[name=po_content]").val();
	  if(content.length==0){
		  alert("내용은 1글자 이상 입력해야 합니다.");
		  $("[name=po_titl]").focus();
		  return false;
	  }
  })
</script>
</body>
</html>