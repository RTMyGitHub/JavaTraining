<%@page import="com.training.amazon.dao.Customer"%>
<%@page import="com.training.amazon.dao.CustomerDAOJDBCImpl"%>
<%@page import="com.training.amazon.dao.CustomerDAO"%>
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
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zip = request.getParameter("zip");

		CustomerDAO dao = new CustomerDAOJDBCImpl();
		
		Customer customer = new Customer(0, firstName, lastName, address, city, state, zip);
		dao.createCustomer(customer);
	%>
	
</body>
</html>