package com.training.jpa1;

public interface PublisherDAO {
	
	void create(Publisher publisher);
	Publisher findByName(String name);

}
