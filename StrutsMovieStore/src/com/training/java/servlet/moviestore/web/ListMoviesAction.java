package com.training.java.servlet.moviestore.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.training.java.servlet.moviestore.domain.Movie;
import com.training.java.servlet.moviestore.domain.MovieDAO;
import com.training.java.servlet.moviestore.domain.MovieDAOJDBCImpl;

public class ListMoviesAction extends Action
{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		MovieDAO dao = new MovieDAOJDBCImpl("jdbc:mysql://localhost/training", "root", "password");
		List<Movie> movies = dao.getMovies();
		request.setAttribute("Movies", movies);

		return mapping.findForward("listMovies");
	}

}
