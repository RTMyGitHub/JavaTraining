<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="com.training.java.servlet.moviestore.domain.MovieDAO"%>
<%@page
	import="com.training.java.servlet.moviestore.domain.MovieDAOJDBCImpl"%>
<%@page import="java.util.List"%>
<%@page import="com.training.java.servlet.moviestore.domain.Movie"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@include file="Header.jsp" %>


<table border="1" bordercolor="red">

	<tr>
		<th>Title</th>
		<th>Genre</th>
		<th>Release Date</th>
		<th>Rating</th>
	</tr>

	<%
MovieDAO dao = new MovieDAOJDBCImpl("jdbc:mysql://localhost/training",
		"root", "password");
List<Movie> movies = dao.getMovies();

for(Movie aMovie : movies)
{
%>
<tr>
<td><%=aMovie.getName() %></td>
<td><%=aMovie.getGenre() %></td>
<td><%=aMovie.getReleaseDate() %></td>
<td><%=aMovie.getRating() %></td>
</tr>

<% } %>

		<!-- .... -->
</table>

<%@include file="Footer.jsp" %>

</body>
</html>