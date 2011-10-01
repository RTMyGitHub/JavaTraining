<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>





<html:form action="/save.do">

<html:errors/>
<h2>Please enter the details and click Submit.</h2>

Cell Id : <html:text name="cellphoneform" property="cellid"/> <br/>
Cell Companyname: <html:text name="cellphoneform" property="cellCompanyname"/> <br/>
Model : <html:text name="cellphoneform" property="model"/> <br/>
Price : <html:text name="cellphoneform" property="price"/> <br/>

<html:submit/>

</html:form>