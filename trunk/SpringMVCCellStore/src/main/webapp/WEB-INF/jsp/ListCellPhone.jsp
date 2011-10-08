<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<table>
	<tr>
		<th>Company Name</th>
		<th>Phone</th>
	</tr>
	<c:forEach var="aCell" items="${cells}">
		<tr>
			<td><c:out value="${aCell.name}" />
			</td>
			<td><c:out value="${aCell.company}" />
			</td>
		</tr>
	</c:forEach>
</table>