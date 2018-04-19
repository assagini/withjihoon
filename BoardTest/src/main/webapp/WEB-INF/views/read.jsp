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
<h1>여기는 상세보기 페이지입니다.</h1>
<b>이 페이지에서는 수정이 안됩니다. 수정을 하고 싶으면 밑에 수정버튼을 눌러주세요.</b>

	<form role="form" method="post">
		<input type='hidden' name='bno' value="${boardVO.bno}">
	</form>


	<div>
		제목<br>
		<input type="text" value="${boardVO.title}" readonly="readonly">
	</div>
	
	<div>
		내용<br>
		<textarea rows="3" readonly="readonly">${boardVO.content}</textarea>
	</div>
		
	<br>					
	<button type="submit" class="modify">수정</button>
	<button type="submit" class="remove">삭제</button>
	<button type="submit" class="listAll">목록</button>
	
	<form role="form" method="post">
		<input type='hidden' name='bno' value="${boardVO.bno}">
	</form>


	

</body>

<script>
$(document).ready(function(){
	
	var formObj = $("form[role='form']");		//이렇게 써서 입력되어 있는 내용을 보내는 거 같다.
	
	console.log("formObj가 뭐야?"+formObj);
	
	$(".modify").on("click", function(){		//.btn-warning로 클릭하면 처리되게 했다.
		
	    formObj.attr("action", "/modify");
		formObj.attr("method", "get");		
		formObj.submit();
	});
	
	$(".remove").on("click", function(){
		formObj.attr("action", "/remove");
		formObj.submit();
	});
	
	$(".listAll").on("click", function(){
		self.location = "/listAll";
	});
	
});
</script>
</html>