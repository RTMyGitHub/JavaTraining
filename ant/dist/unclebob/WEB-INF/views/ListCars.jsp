<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table bordercolor="blue" border="1">
	<tr>
		<th>Type</th>
		<th>Make</th>
		<th>Model</th>
		<th>Year</th>
		<th>Price</th>
	</tr>
	
	<logic:iterate id="eachCar" name="cars">
		<tr>
			<td>${eachCar.type}</td>
			<td>${eachCar.make}</td>
			<td>${eachCar.model}</td>
			<td>${eachCar.year}</td>
			<td>${eachCar.price}</td>
		</tr>
	</logic:iterate>
</table>
</body>
</html>