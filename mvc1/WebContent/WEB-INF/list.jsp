<%@page import="com.training.java.mvc1.domain.Student"%>
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

	<table border="1" bordercolor="red">
		<tr>
			<TH>First Name</TH>
			<TH>Last Name</TH>
			<TH>Phone Number</TH>
		</TR>

		<%
		    List<Student> students = (List<Student>) request.getAttribute("students");
			for (Student current : students) {
		%>
		
		<tr>
			<td> <%= current.getFirstName() %> </td>
			<td> <%= current.getLastName() %> </td>
			<td> <%= current.getPhoneNumber() %> </td>
		</tr>
		
		<%
			}
		%>
	</table>

</body>
</html>