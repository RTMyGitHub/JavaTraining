<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Please fill the details below and press Submit...</h2>
	<form action="/StrutsStudents/saveStudent.do" method="post">
	
		Id         : <input type="text" name="id"/> <br/>
		First name : <input type="text" name="firstName"/><br/>
		Last name : <input type="text" name="lastName"/><br/>
		Age : <input type="text" name="age"/><br/>
		Phone : <input type="text" name="phone"/><br/>
		Email : <input type="text" name="email"/><br/>
		City : <input type="text" name="city"/><br/>
	
		<input type="submit">
	</form>
</body>
</html>