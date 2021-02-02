<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
         pageEncoding="UTF-8"%>
<html>
<head>
    <head>
        <meta charset="UTF-8" >
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.js"></script>
        <title>게시판</title>
</head>
<body>

<div>
    <table border="1">
        <tr>
            <td  bgcolor="" width="100">번호</td>
            <td bgcolor="" width="100">제목</td>
            <td bgcolor="" width="100">작성일</td>
            <td bgcolor="" width="100">작성자</td>
            <td bgcolor="" width="100">조회수</td>
        </tr>
        <c:forEach var="board" items="${list}">
            <tr>
                <td>${board.bno}</td>
                <td>${board.title}</td>
                <td>${board.regDate}</td>
                <td>${board.writer}</td>
                <td>${board.viewCnt}</td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="#">글쓰기</a>
    <div id="pagingDiv">
<%--        <c:if test="${paging.}">--%>

<%--        </c:if>--%>
    </div>
</div>
</body>
</html>
