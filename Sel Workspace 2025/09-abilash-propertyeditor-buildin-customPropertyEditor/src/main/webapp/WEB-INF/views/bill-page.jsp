<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill Page</title>
</head>
<body>
	<div align="center">
	<br>
	<h2>Bill</h2>	
	<br><br>
	<form:form action="result-page" modelAttribute="billDTO">
		<label id="cc">CreditCard : </label>
		<form:input id="cc" path="creditCardDTO"/>
		<form:errors path="creditCardDTO"/><br><br>
		
		<label id="a">AMount : </label>
		<form:input id="a" path="amount"/>
		<form:errors path="amount"/><br><br>
		
		<label id="c">Currency : </label>
		<form:input id="c" path="currency"/>
		<form:errors path="currency"/><br><br>
		
		<label id="d">Date : </label>
		<form:input id="d" path="date"/>
		<form:errors path="date"/><br><br>
		
		
		<label for="name">Name : </label>
		<form:input id="name" path="name"/>
		<form:errors path="name"/><br><br>
		
		<form:button>Submit</form:button>
	</form:form>


	</div>
</body>
</html>