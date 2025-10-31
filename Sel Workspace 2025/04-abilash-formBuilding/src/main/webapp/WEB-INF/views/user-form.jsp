<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Form - Creeated Using Spring MVC Form Tag</title>
</head>
<body>

	<h2>User Form</h2>
	
	<form:form action = "submit" method = "post" modelAttribute="userInfoDto">
	
		Name : <form:input id = "name" path="name"/>
		
		<br/><br/>
		email : <form:input id = "email" path="email"/>
		<br/><br/>
		password : <form:password id = "psw" path="password"/>
		<br/><br/>
		dateOfBirth : <form:input id = "date" path="dateOfBirth"/>
		<br/><br/>
		about You : <form:textarea id = "aYou" path="aboutYou" cols="20" rows="3"/>
		<br/><br/>
		hobbies : 
		<form:checkbox value = "badminton" path="hobbies"/> Badminton
		<form:checkbox value = "cricket" path="hobbies"/> Cricket
		<form:checkbox value = "ps4" path="hobbies"/> Ps4
		<form:checkbox value = "animi" path="hobbies"/> Animi
		<br/><br/>
		sex : 
		<form:radiobutton path="sex" value = "male"/> Male
		<form:radiobutton path="sex" value = "female"/> Female
		<br/><br/>
		country : 
		<form:select id = "cntry" path="country">
			<form:option value="India" label= "India" />
			<form:option value="China" label= "China" />
			<form:option value="Germany" label= "Germany" />
			<form:option value="Europe" label= "Europe" />
		</form:select>
		<br/><br/>
		<form:button> Submit </form:button>
	
	</form:form>


	


</body>
</html>