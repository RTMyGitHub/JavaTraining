<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet" href="/eshop/styles/eshop.css"/>
</head>
<body>
	<%@include file="Header.jsp" %>
	
	<h3>You have added the following items to the cart.</h3>

	<table>
		<tr>
			<th>Name</th>
			<th>Type</th>
			<th>Price</th>
			<th></th>
		</tr>
		<c:forEach items="${ShoppingCart}" var="product">
			<tr>
				<td>${product.name}</td>
				<td>${product.type}</td>
				<td>${product.price}</td>

				<c:url value='/cart?productId=${product.id}' var="addToCartUrl"/>
				<td><a href="${addToCartUrl}">Add to Cart</a></td>
			</tr>
		</c:forEach>
	</table>
	
	
	<h2>Do you want to shop more?Please click <a href="<c:url value='/'/>">here</a> </h2> 
	<h3>If you are done shopping, please click <a href="<c:url value='/login'/>">here</a></h3>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</body>
</html>