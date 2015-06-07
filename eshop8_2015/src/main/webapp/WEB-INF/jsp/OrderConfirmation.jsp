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
	
	<div class="container">
		<h3>Your order has been placed, and your order number is
			${Order.orderNumber}. </h3>
		<h4>If you have any questions regarding this order,
			please reference this order number.</h4>
			
		<h5>Click <a href="<c:url value='/'/>">here</a> to go to home page.</h5>
	</div>
	
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
		
</body>
</html>