<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet" href="SonicVision.css"/>
</head>
<body data-currentpage="Careers">

<c:set var="currentPage" value="Careers"></c:set>
<jsp:include page="Header.jsp"></jsp:include>

<div class="container">
	<div class="row">
		<div class="col-md-8">
			<h3>Careers</h3>
			<p>At Sonic Vision, we provide opportunities that offer both challenges and rewards. 
				Put your knowledge and skills to work on a team that encourages initiative, fosters innovation, endorses accountability, and promotes integrity. 
				We value our associates and respect our customers— always striving to enable them to achieve the measurable results that support their success</p>
			
			<p>Are you a person of exemplary character and integrity...committed to growth and excellence...and driven to deliver superior solutions? 
				Are you tenacious, flexible, and creative - a person who thrives on challenges?</p>
				
			<p>Then work with us!</p>
			
			<b>Current Oppertunities</b>
			
			<table class="table">
				<thead>
					<tr>
						<th>Job #</th>
						<th>Job Title</th>
						<th>Location</th>
						<th>Duration</th>
					</tr>
					<tr>
						<td>SV10</td>
						<td>Java Developer</td>
						<td>Auburn Hills, MI</td>
						<td>long-term</td>
					</tr>
					<tr>
						<td>SV11</td>
						<td>QA ANALYST</td>
						<td>Detroit, MI</td>
						<td>long-term</td>
					</tr>
					<tr>
						<td>SV12</td>
						<td>Java Tester</td>
						<td>Livonia, MI</td>
						<td>long-term</td>
					</tr>
					<tr>
						<td>SV13</td>
						<td>Java Architect</td>
						<td>Auburn Hills, MI</td>
						<td>long-term</td>
					</tr>
				</thead>
				<tbody></tbody>
			</table>
				
		</div>
		<div class="col-md-4">
			<div>
				<h3>Solutions</h3>
				<img src="<c:url value='/images/Solutions2.jpg'/>">
			</div>
			
			<div>
			<h3>Vision</h3>
			<img src="<c:url value='/images/vision.jpg'/>">
			<p>We understand the importance of functionality, security, robustness and performance, and we do our best 
				utilizing industry proven development technologies and tools. 
				Our Vision is to provide excellent management of technology and support to our clients.</p>
			</div>
		</div>
	</div>

</div>
</body>
</html>