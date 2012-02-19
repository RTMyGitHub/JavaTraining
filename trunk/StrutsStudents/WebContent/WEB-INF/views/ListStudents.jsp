<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1" bordercolor="red">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>City</th>
			<th>Age</th>
			<th>Phone</th>
			<th>Email</th>
		</tr>
		
		<logic:iterate id="aStudent" collection="${students}" type="com.training.java.struts.students.domain.Student">
			<tr>
				<td>
					${aStudent.firstName}
				</td>
				<td>
					${aStudent.lastName}
				</td>
				<td>
					${aStudent.city}
				</td>
				<td>
					${aStudent.age}
				</td>
				<td>
					${aStudent.phoneNumber}
				</td>
				<td>	
					${aStudent.email}
				</td>
			</tr>
		</logic:iterate>
	</table>
</body>
</html>