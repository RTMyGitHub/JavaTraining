<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		Date todaysDate = new Date();
		System.out.println("Today's date = " + todaysDate);

		String firstName = request.getParameter("fn");
		String lastName = request.getParameter("ln");

		out.println("Hi " + lastName + " , " + firstName);
	%>

	<h1>Welcome to my page!</h1>

	Today's date is : <%= new Date() %>


<%@ include file="footer.jsp" %>
</body>
</html>