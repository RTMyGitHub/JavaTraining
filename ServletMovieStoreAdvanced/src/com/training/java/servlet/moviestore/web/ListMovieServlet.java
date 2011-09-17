package com.training.java.servlet.moviestore.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.java.servlet.moviestore.domain.Movie;
import com.training.java.servlet.moviestore.domain.MovieDAO;
import com.training.java.servlet.moviestore.domain.MovieDAOJDBCImpl;

/**
 * Servlet implementation class ListMovieServlet
 */
public class ListMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListMovieServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			String jdbcURL = getServletContext().getInitParameter("jdbcURL");
			String username = getServletContext().getInitParameter("username");
			String password = getServletContext().getInitParameter("password");
			
			MovieDAO dao = new MovieDAOJDBCImpl(jdbcURL, username, password);
			List<Movie> movies = dao.getMovies();

			PrintWriter out = response.getWriter();

			out.println("<HTML>");
			out.println("<BODY>");
			out.println("<h1>These are all the movies we have in our database..</h1>");
			out.println("<TABLE BORDER='1' bordercolor='blue'");
			
			out.println("<TR>");
			out.println("<TH>Title</TH>");
			out.println("<TH>Genre</TH>");
			out.println("<TH>Release Date</TH>");
			out.println("<TH>Rating</TH>");
			out.println("</TR>");
			
			String numberOfMoviesToBeShown = getServletConfig().getInitParameter("numberOfMoviesToBeShown");
			int maxNumberOfMovies = Integer.parseInt(numberOfMoviesToBeShown);
			
			System.out.println("maxNumberOfMovies from Servlet config = " + maxNumberOfMovies);
			
			if(movies.size() < maxNumberOfMovies)
			{
				maxNumberOfMovies = movies.size();
			}
			
			for(int i=0; i<maxNumberOfMovies; i++)
			{
				Movie aMovie = movies.get(i);
				out.println("<TR>");
				out.println("<TD>" + aMovie.getName() + "</TD>");
				out.println("<TD>" + aMovie.getGenre() + "</TD>");
				out.println("<TD>" + aMovie.getReleaseDate() + "</TD>");
				out.println("<TD>" + aMovie.getRating() + "</TD>");
				out.println("</TR>");
			}
			
			out.println("</TABLE>");
			out.println("</BODY>");
			out.println("</HTML>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
