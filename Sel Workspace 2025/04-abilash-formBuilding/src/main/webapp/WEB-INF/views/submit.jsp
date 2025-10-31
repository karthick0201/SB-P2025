<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Info</title>
</head>
<body>
	<h3>Your Information</h3>
	
	Name : ${userInfoDto.name} <br/><br/>
	Email : ${userInfoDto.email} <br/><br/>
	Password : ${userInfoDto.password} <br/><br/>
	Date of birth : ${userInfoDto.dateOfBirth} <br/><br/>
	About You : ${userInfoDto.aboutYou} <br/><br/> 
	Hobbies :
		<c:forEach var="h" items="${userInfoDto.hobbies}">
			<br/> > ${h}
		</c:forEach>
	<br /><br /> 
	Sex : ${userInfoDto.sex} <br/><br/>
	Country : ${userInfoDto.country} <br/><br/>
	
	
	
	
	
</body>
</html>