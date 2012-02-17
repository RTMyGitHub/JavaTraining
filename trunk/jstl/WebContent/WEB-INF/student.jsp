<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>
		<font color="blue"> Student Details : </font><br />
	</h2>

	<c:forEach begin="1" end="10" step="1" var="current">
	Current = ${current} <br />
	</c:forEach>

	<table bordercolor="blue" border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>City</th>
		</tr>
		<c:forEach items="${students}" var="current">
			<tr>
				<td>${current.firstName}</td>
				<td>${current.lastName}</td>
				<td>${current.city}</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<c:if test="${size == 3}">
		The size is 3
	</c:if>

	<br />JSTL if else demo
	<br />
	<c:choose>
		<c:when test="${size ==2}">
			Size = 2
		</c:when>

		<c:when test="${size ==3}">
			Size = 3
		</c:when>

		<c:when test="${size ==4}">
			Size = 4
		</c:when>

		<c:otherwise>
			Size is not 2,3 and 4.
		</c:otherwise>
	</c:choose>

	<br />JSTL core set demo
	<br />

	<c:set var="name" value="Venkat"></c:set>

	<c:out value="${name}"></c:out>

	<c:set var="now" value="<%=new java.util.Date()%>"></c:set>
	
	<h2>Current date = <fmt:formatDate value="${now}" pattern="MM/dd/yyyy"/></h2>

</body>
</html>