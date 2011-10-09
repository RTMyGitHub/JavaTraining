package com.training.moviestore.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController
{
	@RequestMapping("/")
	public String welcome()
	{
		return "HomePage";
	}

	@RequestMapping("/hello")
	public String sayHello()
	{
		return "Welcome";
	}

	@RequestMapping("/customHello")
	public ModelAndView sayCustomHello(@RequestParam("fn") String firstName,
			@RequestParam("ln") String lastName)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("customGreeting", "Welcome to my site sir/madam "
				+ firstName + " " + lastName);
		mv.setViewName("CustomGreeting");

		return mv;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/movie/{id}")
	public ModelAndView getMovie(@PathVariable String id)
	{
		System.out.println("id I got = " + id);
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("MovieTitle", "Cars2");
		mv.addObject("Producer", "Disney");
		
		mv.setViewName("Movie");
		
		return mv;
	}

}
