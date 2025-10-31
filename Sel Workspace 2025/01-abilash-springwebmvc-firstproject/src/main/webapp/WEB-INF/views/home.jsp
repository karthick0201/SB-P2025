<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page isELIgnored="false" %>

<html>
<head>
<title>Food Order</title>
</head>
<body>
	<h2>Select Your Food</h2>
	
	<form action="${pageContext.request.contextPath}/home.com/process-order" method="post">
	
		<c:forEach var = "food" items = "${foodList}">
		
			<input type = "checkbox" name = "selectedFoods" value = "${food.id}">
			${food.foodName} - Rs. ${food.price}
			<br/>
		</c:forEach>
	
		<input type= "submit" Value = "Place Holder" />
	
	</form>
	


</body>
</html>