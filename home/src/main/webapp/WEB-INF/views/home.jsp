<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%
    int num=10;
    %>
    <h1>메인 페이지입니다.</h1>
    <a href="<%=request.getContextPath()%>?data=안녕">데이터 전송</a>
    <form action="<%=request.getContextPath()%>">
        <h2>form 태그 get 방식 전송</h2>
        <input type="text" name="id">
        <button>전송</button>
    </form>
    <h1><%=num %></h1>
    <a href="<%=request.getContextPath()%>/login">로그인으로</a>
    <a href="<%=request.getContextPath()%>/signup">회원가입으로</a>
    <h1>서버에서 보낸 나이 : ${age}</h1>
    <script type="text/javascript">
        let age = 20;
        let str = `나이 : \${age}`; // jsp 안에 js 에서  ${} 쓸때는 앞에 \ 붙인다 
        console.log(str);
    </script>
</body>
</html>