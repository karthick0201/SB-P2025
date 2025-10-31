<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First</title>
</head>
<body>

	<div align="center">
		<h2>Register</h2>
		<br> <br>
		<form:form action="${next}" modelAttribute="registerDTO">

			<table>

				<tr>
					<td><label for="n"> Name :</label></td>
					<td><form:input id="n" path="name" /></td>
					<td><form:errors path="name" /></td>
				</tr>
				<tr>
					<td><label for="e"> Email :</label></td>
					<td><form:input id="e" path="CommunicationDTO.email" /></td>
					<td><form:errors path="communicationDTO.email" /></td>
				</tr>
				<tr>
					<td><label for="pn"> Phone No :</label></td>
					<td><form:input id="pn" path="communicationDTO.phoneNo" /></td>
					<td><form:errors path="communicationDTO.email" /></td>
				</tr>
			</table>
			<form:button>Submit</form:button>
		</form:form>
	</div>
</body>
</html>