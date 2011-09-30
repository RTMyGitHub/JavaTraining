package com.training.java.moviestore.web;

import java.sql.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.training.java.moviestore.domain.Movie;
import com.training.java.moviestore.domain.MovieDAO;
import com.training.java.moviestore.domain.MovieDAOJDBCImpl;
import com.training.java.moviestore.service.MovieService;

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
		
		ServletContext servletContext = servlet.getServletContext();
		WebApplicationContext webAppContext = WebApplicationContextUtils
				.getWebApplicationContext(servletContext);
		MovieService service = (MovieService) webAppContext.getBean("movieService");
		service.create(newMovie);
		
		return mapping.findForward("acknowledgement");
	}

}
