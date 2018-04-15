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


<table>
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
</table>


</body>
</html>
