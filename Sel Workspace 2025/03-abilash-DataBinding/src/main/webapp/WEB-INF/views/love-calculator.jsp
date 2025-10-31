<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<title>Love Calculator</title>
</head>
<body>
	<h2>Love Calculator</h2>
	
	<form action="calculate" method="post">
		
		<label>Your Name:</label> <input type="text" name="yourName" required />
		<br />
		<br /> 
		<label>Crush's Name:</label> <input type="text" name="crushName" required />
		<br />
		<br /> 
		<input type="submit" value="Calculate Love Status" />
		
	</form>

	<c:if test="${not empty error}">
		<p style="color: red">${error}</p>
	</c:if>
</body>
</html>