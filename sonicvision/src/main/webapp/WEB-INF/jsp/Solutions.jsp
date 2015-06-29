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
<body data-currentpage="Solutions">

<jsp:include page="Header.jsp"></jsp:include>

<div class="container">
	<div class="row">
		<div class="col-md-8">
			<h3>Solutions</h3>
			<p>Sonic Vision works with leading companies in a range of industries to provide world-class services. 
			Our specialized industry focus allows us to understand the issues and challenges within competitive space, 
			and gives us the ability to meet your needs with solutions that will propel your organization to the next level.</p>
			
			
			<img src="<c:url value='/images/solutions.jpg'/>"><br/>
			
			<b><i>Telecom</i></b>

			<p>Time-to-market and customer loyalty in the Telecommunications world is crucial. You need effective information systems that will strengthen your business as it changes and grows. You need a partner with extensive global experience who has access to expertise relating to every aspect of telecommunications and understand your operations and software requirements.</p>

			<p>Sonic Vision's leading edge systems and best-practice processes allow you to:</p>

				<ul>
					<li>Manage your customers through interactive customer contact centers or Web-enabled call centers equipped with the latest tools in CRM;</li>
					<li>Serve your customers through automated Order Management, gateway and provisioning systems;</li>
					<li>Manage your business through flexible billing, and credit risk collection systems.</li>
				</ul>
			
			<b><i>Pharma & Healthcare</i></b>
			
			<p>Organizations within the Healthcare industry are constantly looking for new ways to 
				leverage information technology in order to reduce medical errors, promote patient safety 
				and improve service. 
				In addition, compliance with the Health Insurance Portability and Accountability Act (HIPAA) 
				is a top concern for IT healthcare executives. 
				With tight budgets and other constraints, the industry needs solutions that are cost effective and flexible.</p>
			<p>Our position as the leading information technology resource management (ITRM) company provides 
				us with the experience and resources necessary to meet the needs of today's healthcare organizations.
				Sonic Vision is dedicated to providing you with innovative, technical and management services. 
				We provide a full range of critical information technology services and solutions. 
				Our capabilities span a broad spectrum of value-added information technology services.</p>
				
			<b><i>Technology</i></b>	
			
			<p>Sonic Vision is keenly aware that aggressive go-to-market cycles, extreme competitive pressures, 
				an ever-changing technology landscape and the paucity of skilled resources are facts of life in the technology 
				and services industry. Engaged in either developing products or providing consulting and support services, 
				our technology and services customer-partners leverage our broad and deep expertise across technologies 
				and platforms to better serve their own customers.
				The more effectively your employees use technology – the more efficiently your business will run. 
				Sonic Vision is your one-stop resource for complete solutions-related staff augmentation services. 
				Our team provides an extensive mix of services that help companies who rely on technology gain 
				and sustain competitive advantage.</p>
				
			<b><i>Government</i></b>		
			<p>As societies and economies evolve, largely due to the influence of globalization, changing demographics, 
				and the rise of the digital economy, governments are “reinventing” themselves to meet new expectations and the priorities of businesses. 
				These dynamics are compelling the government to create a new vision that recognizes the different ways 
				that people interact with their government:
				As taxpayers who expect value and results;As clients who expect accessible, quality services;
				As citizens who participate in the democratic process.
				The government’s challenge is to meet these issues by reassessing the substantial resources it has in IS/IT assets and leveraging these investments 
				to make government more responsive and affordable.</p>
			<p>We provide the best value IT consulting; combining high-quality IT consultants expected of top primes/integrators without 
				the overhead cost of the fixed-bid infrastructure. 
				Sonic Vision will help you meet your budget, quality, and deadline goals – not just provide IT staff. 
				We can also help with qualified project managers, senior architects and planners. 
				Regardless of the level of IT Project Support required, you’ll get the best value from Sonic Vision.</p>		
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