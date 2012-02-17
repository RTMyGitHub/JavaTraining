<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2><font color="blue"> Student Details : </font><br/></h2>

<jsp:useBean id="student" class="com.training.java.jsp.actions.domain.Student" scope="request"></jsp:useBean>
First Name : <jsp:getProperty property="firstName" name="student"/> <br/>
Last Name : <jsp:getProperty property="lastName" name="student"/> <br/>
City : <jsp:getProperty property="city" name="student"/> <br/>

</body>
</html>