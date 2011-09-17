package com.training.java.servlet.moviestore.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.java.servlet.moviestore.domain.Movie;
import com.training.java.servlet.moviestore.domain.MovieDAO;
import com.training.java.servlet.moviestore.domain.MovieDAOJDBCImpl;

/**
 * Servlet implementation class AddMovieServlet
 */
public class AddMovieServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddMovieServlet()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String rating = request.getParameter("rating");
		String genre = request.getParameter("genre");

		Movie newMovie = new Movie();

		newMovie.setId(Integer.parseInt(id));
		newMovie.setName(name);
		newMovie.setGenre(genre);
		newMovie.setRating(rating);
		newMovie.setReleaseDate(new Date(System.currentTimeMillis()));

		request.setAttribute("VenkatsMovie", newMovie);
		
		RequestDispatcher rd = request.getRequestDispatcher("SaveMovie.jsp");
		rd.forward(request, response);
	}

}
