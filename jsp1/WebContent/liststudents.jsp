<%@page import="java.util.Date"%>
<%@page import="com.training.java.jsp1.domain.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.training.java.jsp1.domain.StudentDAOJDBCImpl"%>
<%@page import="com.training.java.jsp1.domain.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ page errorPage="errorPage.jsp" %>	
	
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

	Current date = <%=getCurrentDate() %>
	<table border="1" bordercolor="red">
		<tr>
			<TH>First Name</TH>
			<TH>Last Name</TH>
			<TH>Phone Number</TH>
		</TR>

		<%
			StudentDAO dao = new StudentDAOJDBCImpl("com.mysql.jdbc.Driver",
					"jdbc:mysql://localhost/training", "root", "password");
			List<Student> students = dao.getAllStudents();

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
	
<%@ include file="footer.jsp" %>	
</body>
</html>