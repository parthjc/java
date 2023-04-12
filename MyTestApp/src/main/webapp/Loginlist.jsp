<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="getlist" method="post" >
	<table>
	<br><br><br>
	<td>name</td>
	<tr><td><input type="text" name="name"></td></tr>
	<td>phone no</td>
	<tr><td><input type="number" name="number"></td></tr>
	
	<tr><td><input type="submit" name="submit"></td></tr>
	
	</table>
	</form>
	<br><br><br>
	<a href="showdata"><button type="button" name="submit">ShowData</button></a>	
	

</body>
</html>