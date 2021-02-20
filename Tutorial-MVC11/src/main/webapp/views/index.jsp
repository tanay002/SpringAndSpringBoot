<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome ${name}....Please add two Numbers:-

<form action="add" method="get">
Number1 <input type="number" name="no1">
Number2 <input type="number" name="no2">
<input type="submit" value="add">
<a href="addData">Insert Data</a>

<a href="getData">Get Data</a>
</form>
</body>
</html>