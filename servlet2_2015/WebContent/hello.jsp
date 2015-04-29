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

	<h2>Hello, how are you doing?</h2>
	<h4>Today's date is <%=new Date()%></h4>
	
	<h3>If you want to add a customer, please click <a href="/servlet2/AddCustomer2.html">here</a></h3>	
</body>
</html>