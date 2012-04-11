<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1><bean:message key="display.welcome"/></h1>

<h2>Please enter your details here</h2>

<html:errors/>

<html:form action="saveCar" method="post">
Type :
	<html:radio property="type" value="sedan">Sedan</html:radio>
	<html:radio property="type" value="coupe">Coupe</html:radio>
	<html:radio property="type" value="minivans">Van</html:radio><br/>
Make : <html:text property="make"/> <br/>
Model : <html:text property="model"/> <br/>
Year : <html:text property="year"/> <br/>
Price : <html:text property="price"/> <br/>

<html:submit/>
</html:form>

</body>
</html>