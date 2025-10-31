<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RegSuccessPg</title>
</head>
<body>
	<div align="center">
		<h2>Registration Success!!!</h2>
		<p>Name : ${regDTO.name}</p>
		<p>User Name : ${regDTO.loginDTO.userName}</p>
		<p>Password : ${regDTO.loginDTO.password}</p>
		<p>Email : ${regDTO.emailDTO.email}</p>
		<p>Phone No : ${regDTO.phoneNo}</p>


		<a href="login">CLick Here!!! LoginPage</a>
	</div>
</body>
</html>