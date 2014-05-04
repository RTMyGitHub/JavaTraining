<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
.error {
	color: red;
	font-size: 0.9em;
	font-weight: bold;
}
</style>


</head>
<body>

	<%@include file="Header.jsp"%>

	<sf:form method="POST" modelAttribute="customer"
		action="/redboxspringmvc/signup">

		<sf:errors path="*" cssClass="error" />

		<br />
		<br />

		<c:if test="${error!=null}">

			<h4>
				<font color="red">Username exists, please try another.</font>
			</h4>

		</c:if>

		<table>

			<tr>
				<td>First Name:</td>
				<td><sf:input path="firstName" /></td>
			</tr>

			<tr>
				<td>Last Name:</td>
				<td><sf:input path="lastName" /></td>
			</tr>

			<tr>
				<td>Address:</td>
				<td><sf:input path="address" /></td>
			</tr>

			<tr>
				<td>City:</td>
				<td><sf:input path="city" /></td>
			</tr>

			<tr>
				<td>State:</td>
				<td><sf:input path="state" /></td>
			</tr>

			<tr>
				<td>ZIP:</td>
				<td><sf:input path="zipCode" /></td>
			</tr>

			<tr>
				<td>Create a username:</td>
				<td><sf:input path="userName" /></td>
			</tr>

			<tr>
				<td>Create a password:</td>
				<td><sf:password path="password" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>

		</table>

	</sf:form>


	<%@include file="Footer.jsp"%>

</body>
</html>