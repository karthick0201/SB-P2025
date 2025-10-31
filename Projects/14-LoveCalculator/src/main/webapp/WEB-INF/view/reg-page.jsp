<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	<div align="center">
		<h2>Login</h2>
		<br> <br>
		<form:form action="register-success" modelAttribute="regDTO">

			<table>

				<tr>
					<td><label for="n">Name :</label></td>
					<td><form:input id="n" path="name" /></td>
					<td><form:errors path="name" /></td>
				</tr>
				<tr>
					<td><label for="e">Email :</label></td>
					<td><form:input id="e" path="emailDTO.email" /></td>
					<td><form:errors path="emailDTO.email" /></td>
				</tr>
				<tr>
					<td><label for="po">Phone No :</label></td>
					<td><form:input id="po" path="phoneNo" /></td>
					<td><form:errors path="phoneNo" /></td>
				</tr>
				<tr>
					<td><label for="un">User Name :</label></td>
					<td><form:input id="un" path="loginDTO.userName" /></td>
					<td><form:errors path="loginDTO.userName" /></td>
				</tr>
				<tr>
					<td><label for="psw"> Password : </label></td>
					<td><form:input id="psw" path="loginDTO.password" /></td>
					<td><form:errors path="loginDTO.password" /></td>
				</tr>
			</table>
			<form:button>Submit</form:button>
		</form:form>



	</div>



</body>
</html>