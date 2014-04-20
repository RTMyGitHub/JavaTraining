package com.training.java.redbox;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.training.java.redbox.domain.DAOException;
import com.training.java.redbox.domain.Movie;
import com.training.java.redbox.domain.MovieDAO;
import com.training.java.redbox.domain.MovieDAOJDBCImpl;

public class ListMoviesAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		System.out.println("ListMoviesAction.execute called");
		
		MovieDAO dao = new MovieDAOJDBCImpl();
		
		try {
		List<Movie> movies = dao.getAllMovies();
		
		request.setAttribute("movies", movies);
			
		} catch (DAOException e) {
			e.printStackTrace();
		}
		
		return mapping.findForward("list");
		
	}
	
	

}
