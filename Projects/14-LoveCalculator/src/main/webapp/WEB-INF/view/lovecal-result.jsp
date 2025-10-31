<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ResultPage</title>
</head>
<body>

	<div align="center">
		<h3>Love Calculator Result Is</h3>
		<ol>
			<li>Uid(PK) : ${historyPojo.uid}</li>
			<li>Name : ${historyPojo.userName}</li>
			<li>Name : ${historyPojo.crushName}</li>
			<li>Crush Name : ${historyPojo.result}</li>
		</ol>

<br>
		<a href="#">Send Result to Mail</a><br>
		<a href="love-cal">Click Here to Go TO LOveCalculator Page</a><br>
		<a href="welcome-user">CLick Here!! Go to Home</a>
	</div>





</body>
</html>