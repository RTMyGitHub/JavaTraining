<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="com.training.java.servlet.moviestore.domain.MovieDAO"%>
<%@page
	import="com.training.java.servlet.moviestore.domain.MovieDAOJDBCImpl"%>
<%@page import="com.training.java.servlet.moviestore.domain.Movie"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	Movie newMovie = (Movie) request.getAttribute("VenkatsMovie");

	HttpSession mySession = request.getSession();

	//If user comes for the first time
	if (mySession.getAttribute("MovieCart") == null)
	{
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(newMovie);

		session.setAttribute("MovieCart", movies);
	} else
	{
		List<Movie> movies = (List<Movie>) session
				.getAttribute("MovieCart");

		for (Movie aMovie : movies)
		{
			System.out.println("Movie title = " + aMovie.getName());
		}

		movies.add(newMovie);

		session.setAttribute("MovieCart", movies);
	}

	String checkout = request.getParameter("checkout");

	if (checkout != null && checkout.equalsIgnoreCase("Y"))
	{
		String jdbcURL = getServletContext()
				.getInitParameter("jdbcURL");
		String username = getServletContext().getInitParameter(
				"username");
		String password = getServletContext().getInitParameter(
				"password");

		List<Movie> moviesFromSession = (List<Movie>) session
				.getAttribute("MovieCart");
		MovieDAO dao = new MovieDAOJDBCImpl(jdbcURL, username, password);

		for (Movie aMovie : moviesFromSession)
		{
			dao.create(aMovie);
		}
%>
<h1>your details have been saved successfully in database</h1>
<%
	} else
	{
		List<Movie> movies = (List<Movie>) session
		.getAttribute("MovieCart");
%>

<h1>your movies have been added to cart..You can do the following..</h1>
Number of movies you added so far to your cart is :
<%= movies.size()%>
<%
	}
%>

<h3>Go back to Add Movie screen<a
	href="/ServletMovieStoreAdvanced/AddMovie.html">here</a></h3>






</body>
</html>