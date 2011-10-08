<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<sf:form method="POST" modelAttribute="cellPhone">

	Name : <sf:input path="name" /> <br/>
	Company : <sf:input path="company" /> <br/>
	
	<input type="submit"/>
</sf:form>