<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<sf:form action="/springmvc1/customer/add" method="post" modelAttribute="customer">
		First name : <sf:input path="firstName"/> <br/>
		Last name : <sf:input path="lastName"/><br/>
		City : <sf:input path="city"/><br/>
		State : <sf:input path="state"/><br/>
		Zip : <sf:input path="zipCode"/><br/>
		
		<input type="submit" value="Add Customer">
	</sf:form>


</body>
</html>