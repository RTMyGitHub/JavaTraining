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
<body data-currentpage="Services">

<c:set var="currentPage" value="Services"></c:set>
<jsp:include page="Header.jsp"></jsp:include>

<div class="container">
	<div class="row">
		<div class="col-md-8">
			<h3>Services</h3>
			<p>From providing Staffing, Consulting and Systems Integration Services to managing IT and business functions 
				on behalf of our clients, Sonic Vision provides an all-encompassing offering that includes the planning, design, 
				implementation and management of highly effective IT environments. 
				Our global delivery capabilities include onsite and off-shore options, giving our clients the flexibility to choose 
				the model that best meets their needs and requirements.</p>
			
			<img src="<c:url value='/images/Services.jpg'/>">
			
			<p>Through our vertical expertise in financial services, government and healthcare, telecommunications and utilities, 
				retail and distribution and manufacturing, we provide clients with a partner that is not only expert in IT, 
				but also expert in their industries. This combination of business knowledge and technology expertise allows us 
				to help our clients adapt as their industries change, and in the process, allows us to help evolve the industries in which we operate.</p>
				
			<p>More importantly, Sonic Vision has a large pool of employees and associate consultants, who provide a diverse 
				skill set in Internet, Client Server, ERP/CRM, and Network Infrastructure technologies. 
				Their diverse experience, education and backgrounds have helped us create a deep collective pool of talent and knowledge, 
				and ensures that Sonic Vision brings strong domain and product knowledge to our services.</p>
		</div>
		<div class="col-md-4">
			<div>
				<h4>Why Choose Us?</h4>
				<ul>
					<li>Service quality is our high priority</li>
					<li>Creating a positive atmosphere</li>
					<li>High performance culture</li>
					<li>Honesty and integrity.</li>
					<li>Find expert professionals in all careers</li>
					<li>Credibility</li>
					<li>Excellence</li>
				</ul>
			</div>
			<div>
				<h4>Technologies</h4>
				<ul>
					<li>Healthcare</li>
					<li>Project Management</li>
					<li>Reality</li>
					<li>Financial</li>
					<li>Retail</li>
					<li>Testing</li>
					<li>Energy</li>
					<li>Banking</li>
					<li>Business Analysis</li>
					<li>Construction</li>
					<li>Tele Communication</li>
					<li>Development</li>
				</ul>
			</div>
		</div>
	</div>
</div>
</body>
</html>