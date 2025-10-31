<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Second</title>
</head>
<body>
<div align="center">
		<h2>Second - Result Page</h2>
		<ul>

			<li>Name : ${registerDTO.name}</li>
			<li>Email : ${registerDTO.communicationDTO.email}</li>
			<li>Phone No : ${registerDTO.communicationDTO.phoneNo}</li>

		</ul>
		
		
		<h3>SessionAttributes Pratice</h3>
		<ul>
			<li>RequestScope-Name : ${requestScope.registerDTO.name}</li>
			<li>SessionScopte-Name : ${sessionScope.registerDTO.name}</li>
		</ul>
		
		
		<br>
		<a href="${next}">CLick Here!!! THird Page</a>
		
		<br><br>
		<a href="logout-session">CLick Here!!! Logout</a>
		<br>
	</div>
</body>
</html>