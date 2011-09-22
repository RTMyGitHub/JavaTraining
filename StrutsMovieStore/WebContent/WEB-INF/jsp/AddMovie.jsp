<%@page language="java"%>

<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html:form action="/save.do">

<html:errors/>
<h2>Please enter the details below and click Submit.</h2>

Id : <html:text name="movieForm" property="id"/> <br/>
Name : <html:text name="movieForm" property="name"/> <br/>
Rating : <html:text name="movieForm" property="rating"/> <br/>
Genre : <html:text name="movieForm" property="genre"/> <br/>

<html:submit/>

</html:form>