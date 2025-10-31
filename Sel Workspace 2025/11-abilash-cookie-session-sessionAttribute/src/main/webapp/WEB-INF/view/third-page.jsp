<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>THIRD</title>
</head>
<body>
<div align="center">
		<h2>Result Page</h2>
		<ul>

			<li>Name : ${registerDTO.name}</li>
			<li>Email : ${registerDTO.communicationDTO.email}</li>
			<li>Phone No : ${registerDTO.communicationDTO.phoneNo}</li>

		</ul>
		<br>
		
		<p>This Page We cant Track Data given in first page...
		 <br> so SEsstion To store data....
		 </p>
		 
		 <br><br>
		 <h3> Below Used added to Session Object...</h3>
		 
		 <p>Name : ${sessionScope.regDTO.name}</p>
		 <p>Email : ${sessionScope.regDTO.communicationDTO.email}</p>
		 <p>Email : ${sessionScope.regDTO.communicationDTO.phoneNo}</p>
		 
		<!-- <a href="third">CLick Here!!! THird Page</a> -->
	</div>
	
	 <div>
	 <h3>SessionAttributes Pratice</h3>
		<ul>
			<li>RequestScope-Name : ${requestScope.registerDTO.name}</li>
			<li>SessionScopte-Name : ${sessionScope.registerDTO.name}</li>
		</ul>
	 
	 </div>
	
		<br><br>
		<a href="logout-session">CLick Here!!! Logout</a>
		<br>
	
</body>
</html>