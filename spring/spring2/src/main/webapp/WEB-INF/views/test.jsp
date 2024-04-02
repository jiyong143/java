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
   <h1>${user.id}</h1>
   <h1>${user.pw}</h1>
   <h1>${user.idPw}</h1>
   <!-- 축구, 야구, 농구,테니스, 음악감상 중에서 취미를 선택해서 서버에 전송하고,
    서버에서는 회면에서 보낸 취미를 콘솔에 출력하고 메인 페이지로 리다이렉트-->
    <form action="<c:url value="/hobby"/>" method="get">
       <h1>당신의 취미는?</h1>
       <label>
         <input type="checkbox" name="hobby" value="축구">축구 
       </label>
       <label>
         <input type="checkbox" name="hobby" value="야구">야구
       </label>
       <label>
         <input type="checkbox" name="hobby" value="농구">농구
       </label>
       <label>
         <input type="checkbox" name="hobby" value="테니스">테니스
       </label>
       <label>
         <input type="checkbox" name="hobby" value="음악감상">음악감상
       </label>
       <button type="submit">전송</button> 
    </form>
</body>
</html>