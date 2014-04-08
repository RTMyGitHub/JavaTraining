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

<%@include file="Header.jsp"%>

<form action="/redbox/saveCustomer.do" method="post">

<br/>
<br/>

	<c:if test="${error!=null}">
	
	<h4><font color="red">Username exists, please try another.</font></h4>
	
	</c:if>

	<table>
	
		<tr>
			<td> First Name:</td>
			<td><input type="text" name="firstName"/></td>
		</tr> 
		
		<tr>
			<td> Last Name: </td>
			<td> <input type="text" name="lastName"/> </td>
		</tr> 
		
		<tr>
			<td> Address: </td>
			<td><input type="text" name="address"/></td>
		</tr> 
		
		<tr>
			<td> City: </td>
			<td><input type="text" name="city"/></td>
		</tr> 
		
		<tr>
			<td> State: </td>
			<td><input type="text" name="state"/></td>
		</tr> 
		
		<tr>
			<td> ZIP: </td>
			<td><input type="text" name="zipCode"/></td>
		</tr> 
		
		<tr>
			<td> Create a username: </td>
			<td><input type="text" name="userName"/></td>
		</tr> 
		
		<tr>
			<td> Create a password: </td>
			<td><input type="password" name="password"/></td>
		</tr>
			
		<tr>
			<td><input type="submit" value="Submit"/></td>
		</tr>
	
	</table>

</form>



<%@include file="Footer.jsp"%>

</body>
</html>