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
<div class="navbar pull-middle">
	<ul class="nav navbar-nav">
	  <li>
	  	<a href="<c:url value='/'/>">Home</a>
	  </li>
	  <li><a href="<c:url value='/about'/>">About</a></li>
	  <li><a href="<c:url value='/contact'/>">Contact</a></li>
	 
	 <li>
	   <a href="#" class="dropdown-toggle" data-toggle="dropdown">Your Account<span class="caret"></span></a>
	   <ul class="dropdown-menu">
	     <li><a href="#">Your Account</a></li>
	     <li><a href="#">Your Orders</a></li>
	     <li><a href="#">Your Wish List</a></li>
	   </ul>
	 </li>
	 <li><a href="<c:url value='/checkout'/>">Checkout</a></li>
	 <li><a href="<c:url value='/signout'/>">Signout</a></li>
	</ul>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>


</body>
</html>