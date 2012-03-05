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
			<th><bean:message key="display.firstName"/></th>
			<th><bean:message key="display.lastName"/></th>
			<th><bean:message key="display.city"/></th>
			<th><bean:message key="display.age"/></th>
			<th><bean:message key="display.phoneNumber"/></th>
			<th><bean:message key="display.email"/></th>
		</tr>
		
		<logic:iterate id="aStudent" collection="${students}" type="com.training.java.struts.students.domain.Student">
			<tr>
				<td>
					<bean:write name="aStudent" property="firstName"/>
				</td>
				<td>
					<bean:write name="aStudent" property="lastName"/>
				</td>
				<td>
					<bean:write name="aStudent" property="city"/>
				</td>
				<td>
					<bean:write name="aStudent" property="age"/>
				</td>
				<td>
					<bean:write name="aStudent" property="phoneNumber"/>
				</td>
				<td>
					<bean:write name="aStudent" property="email"/>	
				</td>
			</tr>
		</logic:iterate>
	</table>
</body>
</html>