<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	여기는 글을 작성하는 페이지입니다. 
</h1>
<b>글을 다 작성하면 목록페이지로 넘어갑니다.</b>
<P>  The time on the server is ${serverTime}. </P>
<form role=form method="post">
title  <input type="text" name="title" value=${BoardVO.title }>
<br>
content  <input type="text" name="content" value=${BoardVO.content }>
<br>
<button type="submit">작성완료</button>
</form>
</body>
</html>
