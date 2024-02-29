<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/signup" method="post">
    <input type="text" name="id" placeholder="아이디">
    <br>
    <input type="password" name="pw" placeholder="비밀번호">
    <br>
    <input type="password" name="pw2" placeholder="비밀번호 확인">
    <br>
    <input type="text" name="email" placeholder="이메일">
    <br>
    <input type="text" name="name" placeholder="닉네임">
    <br>
    <input type="int" name="birth" placeholder="생년월일">
    <br>
    <input type="text" name="phone" placeholder="전화번호">
    <br>
    <input type="text" name="address" placeholder="주소">
    <button>회원가입</button>
</form>
</body>
</html>