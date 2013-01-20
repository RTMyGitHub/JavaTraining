package com.training.jpa2.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PublisherServiceImpl implements PublisherService {

	@Autowired
	private PublisherDAO dao;
	
	@Transactional
	public void create(Publisher publisher) {
		dao.create(publisher);
	}

}
