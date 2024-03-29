<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

  <h1>게시글 리스트</h1>
  
  <table class="table table-hover">
    <thead>
      <tr>
        <th>번호</th>
        <th>게시판</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성일</th>
        <th>조회수</th>
      </tr>
    </thead>
    <tbody>
     <c:forEach items="${postList}" var="post">
      <tr>
        <td>${post.po_num }</td>
        <td>${post.po_bo_name }</td>
        <td>${post.po_title }</td>
        <td>${post.po_me_id}(${post.po_me_name})</td>
        <td>${post.changeDate() }</td>
        <td>${post.po_views }</td>
      </tr>
     </c:forEach>
     <c:if test="${postList.size()==0 }">
       <tr>
         <td colspan="5">게시글이 없습니다.</td>
       </tr>
     </c:if>
    </tbody>
  </table>
  
  <!--  페이지네이션 -->
  
 
  <ul class="pagination justify-content-center">
 <c:if test="${pm.prev}">
 <c:url value="/post/list" var="url">
    <c:param name="page" value="${pm.startpage -1 }"/>  
 </c:url>
    <li class="page-item">
      <a class="page-link" href="${url }">이전</a>
    </li>
 </c:if>
 <c:forEach begin="${pm.startPage }" end="${pm.endPage }" var="i">
 <c:url value="/post/list" var="url">
    <c:param name="page" value="${i}"/> 
 </c:url>
    <li class="page-item <c:if test="${pm.cri.page==i }">active</c:if>">
       <a class="page-link" href="${url }">${i}</a>
    </li>
 </c:forEach>
  <c:if test="${pm.next}">
  <c:url value="/post/list" var="url">
    <c:param name="page" value="${pm.endPage + 1}"/> 
 </c:url>
    <li class="page-item">
      <a class="page-link" href="${url }">다음</a>
    </li>
  </c:if>
  </ul>