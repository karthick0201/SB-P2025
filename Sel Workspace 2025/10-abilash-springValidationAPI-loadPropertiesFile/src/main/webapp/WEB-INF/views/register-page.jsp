<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REgister</title>
</head>
<body>
	<div align="center">
		<h2>Register</h2>
		<br>
		<br>
		<form:form action="result" modelAttribute="userDTO">
			
			<table>

				<tr>
					<td><label for="n"> Name :</label></td>
					<td><form:input id="n" path="name" /></td>
					<td><form:errors path="name" /></td>
				</tr>
				<tr>
					<td><label for="un"> AGE :</label></td>
					<td><form:input id="un" path="age" /></td>
					<td><form:errors path="age" /></td>
				</tr>
				<tr>
					<td><label for="e"> Email :</label></td>
					<td><form:input id="e" path="email" /></td>
					<td><form:errors path="email" /></td>
				</tr>
			</table>
			<form:button>Submit</form:button>
		</form:form>



	</div>
</body>
</html>