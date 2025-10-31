<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoveCalcultionPage</title>
</head>
<body>
<div align="center">
	<br>
	<br>
		<h2>Love Calculator</h2>
		<br> <br>
		<form:form action="love-cal-result" modelAttribute="loveCalDTO">

			<table>

				<tr>
					<td><label for="un">Name :</label></td>
					<td><form:input id="un" path="name" /></td>
					<td><form:errors path="name" /></td>
				</tr>
				<tr>
					<td><label for="psw"> CrushName : </label></td>
					<td><form:input id="psw" path="crushName" /></td>
					<td><form:errors path="crushName" /></td>
				</tr>
			</table>
			<form:button>Calculate</form:button>
		</form:form>


		

	</div>
</body>
</html>