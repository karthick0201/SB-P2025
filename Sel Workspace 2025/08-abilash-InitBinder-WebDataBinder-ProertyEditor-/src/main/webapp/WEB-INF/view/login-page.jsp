<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOgin Page</title>
</head>
<body>
	<div align="center"><br><br>
	<h2>L Calculator</h2><br> <br>
		<form:form action="resultpage" modelAttribute="userLoginDTO">
			
			<label id="un">Your Name : </label>
			<form:input id="un" path="uName" />
			<form:errors path="uName" /><br><br>
			<label id="cn">Crush Name : </label>
			<form:input id="cn" path="cName" />
			<form:errors path="cName" /><br><br>
			
			
			<form:button>Submit</form:button>
		</form:form>
	</div>

</body>
</html>