package com.training.java.moviestore.web;

import java.util.List;

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
import com.training.java.moviestore.service.MovieService;

public class ListMoviesAction extends Action
{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		ServletContext servletContext = servlet.getServletContext();
		WebApplicationContext webAppContext = WebApplicationContextUtils
				.getWebApplicationContext(servletContext);
		MovieService service = (MovieService) webAppContext.getBean("movieService");

		List<Movie> movies = service.getMovies();
		request.setAttribute("Movies", movies);

		return mapping.findForward("listMovies");
	}

}
