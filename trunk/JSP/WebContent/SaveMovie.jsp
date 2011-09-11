<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="com.training.java.servlet.moviestore.domain.Movie"%>
<%@page import="java.sql.Date"%>
<%@page import="com.training.java.servlet.moviestore.domain.MovieDAO"%>
<%@page import="com.training.java.servlet.moviestore.domain.MovieDAOJDBCImpl"%><html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String genre = request.getParameter("genre");
	String rating = request.getParameter("rating");
	
	Movie newMovie = new Movie();

	newMovie.setId(Integer.parseInt(id));
	newMovie.setName(name);
	newMovie.setGenre(genre);
	newMovie.setRating(rating);
	newMovie.setReleaseDate(new Date(System.currentTimeMillis()));

	MovieDAO dao = new MovieDAOJDBCImpl("jdbc:mysql://localhost/training",
			"root", "password");

	dao.create(newMovie);
%>

<h1>Your details have been saved successfully..</h1>


</body>
</html>