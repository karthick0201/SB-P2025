<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

	<div align="center">
	<br><br>
	<div align="right">
	<h3>New User? <a href="register">Register Here!!!</a></h3>
	</div>
	<br>
		<h2>Login</h2>
		<br> <br>
		<form:form action="welcome-user" modelAttribute="loginDTO">

			<table>

				<tr>
					<td><label for="un">User Name :</label></td>
					<td><form:input id="un" path="userName" /></td>
					<td><form:errors path="userName" /></td>
				</tr>
				<tr>
					<td><label for="psw"> Password : </label></td>
					<td><form:input id="psw" path="password" /></td>
					<td><form:errors path="password" /></td>
				</tr>
			</table>
			<form:button>Submit</form:button>
		</form:form>


		

	</div>

</body>
</html>