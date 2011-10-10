<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<sf:form method="POST" modelAttribute="movie">

	name : <sf:input path="name" />
	<br />
	rating : <sf:input path="rating" />
	<br />
	genre : <sf:input path="genre" />
	<br />

	<input type="submit" />
</sf:form>