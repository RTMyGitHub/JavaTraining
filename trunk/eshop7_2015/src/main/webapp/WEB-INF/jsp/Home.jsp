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

<body id="homePageBody">
	<%@include file="Header.jsp" %>
	
	<h2 id="mainHeading">Welcome to eShop</h2>
	
	<table id="allProducts" class="list1">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Type</th>
		<th>Price</th>
		<th></th>
	</tr>
		<c:forEach items="${AllProducts}" var="product">
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.type}</td>
				<td>${product.price}</td>
				
				<td><a href="<c:url value='/cart?productId=${product.id}'/>"><img src="<c:url value='/images/cart.jpg'/>" id="cart"></a></td>
			</tr>	
		</c:forEach>
	</table>	
	
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</body>
</html>