<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>contact page</title>
</head>
<body>
	<h1>Registraction form</h1>
	
	<form action="submitform" method="post">
		<table>
		<tr><td>Enter the name: </td><td><input type="text" name="name"> </td></tr>
		<tr><td>Enter the password: </td><td><input type="password" name="password"> </td></tr>
		<tr><td>Enter the email id: </td><td><input type="email" name="email"> </td></tr>
		<tr><td><input type="submit" name="submit"></td></tr>
		</table>
	</form>
	
</body>
</html>