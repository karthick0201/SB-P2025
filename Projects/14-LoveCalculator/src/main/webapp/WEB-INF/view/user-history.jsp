<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>History</title>
</head>
<body>
	<div align="center">
		<br>
		<h3>History</h3>
		<br>

		<table border="2" width="70%" cellpadding="2">
			<tr>
				<th>Hid</th>
				<th>Uid</th>
				<th>User Name</th>
				<th>Crush Name</th>
				<th>Result</th>
			</tr>
			<c:forEach items="${records}" var="record">
				<tr>
					<td>${record.hid}</td>
					<td>${record.uid}</td>
					<td>${record.userName}</td>
					<td>${record.crushName}</td>
					<td>${record.result}</td>
					<td><a href="deletehistory/${record.hid}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>

		<br>
		<br>
		<a href="welcome-user">Go to Home Page</a>
	</div>
</body>
</html>