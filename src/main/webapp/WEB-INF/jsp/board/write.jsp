<%@ page language="java" contentType="text/html; charset=EUC-KR"
         pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.js"></script>
    <title>kuzuro 게시판</title>
</head>
<body>
<div id="root">

    <hr />
    <nav>
        처음화면 - 글쓰기 - 로그인
    </nav>
    <hr />
    <section id="container">
        <form>
            <p>
                <label for="title">글 제목</label><input type="text" id="title" name="title" />
            </p>
            <p>
                <label for="content">글 내용</label><textarea id="content" name="content"></textarea>
            </p>
            <p>
                <label for="writer">작성자</label><input type="text" id="writer" name="writer" />
            </p>
        </form>
        <button id="btn-save">글쓰기</button>
    </section>
    <hr/>
</div>
<script  src="/js/board.js"></script>
</body>
</html>