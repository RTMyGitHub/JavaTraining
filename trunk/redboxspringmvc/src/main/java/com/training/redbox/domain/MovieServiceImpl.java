package com.training.redbox.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieDAO dao;

	@Override
	public List<Movie> getAllMovies() throws ServiceException {
		
		try {
			return dao.getAllMovies();
		} catch (DAOException e) {
			e.printStackTrace();
			throw new ServiceException(e);
		}
		
		
	}

}
