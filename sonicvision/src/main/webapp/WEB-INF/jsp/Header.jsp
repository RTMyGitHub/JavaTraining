<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Header</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet" href="/sonicvision/styles/application.css"/>
</head>

<body>

<div class="container">
	<div><img src="<c:url value='/images/sonicvision.png'/>"></div>
	<div class="navbar pull-middle">
		<ul class="nav nav-pills">
		  <li id="Home"><a href="<c:url value='/home'/>">Home</a></li>
		  <li id="About" ><a href="<c:url value='/about'/>">About</a></li>
		  <li id="Solutions" ><a href="<c:url value='/solutions'/>">Solutions</a></li>
		  <li id="Services" ><a href="<c:url value='/services'/>">Services</a></li>
		  <li id="Careers" ><a href="<c:url value='/careers'/>">Careers</a></li>
		  <li id="Contact" ><a href="<c:url value='/contact'/>">Contact</a></li>
		</ul>
	</div>
</div>
	
<div class="container">
	<div id="slider1_container" style="position: relative; top: 0px; left: 0px; width: 940px; height: 290px;">
    <div u="slides" style="cursor: move; position: absolute; overflow: hidden; left: 0px; top: 0px; width: 940px; height: 290px;">
        <div><img u="image" src="<c:url value='/images/Slider1.jpg'/>"/></div>
        <div><img u="image" src="<c:url value='/images/Slider2.jpg'/>"/></div>
        <div><img u="image" src="<c:url value='/images/Slider3.jpg'/>"/></div>
    </div>
    
	</div>
</div>

<%@include file="AllScripts.jsp" %>
	
</body>
</html>