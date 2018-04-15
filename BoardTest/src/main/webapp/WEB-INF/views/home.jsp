<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<form role="form" method="post">
	<div class="box-body">
		<div class="form-group">
			<label>title</label>
			<input type="text" name="title" class="form-control">
		</div>
		<div class="form-group">
			<label>content</label>
			<textarea rows="3" cols="5" name="content" class="form-control"></textarea>
		</div>
	</div>
	
	<div class="box=footer">
		<button type="submit" class="btn btn-primary">submit</button>
	</div>
	
</form>





<%-- <table>
	<tr>
		<th>bno</th>
		<th>title</th>
		<th>content</th>
	</tr>

	<tr>
		<th>${BoardVO.bno}</th>
		<th>${BoardVO.title}</th>
		<th>${BoardVO.content}</th>
	</tr>
</table> --%>


</body>
</html>
