<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table bordercolor="blue" border="1">
	<tr>
		<th>Name</th>
		<th>Rating</th>
		<th>Release date</th>
		<th>Genre</th>
	</tr>
	<c:forEach items="${movies}" var="aMovie">
		<tr>
			<td>Name : <a href="edit?id=<c:out value='${aMovie.id}'/>"><c:out value="${aMovie.name}"></c:out></a> <br /></td>
			<td>Rating : <c:out value="${aMovie.rating}"></c:out> <br /></td>
			<td>Release date : <c:out value="${aMovie.releaseDate}"></c:out>
				<br /></td>
			<td>Genre : <c:out value="${aMovie.genre}"></c:out> <br /></td>
		</tr>
	</c:forEach>
</table>