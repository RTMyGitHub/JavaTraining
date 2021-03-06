<%@page import="com.training.java.redbox.domain.Movie"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@include file="Header.jsp"%>

	<%
		int size = 0;
		List<Long> cart = (List<Long>) session.getAttribute("cart");

		if (cart != null) {
			size = cart.size();
		}
	%>

	<table border="0" width="800">
		<tr>
			<td align="right">
				<img src="images/login.jpg" width="80" height="25">
				<img src="images/signup2.jpg" width="80" height="25">
				<img src="images/cart.jpg" width="30" height="25" /> (<%=size%>)
				<a href="/redbox/checkout"><img src="images/checkout.jpg" width="80" height="30" /></a>
			</td>
		</tr>
	</table>

	<%
		List<Movie> movies = (List<Movie>) request.getAttribute("movies");
	%>

	<table border="0">
		<tr>
			<%
				for (Movie movie : movies) {
			%>
			<td><img src="<%=movie.getImageLocation()%>" width="150"
				height="225"></td>

			<%
				}
			%>
		</tr>

		<tr>
			<%
				for (Movie movie : movies) {
			%>
			<td><a href="/redbox/addToCart?id=<%=movie.getId()%>">Add to<img
					src="images/cart.jpg" width="30" height="25">
			</a></td>

			<%
				}
			%>
		</tr>
	</table>

	<%@include file="Footer.jsp"%>

</body>
</html>