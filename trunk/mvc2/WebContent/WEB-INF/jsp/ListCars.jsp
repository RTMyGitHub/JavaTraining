<%@page import="com.training.servlet.car.domain.Car"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1" bordercolor="red">
		<tr>
			<TH>Make</TH>
			<TH>Model</TH>
			<TH>Year</TH>
			<TH>Price</TH>
		</TR>

		<%
		List<Car> cars = (List<Car>) request.getAttribute("carsToDisplay");
			for (Car current : cars) {
		%>
		
		<tr>
			<td> <%= current.getMake() %> </td>
			<td> <%= current.getModel() %> </td>
			<td> <%= current.getYear() %> </td>
			<td> <%= current.getPrice() %> </td>
		</tr>
		
		<%
			}
		%>
	</table>

</body>
</html>