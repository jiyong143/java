<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
</head>
<body>
  <h1>게시글 등록</h1>
  <form action="<c:url value="/post/insert"/>" method="post" enctype="multipart/form-data">
   <!-- 게시판 선택 -->
   <div class="form-group">
		<label for="bo_title">게시판</label>
		<select name="bo_co_num" class="form-control">
			<c:forEach items="${communityList}" var="co">
				<option value="${co.co_num}">${co.co_name}</option>
			</c:forEach>
		</select>
	</div>
	<div class="form-group">
		<label for="bo_title">제목</label>
		<input type="text" class="form-control" id="bo_title" name="bo_title">
	</div>
	<div class="form-group">
		<label for="bo_content">내용</label>
		<textarea class="form-control" id="bo_content" name="bo_content"></textarea>
	</div>
	<div class="form-group">
		<label>첨부파일(최대 3개)</label>
		<input type="file" class="form-control" name="file"></input>
		<input type="file" class="form-control" name="file"></input>
		<input type="file" class="form-control" name="file"></input>
	</div>
	<button class="btn btn-outline-success col-12">게시글 등록</button>
</form>
</body>
</html>