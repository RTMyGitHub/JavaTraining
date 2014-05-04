package com.training.redbox.domain;

import java.util.List;

public interface MovieService {
	
	List<Movie> getAllMovies() throws ServiceException;

}
