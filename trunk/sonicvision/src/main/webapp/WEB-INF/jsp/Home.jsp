<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet" href="/sonicvision/styles/application.css"/>
</head>
<body data-currentpage="Home">

<jsp:include page="Header.jsp"></jsp:include>

<div class="container">	
	<div class="row">
		<div class="col-md-4">
			<h3>Welcome</h3>
			<img src="<c:url value='/images/Welcome.jpg'/>">
			<p>We seek to provide top IT expertise 
				and technical assistance to help 
				clients in the implementation of their solutions.</p>
		</div>
		<div class="col-md-4">
			<h3>Quality Management</h3>
			<img src="<c:url value='/images/QualityManagement.jpg'/>">
			<p>We offer the right commitment and focus while 
				partenering with our clients in their growth endeavors.</p>
		</div>
		<div class="col-md-4">
			<h3>Our technologists</h3>
			<img src="<c:url value='/images/OurTechnologies.jpg'/>">
			<p>Our technologists focus on delivering solutions 
				and services to support current and future business needs of our clients.</p>
		</div>
	</div>
</div>

<%@include file="AllScripts.jsp" %>

</body>
</html>