<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<b>Hi, this is my first JSP!!</b><br/>

<h1>The date here on server is :
 
<%= new Date()%>

</h1>


<% 
System.out.println("Hello");

%>

<%
	String fn = request.getParameter("firstName");
	String ln = request.getParameter("lastName");
%>

First name= : <%=fn %> <br/>
Last name= : <%=ln %>


<%
    out.println("<B><I>How are you? </I></B>");
%>



</body>
</html>