<%@page language="java"%>

<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<h1>Add Book..</h1>
<html:html>
<html:form action="saveBook.do">
	ID : <html:text name="bookForm" property="id" /> </br>
	Title : <html:text name="bookForm" property="title" /> </br>
	Author : <html:text name="bookForm" property="author" /> </br>
	ISBN : <html:text name="bookForm" property="isbn" /> </br>
	Pages : <html:text name="bookForm" property="pages" /> </br>
	Publisher Id :<html:text name="bookForm" property="publisherId" /> </br>
	<html:submit value="Submit" />
</html:form>
</html:html>