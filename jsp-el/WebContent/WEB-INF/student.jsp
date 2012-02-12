<%@page import="com.training.java.mvc1.domain.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	First name from EL : ${student.firstName} <br/>
	Last name from EL : ${student.lastName} <br/>
	City from EL : ${student.city} <br/>
	
	State from EL : ${param.state} <br/>
	Country from EL : ${param.country} <br/>
	
	<%
		String state = request.getParameter("state");
	    String country = request.getParameter("country");
	%>
	
	State : <%=state %> <br/>
	Country : <%=country %> <br/>
	
	First name from EL in request scope : ${sessionScope.student.firstName} <br/>
	Last name from EL in request scope : ${requestScope.student.lastName} <br/>
	City from EL in request scope : ${requestScope.student.city} <br/>
	
	Street from session scope : ${sessionScope.street} <br/>
	
	Second student details : ${students[1].lastName}

</body>
</html>