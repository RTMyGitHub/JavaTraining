<%@page import="com.training.java.redbox.domain.Movie"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

	<%@include file="Header.jsp"%><br />

	<c:if test="${error!=null}">

		<h4>
			<font color="red"><c:out value="${error}"></c:out></font>
		</h4>

	</c:if>

	Please find below the movies you added to the cart.
	<br />
	<br />


	<table bordercolor="blue" border="1">
		<tr>
			<th>Title</th>
			<th>Type</th>
			<th>Price</th>
		</tr>

		<c:forEach items="${moviesCart}" var="movie">


			<tr>
				<td><c:out value="${movie.title}"></c:out></td>
				<td><c:out value="${movie.type}"></c:out></td>
				<td><c:out value="${movie.rentalPrice}"></c:out></td>
			</tr>


		</c:forEach>

	</table>

	<br />

	<form action="/redbox/checkout" method="post">
		<input type="submit" value="submit">
	</form>


	<%@include file="Footer.jsp"%>


</body>
</html>