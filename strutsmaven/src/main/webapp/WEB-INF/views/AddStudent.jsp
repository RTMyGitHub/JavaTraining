<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<html:errors/>
	
	<h2>Please fill the details below and press Submit...</h2>
	<html:form action="saveStudent.do" method="post">
		Id         : <html:text name="studentForm" property="id"/> <br/>
		First name : <html:text name="studentForm" property="firstName"/><br/>
		Last name : <html:text name="studentForm" property="lastName"/><br/>
		Age : <html:text name="studentForm" property="age"/><br/>
		Phone : <html:text name="studentForm" property="phone"/><br/>
		Email : <html:text name="studentForm" property="email"/><br/>
		City : <html:text name="studentForm" property="city"/><br/>
	
		<html:submit/>
	</html:form>
</body>
</html>