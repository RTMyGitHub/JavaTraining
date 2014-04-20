<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@include file="Header.jsp"%>

<html:errors/>

<html:form action="/saveCustomer.do" method="post">

<br/>
<br/>

	<c:if test="${error!=null}">
	
	<h4><font color="red">Username exists, please try another.</font></h4>
	
	</c:if>

	<table>
	
		<tr>
			<td> First Name:</td>
			<td><html:text property="firstName"/></td>
		</tr> 
		
		<tr>
			<td> Last Name: </td>
			<td><html:text property="lastName"/></td>
		</tr> 
		
		<tr>
			<td> Address: </td>
			<td><html:text property="address"/></td>
		</tr> 
		
		<tr>
			<td> City: </td>
			<td><html:text property="city"/></td>
		</tr> 
		
		<tr>
			<td> State: </td>
			<td><html:text property="state"/></td>
		</tr> 
		
		<tr>
			<td> ZIP: </td>
			<td><html:text property="zipCode"/></td>
		</tr> 
		
		<tr>
			<td> Create a username: </td>
			<td><html:text property="userName"/></td>
		</tr> 
		
		<tr>
			<td> Create a password: </td>
			<td><html:password property="password"/></td>
		</tr>
			
		<tr>
			<td><input type="submit" value="Submit"/></td>
		</tr>
	
	</table>

</html:form>


<%@include file="Footer.jsp"%>

</body>
</html>