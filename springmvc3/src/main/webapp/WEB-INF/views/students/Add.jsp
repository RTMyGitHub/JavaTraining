<%@page import="org.springframework.validation.BindingResult"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Please fill the details below and press Submit...</h2>
	<sf:form method="POST" modelAttribute="student">
		Id         : <sf:input path="id"/> <br/>
		<sf:errors path="firstName" cssClass="error"></sf:errors><br/>
		First name : <sf:input path="firstName"/><br/>
		Last name : <sf:input path="lastName"/><br/>
		Age : <sf:input path="age"/><br/>
		Phone : <sf:input path="phoneNumber"/><br/>
		Email : <sf:input path="email"/><br/>
		City : <sf:input path="city"/><br/>
		
		<br/>
		<input type="Submit"/>
	
	</sf:form>
</body>
</html>