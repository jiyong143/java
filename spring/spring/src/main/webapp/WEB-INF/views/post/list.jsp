<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

  <h1>게시글 리스트</h1>
  
  <table class="table table-hover">
    <thead>
      <tr>
        <th>번호</th>
        <th>제목</th>
        <th>내용</th>
        <th>작성자</th>
        <th>작성일</th>
        <th>조회수</th>
      </tr>
    </thead>
    <tbody>
     <c:forEach items="${postList}" var="post">
      <tr>
        <td>${post.po_num }</td>
        <td>${post.po_title }</td>
        <td>${post.po_content }</td>
        <td>${post.po_me_id}(${post.po_me_name})</td>
        <td>${post.changeDate() }</td>
        <td>${post.po_views }</td>
      </tr>
     </c:forEach>
     <c:if test="${postList.size()==0 }">
       <tr>
         <td colspan="6">게시글이 없습니다.</td>
       </tr>
     </c:if>
    </tbody>
  </table>
