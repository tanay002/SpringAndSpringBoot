<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome ${name}
<form action="reg" method="post">
Username<input type="text" name="uname">
Email<input type="text" name="uemail">
Mobileno<input type="number" name="umobno">
<input type="submit" value="register">
</form>
</body>
</html>