package com.training.jpa2.domain;

public interface PublisherDAO {
	
	void create(Publisher publisher);
	Publisher findByName(String name);

}
