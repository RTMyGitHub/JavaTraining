package com.training.moviestore.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.moviestore.domain.Movie;
import com.training.moviestore.domain.MovieService;

@Controller
public class MovieController
{
	@Autowired
	private MovieService service;

	@RequestMapping("/list")
	public ModelAndView getMovies()
	{
		ModelAndView mv = new ModelAndView();

		List<Movie> movies = service.getMovies();
		mv.addObject("movies", movies);
		mv.setViewName("ListMovies");

		return mv;
	}

	@RequestMapping("/add")
	public String add(Model model)
	{
		model.addAttribute("movieToAdd", new Movie());

		return "Add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String save(@ModelAttribute Movie movie)
	{
		service.create(movie);
		
		return "Acknowledgement";
	}
}
