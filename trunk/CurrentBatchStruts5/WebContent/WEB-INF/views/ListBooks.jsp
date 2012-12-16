<%@page import="java.lang.reflect.Method"%>
<%@page import="com.training.java.struts.domain.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
    
    
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
			<th>Update/Delete Link</th>
		</tr>
		<logic:iterate id="aBook" name="venkat">
			<tr>
				<td>${aBook.title}</td>
				<td>${aBook.author}</td>
				<td>${aBook.isbn}</td>
				<td>
					<a href="/CurrentBatchStruts5/update?id=${aBook.id}">Update</a>
					<a href="/CurrentBatchStruts5/delete?id=${aBook.id}">Delete</a>
				</td>
			</tr>
		</logic:iterate>
	</table>

</body>
</html>