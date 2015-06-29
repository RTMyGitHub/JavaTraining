<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet" href="/eshop/styles/eshop.css"/>
</head>
<body data-currentpage="About">

<jsp:include page="Header.jsp"></jsp:include>

<div class="container">
	<div class="row">
		<div class="col-md-8">
			<h3>About</h3>
			<p>Sonic Vision is one of the leading Companies delivering high quality Information Technology Solutions and Services. 
				Our technologists focus on delivering solutions and services to support current and future business needs of our clients. 
				Our consultants are highly talented, self-motivated and goal oriented who are dedicated 
				to their work and provide high quality work on time, with in project/program costs. 
				Sonic Vision has developed a team, which possesses skills necessary to plan, build, and launch business solutions 
				for a diverse clientele in a broad range of industries.</p>

			<p>We currently serve in the areas of Healthcare, Banking, Insurance, Telecommunications and Consumer Products. 
			Our employees are equipped with higher degrees in education and most of them are certified in their respective fields. 
			Our dedicated team of professionals have been instrumental in developing substantive solutions 
			for our customers primarily in the USA and India. 
			Our dedicated development group has all the expertise needed for developing customized applications 
			and providing complete solutions to the customers. 
			Our development team carries out research continuously in tune with the changing needs of the global market 
			while our project management staff has developed methods and structures that allow us to manage complex projects.</p>
		</div>
		<div class="col-md-4">
			<h3>Our Mission</h3>
			<img src="<c:url value='/images/mission.jpg'/>">
			<p>At Sonic Vision, our mission is to create an outstanding value to our customers and stakeholders. 
			We strive to provide innovative, affordable solutions and enhanced business processes which inturn 
			deliver long term benefits to our clients. 
			Sonic Vision is fostering a corporate culture that attracts 
			and retains innovative and energetic employees who are driven to deliver client needs.</p>
		</div>
	</div>

</div>
</body>
</html>