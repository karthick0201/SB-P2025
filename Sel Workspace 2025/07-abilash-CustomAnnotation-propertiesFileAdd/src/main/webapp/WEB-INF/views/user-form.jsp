
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
		<form:form action="result" method="post" modelAttribute="surveyDto">

			<label for="n">Name</label>
			<form:input id="n" path="name" />
			<br>

			<label for="age">Age</label>
			<form:input id="age" path="age" />
			<form:errors path="age"/>
			<br>

			<label for="pno">PhoneNo</label>
			<form:input id="pno" path="phoneNo" />
			<br>

			<label for="gen">Gender : </label>
			<form:radiobutton path="gender" value="Male" />Male
		 	<form:radiobutton path="gender" value="Female" />Female<br>
		 
			<label for="cnty">Country</label>
			<form:select id="cnty" path="country">
				<form:option value="India" label="India" />
				<form:option value="America" label="AMerica" />
				<form:option value="Sri Lanka" label="Sri Lanka" />
				<form:option value="England" label="England" />
			</form:select>
			<br>
			<br>

			<form:button>submit</form:button>


		</form:form>






	</div>


</body>
</html>