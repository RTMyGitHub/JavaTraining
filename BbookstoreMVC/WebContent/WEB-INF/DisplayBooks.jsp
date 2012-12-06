<%@page import="java.util.Date"%>
<%@page import="com.training.java.servlet.domain.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page errorPage="error.jsp" %>	
	
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
		<%!
		
		public Date getCurrentDate()
		{
			return new Date();
		}
		
		%>	
		
		<jsp:include page="header.jsp"></jsp:include>

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
	
	Current date = <%=getCurrentDate() %> <br/>
	
	
	<h3>Book details from EL : </h3> 
	
	Title = ${requestScope.book.title} <br/>
	Author = ${requestScope.book.author} <br/>
	ISBN = ${requestScope.book.isbn} <br/>
	
	Request Parameters : ${param.fn} <br/>
	
    <h4> Third book details: </h4>
    
	Title = ${customer.contact.address.streetNum} <br/>
	Author = ${BooksToDisplay[0].author} <br/>
	ISBN = ${BooksToDisplay[0].isbn} <br/>
    		
		
	
	<%@include file="footer.jsp" %>

</body>
</html>