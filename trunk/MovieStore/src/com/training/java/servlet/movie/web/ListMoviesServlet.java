package com.training.java.servlet.movie.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.java.servlet.movie.domain.Movie;
import com.training.java.servlet.movie.domain.MovieDao;
import com.training.java.servlet.movie.domain.MovieDaoImple;

/**
 * Servlet implementation class ListMoviesServlet
 */
public class ListMoviesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListMoviesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jdbcUrl = getServletContext().getInitParameter("jdbcUrl");
		String userName = getServletContext().getInitParameter("userName");
		String password = getServletContext().getInitParameter("password"); 
		
		 int maxMovies = Integer.parseInt((getServletConfig().getInitParameter("maxNoOfMovies")));
	      MovieDao dao = new MovieDaoImple(jdbcUrl,userName,password);
	      
	       List<Movie> movies=  dao.getAllMovies();
	       
	                     PrintWriter out = response.getWriter();
	                     
	                     out.println("<HTML><BODY>");
	                     
	                     out.println("<TABLE border=1 bordercolor='red'>");
	                     out.println("<TR>");

	                     out.println("<TH>Title</TH>");       
	                     out.println("<TH>Director</TH>");
	                     out.println("<TH>Type</TH>");
	                     out.println("<TH>Release_Date</TH>");
	                     out.println("</TR");
	                     
	                     if(maxMovies > movies.size()){
	                    	 
	                    	 maxMovies = movies.size();
	                     }
	                     
	                     for(int i=0; i<maxMovies ; i++){
	                    	 Movie movie = movies.get(i);
	                    	 out.println("<TR>");
                           out.println("<TD>"+movie.getTitle()+"</TD>");
                           out.println("<TD>"+movie.getDirector()+"</TD>");
                           out.println("<TD>"+movie.getType()+"</TD>");
                           out.println("<TD>"+movie.getDate()+"</TD>");
                           out.println("</TR>");
	                     }
	                     out.println("</TABLE>");
	                     out.println("</BODY></HTML>");
	      
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
