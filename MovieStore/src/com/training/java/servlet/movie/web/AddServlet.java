package com.training.java.servlet.movie.web;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.java.servlet.movie.domain.Movie;
import com.training.java.servlet.movie.domain.MovieDao;
import com.training.java.servlet.movie.domain.MovieDaoImple;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String movieIdStr = request.getParameter("movieId");
		String title = request.getParameter("title");
		String director = request.getParameter("director");
		String type = request.getParameter("type");
		String releaseDatestr = request.getParameter("releaseDate");
		DateFormat format = new SimpleDateFormat("mmDDyyyy");
		
		Date releaseDate = null;
		try {
			releaseDate= format.parse(releaseDatestr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		int movieId = Integer.parseInt(movieIdStr);
		
		String jdbcUrl = getServletContext().getInitParameter("jdbcUrl");
		String userName = getServletContext().getInitParameter("userName");
		String password = getServletContext().getInitParameter("password");
		
		
		Movie movie = new Movie(movieId, title, type, director, releaseDate);
		MovieDao  dao = new MovieDaoImple(jdbcUrl,userName,password);
		dao.addMovies(movie);
		
		response.sendRedirect("/MovieStore/lst");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
