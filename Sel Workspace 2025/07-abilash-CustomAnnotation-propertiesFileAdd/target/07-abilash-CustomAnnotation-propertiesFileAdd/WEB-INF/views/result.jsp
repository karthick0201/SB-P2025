
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SuccessPage</title>
</head>
<body>
	<div align="center">
	
	<h3>Register Success!!! ThankYou for your Response!!!</h3><br><br>
	
	<h5>Your Details!!!</h5> <br><br>
	<label>Name : ${surveyDto.name}</label><br>
	<label>Age : ${surveyDto.age}</label><br>
	<label>PhoneNo : ${surveyDto.phoneNo}</label><br>
	<label>Gender : ${surveyDto.gender}</label><br> <br>
	<label>Country : ${surveyDto.country}</label>

	</div>
</body>
</html>