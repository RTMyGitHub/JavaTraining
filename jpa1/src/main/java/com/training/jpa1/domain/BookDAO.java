package com.training.jpa1.domain;

public interface BookDAO {
	
	void create(Book book);
	Book findByPrimaryKey(int id);
	void update(Book book);
	void delete(int id);

}
