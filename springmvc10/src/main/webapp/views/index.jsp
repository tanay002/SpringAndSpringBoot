<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 	Welcome to Tanay
 	
 	<form action="addUser">
 		Enter your city : <input type="text" name="ucity"><br>
 		Enter your name : <input type="text" name="uname"><br>
 		<input type="submit">
 	</form>
 	<hr>
 	<form action="getUser" method="get">
 		Enter your id : <input type="text" name="aid"><br>
 		</form>
</body>
</html>