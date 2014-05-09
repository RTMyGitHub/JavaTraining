package com.training.redbox.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	@Qualifier("movieDAOJPAImpl")
	private MovieDAO dao;

	@Override
	@Transactional
	public List<Movie> getAllMovies() throws ServiceException {
		
		try {
			return dao.getAllMovies();
		} catch (DAOException e) {
			e.printStackTrace();
			throw new ServiceException(e);
		}
	}

}
