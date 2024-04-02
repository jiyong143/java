<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<!-- 서버로 id를 입력해서 전송하도록 코드를 작성해서 테스트해보세요.
테스트 결과 
sts 콘솔창에 화면에서 보낸 id 가 출력
 -->
 <form action="<c:url value="/id"/>" method="get">
 <input type="text" name="id" placeholder="아이디 입력">
 <button type="submit">전송</button>
 </form>
 <!-- a 태그 이용하여 서버에 이름을 전송해서 sts 콘솔창에 출력하는 코드 작성 
  -->
  <a href="<c:url value="/name?name=홍길동"/>">이름 전송</a>
  
  <!-- LoginDTO 클래스를 이용하여 id 와 pw를 서버로 전송하고, 
   서버에서는 화면에서 보낸 id와 pw를 콘솔창에 출력하는 코드를 작성 
    -->
   <form action="<c:url value="/login"/>" method="post">
      <input type="text" name="id" placeholder="아이디">
      <br>
      <input type="password" name="pw" placeholder="비밀번호"> 
      <br>
      <button type="submit">로그인</button>
   </form>
   <a href="<c:url value="/send/object"/>">객체 여러개를 서버에 전송하기</a>
   <br>
   <a href="<c:url value="/send/path/123"/>">경로에 데이터를 추가해서 전송하기</a>
   <br>
   <a href="<c:url value="/ajax"/>">ajax 예제</a>
</body>
</html>
