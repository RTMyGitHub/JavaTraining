<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet" href="/eshop/styles/eshop.css"/>
</head>

<body id="signupPageBody">
	
	<%@include file="Header.jsp" %>
	
	<div class="container">
		<c:url value='/signup' var="signupUrl"/>
		<sf:form action="${signupUrl}" method="post" modelAttribute="customer">
		
			<sf:errors path="*" cssClass="error"/><br/><br/>
			
			<label for="firstName">First name</label>
			<sf:input path="firstName" id="firstName"/> <br/>
			
			<label>Last name</label>
			<sf:input path="lastName"/> <br/>
			
			<label>Address</label>
			<sf:input path="address"/> <br/>
			
			<label>City</label>
			<sf:input path="city"/> <br/>
			
			<label>State</label>
			<sf:input path="state"/> <br/>
			
			<label>Zip</label>
			<sf:input path="zipCode"/> <br/>
			
			<button type="submit">Add Customer</button>
		</sf:form>
	</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</body>
</html>