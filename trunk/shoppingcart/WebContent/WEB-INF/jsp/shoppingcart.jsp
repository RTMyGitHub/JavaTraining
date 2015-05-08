<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
table, td, th {
	border: 1px solid green;
}
th {
	background-color: green;
	color: white;
}
</style>
</head>
<body>

	<h2>Welcome to eShop, world's best shop :)</h2>
	
	<form action="/shoppingcart/cart" method="post">
		Please add your book : 
		<input type="text" name="purchasedBook"/> <br/> <br/>
		<input type="submit" value="Add To Cart">
	</form>
	
	<h3>By the way, you have the following items in the cart.</h3>
	
	<table>
		<tr>
			<th>Books bought</th>
		</tr>
	<c:forEach items="${BooksBoughtSoFar}" var="book">
		<tr>
			<td>${book}</td>
		</tr>	
	</c:forEach>
	</table>
	
</body>
</html>