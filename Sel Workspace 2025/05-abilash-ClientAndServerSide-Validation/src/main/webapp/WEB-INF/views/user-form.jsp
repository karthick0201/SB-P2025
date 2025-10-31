<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>UserForm</title>
		
		<script type="text/javascript">
			
		function validateForm(){
			var yourName = document.getElementById("yourName").value;
			console.log(yourName);
			if(yourName==""){
				alert("Field is Empty...");
				return false;
			}else{
				return true;
			}
		}
		
		</script>
	</head>
	<body style="align-content: center;">
	<br>
		<h2>Love Calculator</h2>
	<br>
		<form:form action="result" method="post" modelAttribute="loveCalDto" onsubmit="return true">
	
			<label for="yourName"> Your Name : </label>
			<form:input id="yourName" path="yourName" />
			<form:errors path = "yourName" />

			<br>
			<br>
			<label for="crushName"> Crush Name</label>
			<form:input id="crushName" path="crushName" />
			<form:errors path = "crushName" />
			<br>
			<br>
			<form:button> Submit</form:button>
		</form:form>
	
	
	</body>
</html>