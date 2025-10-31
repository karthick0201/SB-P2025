<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<title>Love Result</title>
</head>
<body>
	<h2>Love Result</h2>

	<p>
		<strong>Your Name:</strong> ${loveCalDto.yourName}
	</p>
	<p>
		<strong>Crush's Name:</strong> ${loveCalDto.crushName}
	</p>
	<p>
		<strong>Status:</strong> <span style="color: blue">${result}</span>
	</p>

	<br />
	<a href="#loveCalculator">Try Again</a> |
	<a href="#history">View History</a>
</body>
</html>