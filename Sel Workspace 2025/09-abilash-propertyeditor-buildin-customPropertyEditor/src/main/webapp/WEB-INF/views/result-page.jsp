<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta charset="UTF-8">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Page</title>
</head>
<body>
	<div align="center">
	<h2>Bill Result Page</h2>
	<br>
	<table>
		<tr>
			<td>CreditCard : </td>
			<td>${billDTO.creditCardDTO}</td>
		</tr>
		<tr>
			<td>AMount : </td>
			<td>${billDTO.amount} ${billDTO.currency.symbol}</td>
		</tr>
		<tr>
			<td>Currency :</td>
			<td>${billDTO.currency}</td>
		</tr>
		<tr>
			<td>Date : </td>
			<td>${billDTO.date}</td>
		</tr>
			<tr>
				<td>Name :</td>
				<td>${billDTO.name}</td>
			</tr>

		</table>
	
	
	
	
	</div>
</body>
</html>