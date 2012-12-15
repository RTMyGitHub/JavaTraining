package com.training.java.struts.domain;

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
	
	public void init()
	{
		
	}
	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getPages() {
		return pages;
	}

	public Date getPublisherDate() {
		return publisherDate;
	}

}
