package com.training.venkat.spring1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieServiceImplTest2 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config.xml");

		MovieService service = context.getBean(MovieService.class);
		
		List<Movie> movies = service.getBluerayMovies();
		for (Movie movie : movies) {
			System.out.println("Title = " + movie.getTitle());
		}

	}

}
