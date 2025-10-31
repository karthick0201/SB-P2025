
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>

	<div align="center">
		<h2>Registration FORM</h2>
		<br>
		<form:form action="result" method="post" modelAttribute="userInfoDto">

			<label for="n">Name</label>
			<form:input id="n" path="name" />
			<br>

			<label for="uN">User Name</label>
			<form:input id="uN" path="userName" />
			<br>

			<label for="psw">Password</label>
			<form:password id="psw" path="password" />
			<br>

			<label for="cnty">Country</label>
			<form:select id="cnty" path="country">
				<form:option value="India" label="India" />
				<form:option value="America" label="AMerica" />
				<form:option value="Sri Lanka" label="Sri Lanka" />
				<form:option value="England" label="England" />
			</form:select>
			<br>
			<br>

			<label for="hob">Hobbies : </label>
			<form:checkbox path="hobbies" value="Cricket" />Cricket
		   <form:checkbox path="hobbies" value="Programming" />Programming
		     <form:checkbox path="hobbies" value="Badminton" />Badminton
		  <form:checkbox path="hobbies" value="Social MEdia" /> Social MEdia<br>

			<label for="gen">Gender : </label>
			<form:radiobutton path="gender" value="Male" />Male
		 <form:radiobutton path="gender" value="Female" />Female<br>


			<label>Communication</label><br>
			<label>Phone : </label>
			<!-- Below We try to COnvert string to Object so Exception throw "Binding"
			So we use Formatter -->
			<form:input path="communicationDto.phone"/>
			<br>
			<label>Email : </label>
			<form:input path="communicationDto.email"/>			
<br>

			<form:button>submit</form:button>


		</form:form>






	</div>


</body>
</html>