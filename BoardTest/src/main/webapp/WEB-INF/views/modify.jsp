<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>여기는 수정 페이지입니다.</h1>


<form role="form" method="post">

	<div class="form-group">
		번호<br>
		<input type="text" name="bno" value="${boardVO.bno}" readonly="readonly">
	</div>

	<div class="form-group">
		제목<br>
		<input type="text" name="title" value="${boardVO.title}">
	</div>
	
	<div class="form-group">
		내용<br>
		<textarea rows="3" name="content">${boardVO.content}</textarea>
	</div>
</form>
<br>
<button type="submit" class="save">저장</button>
<button type="submit" class="cancel">취소</button>

<script>
	$(document).ready(function() {

		var formObj = $("form[role='form']");

		$(".save").on("click", function() {
		    formObj.submit();
		});

		$(".cancel").on("click", function() {
			self.location = "/listAll";
		});

	});
</script>

</body>
</html>