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
<body data-currentpage="Contact">

<c:set var="currentPage" value="Contact"></c:set>
<jsp:include page="Header.jsp"></jsp:include>

<div class="container">
	<div class="row">
		<div class="col-md-4">
			<br/><br/>
			
			<img src="<c:url value='/images/Contact.jpg'/>"><br/><br/>
			
			<p class="lead">
				72 Crestfield Ave<br/>
				Troy, MI 48085 <br/>
				info@sonicvisonllc.com
			</p>
		</div>
		<div class="col-md-4">
		<br/><br/>
			<div id="map-canvas"></div>
		</div>
	</div>
</div>

<script src="https://maps.googleapis.com/maps/api/js"></script>	
<%@include file="AllScripts.jsp" %>

</body>
</html>