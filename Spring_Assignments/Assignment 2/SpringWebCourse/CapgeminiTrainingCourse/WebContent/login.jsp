<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= request.getAttribute("message") %><br><br>
<form action = "Login" method = "post">
			User Name: <input type = "text" name = "uname" placeholder = "Enter user name"><br><br>
			Password: <input type = "password" name = "pwd" placeholder = "Enter password"><br><br>
			<input type = "submit" value = "Login"/>
	</form> <br>
<a href="newUser">New User</a>
</body>
</html>