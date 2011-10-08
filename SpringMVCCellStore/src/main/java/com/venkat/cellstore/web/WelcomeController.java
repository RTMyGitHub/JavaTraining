package com.venkat.cellstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public ModelAndView welcome()
	{
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("message", "hello");
		mv.setViewName("helloworld");
		
		return mv;
	}

}
