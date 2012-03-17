<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
	<table bordercolor="blue" border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>City</th>
		</tr>
		<c:forEach items="${students}" var="current">
			<tr>
				<td>${current.firstName}</td>
				<td>${current.lastName}</td>
				<td>${current.city}</td>
			</tr>
		</c:forEach>
	</table>
