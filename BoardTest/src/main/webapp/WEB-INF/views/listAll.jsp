<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" %>
<script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
<html>
<head>
	<title>Home</title>
	
<style>
table, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>

</head>
<body>
<h1>
	여기는 목록페이지입니다.  
</h1>
<b>세부 내용을 보고 싶으면 제목을 클릭하세요.</b>
<br>
<table>
	<tr>
		<td>번호</td>
		<td>제목</td>
<c:forEach items="${list}" var="BoardVO">
	<tr>
		<td>${BoardVO.bno}</td>
		<td><a href='/read?bno=${BoardVO.bno}'>${BoardVO.title}</a></td>
	</tr>

</c:forEach>
</table>
<form>
<input type="button" value="작성하기" onclick="window.location.href='/write'" />
</form>

</body>
</html>
