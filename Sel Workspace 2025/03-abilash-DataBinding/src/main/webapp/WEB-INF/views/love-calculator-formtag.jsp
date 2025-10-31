<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator - Two Way data Binding</title>
</head>
<body>

		<h2>Love Calculator - Two Way data Binding</h2> <br> <br>

	<form:form action="${pageContext.request.contextPath}/calculate" method="post" modelAttribute="loveCalDto">
	
		Your Name : <form:input id="yn" path="yourName" />
		<br />
		<br />
		Crush Name : <form:input id="cn" path="crushName" />
		<br />
		<br />
		<form:button value="submit" > Submit</form:button>
	</form:form>



</body>
</html>