<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form action="<c:url value="/send/object"/>" method="post">
      <input type="text" name="list[0].id" placeholder="아이디">
      <br>
      <input type="password" name="list[0].pw" placeholder="비밀번호"> 
      <br>
       <input type="text" name="list[1].id" placeholder="아이디">
      <br>
      <input type="password" name="list[1].pw" placeholder="비밀번호"> 
      <br>
       <input type="text" name="list[2].id" placeholder="아이디">
      <br>
      <input type="password" name="list[2].pw" placeholder="비밀번호"> 
      <br>
      <button type="submit">로그인</button>
   </form>
</body>
</html>