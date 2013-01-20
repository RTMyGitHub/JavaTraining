package com.training.jpa1.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Access(AccessType.FIELD)
@SequenceGenerator(name="generator_book_id_seq", sequenceName="book_id_seq", allocationSize=1)
public class Book implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="generator_book_id_seq")
	@Column(name="book_id")
	private int id;
	private String title;
	private String author;
	private String isbn;
	
	@Column(name="number_of_pages")
	private int pages;
	
	@Column(name="pub_date")
	private Date publisherDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Date getPublisherDate() {
		return publisherDate;
	}

	public void setPublisherDate(Date publisherDate) {
		this.publisherDate = publisherDate;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Title = " + this.title + "\n");
		sb.append("Author = " + this.author + "\n");
		sb.append("Pages = " + this.pages + "\n");
		sb.append("Pub. Date = " + this.publisherDate + "\n");
		
		return sb.toString();
	}
}
