<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>
    <% int num=10; %>
    <h1>메인 페이지 입니다.</h1>
    <a href="<%=request.getContextPath()%>?data=안녕">데이터 전송</a>
    <form action="<%=request.getContextPath()%>">
    <h2>form 태그 get 방식 전송</h2>
    <input type="text" name="id">
    <button>전송</button>
    </form>
    <h1><%=num %></h1>
    <h1><%=request.getContextPath()%></h1>
    <a href="<%=request.getContextPath()%>/login">로그인으로</a>
    <a href="<%=request.getContextPath()%>/signup">회원가입으로</a>
</body>
</html>