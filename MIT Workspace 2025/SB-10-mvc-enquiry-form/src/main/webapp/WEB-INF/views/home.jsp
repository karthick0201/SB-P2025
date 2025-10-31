<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome.jsp</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
</head>
<body>
   <div style='text-align:center;color:red;'>
       <c:choose>
       		<c:when test="${Message ne null}">
       		    <div class="bg-primary">${Message}</div>
       		</c:when>
       		<c:otherwise>
       			<div class="bg-success">${wishMessage}</div>
       		</c:otherwise>
       </c:choose>
   </div>  
</body>
</html>
