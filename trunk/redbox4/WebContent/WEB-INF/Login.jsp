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

<form action="/redbox/login" method="post">

<br/>

	<c:if test="${error!=null}">

	
	<h4><font color="red">Please check username/password and try again.</font></h4>
	
		
	</c:if>

<table>
	
		<tr>
			<td> Username:</td>
			<td><input type="text" name="username"/></td>
		</tr> 
		
		<tr>
			<td> Password: </td>
			<td> <input type="password" name="password"/> </td>
		</tr> 
		
		<tr>
			<td><input type="submit" value="Login"/></td>
		</tr>
	
	</table>

</form>

<%@include file="Footer.jsp"%>

</body>
</html>