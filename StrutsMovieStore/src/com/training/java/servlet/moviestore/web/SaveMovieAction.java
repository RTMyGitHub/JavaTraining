package com.training.java.servlet.moviestore.web;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.training.java.servlet.moviestore.domain.Movie;
import com.training.java.servlet.moviestore.domain.MovieDAO;
import com.training.java.servlet.moviestore.domain.MovieDAOJDBCImpl;

public class SaveMovieAction extends Action
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		MovieForm movieForm = (MovieForm) form;
		
		System.out.println("Name = " + movieForm.getName());
		System.out.println("Rating = " + movieForm.getRating());
		System.out.println("Genre = " + movieForm.getGenre());
		
		Movie newMovie = new Movie();
		
		newMovie.setGenre(movieForm.getGenre());
		newMovie.setName(movieForm.getName());
		newMovie.setRating(movieForm.getRating());
		newMovie.setId(movieForm.getId());
		newMovie.setReleaseDate(new Date(System.currentTimeMillis()));
		
		MovieDAO dao = new MovieDAOJDBCImpl("jdbc:mysql://localhost/training", "root", "password");
		dao.create(newMovie);
		
		return mapping.findForward("acknowledgement");
	}

}
