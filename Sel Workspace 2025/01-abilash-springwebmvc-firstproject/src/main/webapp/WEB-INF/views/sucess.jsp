<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
<title>Order Success</title>
</head>
<body>
	<h2>Selected Food List</h2>
	
	
	
		<c:forEach var = "food" items = "${selectedFoods}">
			${food.foodName} - Rs. ${food.price}
			<br/>
		</c:forEach>
	
	
	



</body>
</html>