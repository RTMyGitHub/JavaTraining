<%@page import="com.training.java.struts.domain.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table bgcolor="cyan" bordercolor="red" border="2">
		<tr>
			<th>Title</th>
			<th>Author</th>
			<th>ISBN</th>
		</tr>
		<c:forEach items="${books}" var="aBook">
			<tr>
				<td>${aBook.title}</td>
				<td>${aBook.author}</td>
				<td>${aBook.isbn}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>