<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Path Variable - Example First</title>
</head>
<body>

	<h2>Path Variable Example</h2>


	<form action="path-second" method = "get">

		<br> <br> 
		<input type="text" name="labtopName" placeholder="Labtop Name"> 
		<br> <br> 
		<input type="text" name="ram" placeholder="ram">
		<br><br> 
		<input type="text" name="rom" placeholder="rom">
		<br><br> 
		<input type="submit" value="SUbmit" />
		
	</form>
</body>
</html>