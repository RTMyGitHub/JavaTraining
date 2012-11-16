package com.training.java.jdbc.dao.two;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {
	private int id;
	private String title;
	private String author;
	private String isbn;
	private int pages;
	private Date publisherDate;

	public Book(int id, String title, String author, String isbn, int pages,
			Date publisherDate) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.pages = pages;
		this.publisherDate = publisherDate;
	}

	int getId() {
		return id;
	}

	String getTitle() {
		return title;
	}

	String getAuthor() {
		return author;
	}

	String getIsbn() {
		return isbn;
	}

	int getPages() {
		return pages;
	}

	Date getPublisherDate() {
		return publisherDate;
	}

	void setAuthor(String author) {
		this.author = author;
	}

	void setPages(int pages) {
		this.pages = pages;
	}

}
