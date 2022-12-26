<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>submit form</title>
</head>
<body>
	<h1>Data stored successfully!!!</h1>
	<%-- <h2>Name:  ${n}</h2>
	<h2>Password:  ${p}</h2>
	<h2>Email id:  ${e}</h2> --%>
	
	<h2>Name is:  ${user.name}</h2>
	<h2>Password is:  ${user.password}</h2>
	<h2>Email id is:  ${user.email}</h2>
	<h2><a href="index.jsp">Go to home page</a></h2>
	<h2><a href="contact.jsp">Go to contact page</a></h2>
</body>
</html>