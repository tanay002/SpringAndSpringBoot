<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

This is Index Page
<h4>Insert Data</h4>
<form action="adduser">
Id<input type="text" name="uid">
Uname<input type="text" name="uname">
ucity<input type="text" name="ucity">
<input type="submit">
</form>
<h4>Get Users Data</h4>
<form action="getuser">
Id<input type="text" name="uid">
<input type="submit">
</form>

</body>
</html>