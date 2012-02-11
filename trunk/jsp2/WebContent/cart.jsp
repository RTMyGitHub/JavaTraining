<%@page import="java.util.ArrayList"%>
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

<%
	if(session.isNew())
	{
		out.print("<h1> Welcome to our store");
	}
	else
	{
		String bookName = request.getParameter("bookName");
		
		List<String> booksBought = null;
		
		if(session.getAttribute("booksBought") == null)
		{
			booksBought = new ArrayList<String>();
			session.setAttribute("booksBought", booksBought);
		}
		else
		{
			booksBought = (List<String>) session.getAttribute("booksBought");
		}
		
		booksBought.add(bookName);
		
		out.print("<h1> Welcome back, you bought..");
		out.println("<br/>");
		
		for(String current : booksBought)
		{
			out.println(current);
			out.println("<br/>");
		}
	}
%>

<form action="/jsp2/cart.jsp">

<h2>Please enter the book that you want to buy : <input type="text" name="bookName">
<input type="submit" value="Add to Cart"/>

</form>



</body>
</html>