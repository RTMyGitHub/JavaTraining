<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome</h1>

<h2>Please enter your details here</h2>

<sf:form method="POST" modelAttribute="car">
	
	<sf:errors path="type" cssStyle="color:red; font-size:14px"/><br/>
	Type : <sf:input path="type"/> <br/>
	
	<sf:errors path="make" cssStyle="color:red; font-size:14px"/><br/>
	Make : <sf:input path="make"/> <br/>
	Model : <sf:input path="model"/> <br/>
	Year : <sf:input path="year"/> <br/>
	Price : <sf:input path="price"/> <br/>

	<input type="submit"/>

</sf:form>



</body>
</html>