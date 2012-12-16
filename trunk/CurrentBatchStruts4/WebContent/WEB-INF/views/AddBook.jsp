<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<html:errors/>

<html:form action="/save" method="post">

	<html:hidden property="updateFlag"/>
	
	<bean:message key="display.title"/> :  <html:text property="title"/>
	
	<html:messages id="aMessage" property="title.missing">
		<bean:write name="aMessage"/>
	</html:messages>
	
	<br/>
	<bean:message key="display.author"/> : <html:text property="author"/>
	<html:messages id="aMessage" property="author.missing">
		<bean:write name="aMessage"/>
	</html:messages>
	
	<br/>
	<bean:message key="display.isbn"/> :   <html:text property="isbn"/><br/>
	<bean:message key="display.pages"/> :  <html:text property="pages"/><br/>
	
	<html:submit/>

</html:form>





</body>
</html>