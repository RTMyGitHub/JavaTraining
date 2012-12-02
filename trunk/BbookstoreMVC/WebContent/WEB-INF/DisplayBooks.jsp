<%@page import="com.training.java.servlet.domain.Book"%>
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

	<table bgcolor="cyan" bordercolor="red" border="2">
		<tr>
			<th>Title</th>
			<th>Author</th>
			<th>ISBN</th>
		</tr>

		<%
			List<Book> books = (List<Book>) request
					.getAttribute("BooksToDisplay");
			for (Book aBook : books) {
		%>
		<tr>
			<td><%=aBook.getTitle()%></td>
			<td><%=aBook.getAuthor()%></td>
			<td><%=aBook.getIsbn()%></td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>