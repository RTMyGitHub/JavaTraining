package com.training.jpa2.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO dao;
	
	@Transactional
	public Book findByPrimaryKey(int id) {
		return dao.findByPrimaryKey(id);
	}

}
