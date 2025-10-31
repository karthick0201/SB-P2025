<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Page</title>
</head>
<body>
<div align="center"><br>
<h2>Calculated!!!!</h2> <br><br>
	 <p>Your  Name : ${userLoginDTO.uName}</p><br><br>
	 <p>Crush Name : ${userLoginDTO.cName}</p><br><br>
	 <!--I have Requirement that i print object
	 		* i already use print and parse methods in Formater Interface
	 		* here I use 'Property Editor' -->
	 <%-- <p>Locations  : ${userLoginDTO.locationsDTO}</p> --%>
	 <a href="#">Click Here!!! to SEND Email!!!</a>

</div>
</body>
</html>