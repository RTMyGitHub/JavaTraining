package com.training.redbox.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.training.redbox.domain.Movie;
import com.training.redbox.domain.MovieService;
import com.training.redbox.domain.ServiceException;

@Controller
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	private MovieService service;

	@RequestMapping("/list")
	public ModelAndView displayMovies() {
		
		ModelAndView mv = new ModelAndView("ShowMovies");
		
		try {
			List<Movie> movies = service.getAllMovies();
			
			mv.addObject("movies", movies);
			
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		return mv;
	}

}
