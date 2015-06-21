<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet" href="/eshop9/styles/eshop.css"/>
</head>

<body id="homePageBody">
	<%@include file="Header.jsp" %>
	
	<div class="container">
		
		<form action="/eshop9/product/search/" class="form-horizantal" method="post">
			<div class="form-group form-inline row">
				<input type="text" id="productSearch" name="productSearch" class="form-control">
				<button type="submit" class="btn btn-default" id="productSearch">
	      			<span class="glyphicon glyphicon-search"></span> Search
	    		</button>			
			</div>
		</form>
			
		<div id="searchResults"></div>
		
		<table id="allProducts" class="table">
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
					
					<td><a href="<c:url value='/cart?productId=${product.id}'/>" class="glyphicon glyphicon-shopping-cart"></a></td>
				</tr>	
			</c:forEach>
		</table>
		
		<div class="row row-eq-height">
			<div class="col-xs-4" style="background-color: #F5F5F0;">
				<h2 class="text-center col-full-height">Current Deals</h2>
				
				<ul>
					<li>Diet Coke $.50</li>
					<li>iPad for $299</li>
					
				</ul>
			</div>	
			
			<div class="col-xs-5 text-center">
				<h2>Coupons</h2>
			</div>
			
			<div class="col-xs-3 text-center" style="background-color: #F5F5F0;">
				<h2>Contact Us</h2>
			</div>
		</div>
	</div>
	
		
	
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<script src="/eshop9/scripts/application.js"></script>

</body>
</html>