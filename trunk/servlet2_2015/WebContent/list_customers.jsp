<%@page import="com.training.amazon.dao.Customer"%>
<%@page import="java.util.List"%>
<%@page import="com.training.amazon.dao.CustomerDAOJDBCImpl"%>
<%@page import="com.training.amazon.dao.CustomerDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
table, td, th {
	border: 1px solid green;
}
th {
	background-color: green;
	color: white;
}
</style>


</head>
<body>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Address</th>
			<th>City</th>
			<th>State</th>
			<th>Zip</th>
		</tr>
		
		<%
		CustomerDAO dao = new CustomerDAOJDBCImpl();
		List<Customer> customers = dao.getAllCustomers();
		
		for(Customer customer : customers)
		{
		%>
		
		<tr>
			<td><%=customer.getFirstName()%></td>
			<td><%=customer.getLastName()%></td>
			<td><%=customer.getAddress()%></td>
			<td><%=customer.getCity()%></td>
			<td><%=customer.getState()%></td>
			<td><%=customer.getZipCode()%></td>
		</tr>	
			
		<% 
		}
		%>	
	</table>
</body>
</html>