
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SuccessPage</title>
</head>
<body>
	<div align="center">
	
	<h3>Register Success!!!</h3><br><br>
	
	<h5>Your Details!!!</h5> <br><br>
	<label>Name : ${userInfoDto.name}</label><br>
	<label>User Name : ${userInfoDto.userName}</label><br>
	<label>Password : ${userInfoDto.password}</label><br>
	<label>Country : ${userInfoDto.country}</label><br>
	<label>Hobbies : </label>
	<c:forEach var="h" items="${userInfoDto.hobbies}" >
		${h} <br>
	</c:forEach> <br>
	<label>Gender : ${userInfoDto.gender}</label><br> <br>
	<label>Email : ${userInfoDto.communicationDto.email}</label> <br>
 	<label>phone : ${userInfoDto.communicationDto.phone}</label>  
	
	</div>
</body>
</html>