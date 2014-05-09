<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.training.redbox.domain.Movie"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movie List</title>
</head>
<body>

	<% 
	
		System.out.println("Inside JSP");
	
	%>

	<%@include file="Header.jsp"%>
	
	<c:set var="size" value="0"></c:set>
	
	<c:if test="${cart!=null}">
	 <c:set var="size" value="${cart.size()}"></c:set>
	</c:if>
	
	
	<table border="" width="800">
		<tr>
			<td  align="right" >
				
				<c:if test="${customer==null}">
							
				<a href="/redboxspringmvcjpa/signup"><img src='<c:url value="/images/signup2.jpg"/>' width="80" height="30"/></a>
				<a href="/redboxspringmvcjpa/login"><img src='<c:url value="/images/login.jpg"/>' width="80" height="30"/></a>
				
				</c:if>
				
				<img src='<c:url value="/images/cart.jpg"/>' width="80" height="30"/>
				(<c:out value="${size}"></c:out>)
				<a href="/redbox/checkout.do"><img src='<c:url value="/images/checkout.jpg"/>' width="80" height="30"/></a>
				
			</td>
		</tr>
	</table>
	
	
	<table border="1">
		<tr>
			
			<c:forEach items="${movies}" var="movie">
			
			<td><img alt="${movie.title}" src='<c:url value="${movie.imageLocation}"/>' width="150" height="225">
			</td>

			</c:forEach>

		</tr>

		<tr>

			<c:forEach items="${movies}" var="movie">
			
			
			<td><a href="/redbox/addToCart.do?id=${movie.id}">Add to<img
					src='<c:url value="/images/cart.jpg"/>' width="25" height="25"></a></td>

			</c:forEach>

		</tr>
	</table>

	

	<%@include file="Footer.jsp"%>

</body>
</html>