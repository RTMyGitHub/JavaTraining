<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
table, td, th {
	border: 1px solid blue;
}
th {
	background-color: blue;
	color: white;
}
</style>

</head>
<body>

	<h3>Here is your order summary, please confirm.</h3>

	<table>
		<tr>
			<th>Name</th>
			<th>Type</th>
			<th>Price</th>
		</tr>
		<c:forEach items="${ShoppingCart}" var="product">
			<tr>
				<td>${product.name}</td>
				<td>${product.type}</td>
				<td>${product.price}</td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="/eshop5/checkout">Confirm</a>

</body>
</html>