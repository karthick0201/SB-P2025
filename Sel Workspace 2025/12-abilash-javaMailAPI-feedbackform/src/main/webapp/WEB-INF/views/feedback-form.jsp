<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>feedback form</title>
</head>
<body>

<h2>Feedback Form</h2>

	<form:form action="send-email" method="post" modelAttribute="feedbackDTO">

		<table>
			<tbody>
				<tr>
					<td><label for="email">Email : </label> </td>
					<td><form:input id="email" path="email" /></td>
				</tr>
				<tr>
					<td><label for="feedback-msg">Feedback : </label> </td>
					<td><form:textarea id="feedback-msg" path="feedbackMessage" /></td>
				</tr>
				<tr>
					<td><form:button>submit</form:button></td>
				</tr>
	
			</tbody>
	
		</table>



		</form:form>




</body>
</html>