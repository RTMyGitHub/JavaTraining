<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">

.error {
	color: red; 
	font-size: 18px;
	font-weight: bolder;
}

</style>


</head>
<body>

	<sf:form action="/eshop5/signup" method="post" modelAttribute="customer">
	
		<sf:errors path="*" cssClass="error"/><br/><br/>
		
		First name : <sf:input path="firstName"/> <br/>
		Last name : <sf:input path="lastName"/><br/>
		Address : <sf:input path="address"/><br/>
		City : <sf:input path="city"/><br/>
		State : <sf:input path="state"/><br/>
		Zip : <sf:input path="zipCode"/><br/>
		
		<input type="submit" value="Add Customer">
	</sf:form>
	

</body>
</html>