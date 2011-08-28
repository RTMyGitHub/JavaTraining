package com.training.java.core.collections.set;

public class Book implements Comparable<Book> {
	private String author;
	private String publisher;
	private String title;
	private int numberOfPages;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Override
	public int compareTo(Book that) {
		
		int returnValue = this.author.compareTo(that.author);
		if(returnValue == 0)
		{
			returnValue = this.title.compareTo(that.title);
		}
		
		return returnValue;
	}
}
