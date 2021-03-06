package com.training.java.core.collections.pre15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Book headFirstJava = new Book();
		headFirstJava.setAuthor("Cathy Sierra");
		headFirstJava.setTitle("Head First Java");
		headFirstJava.setIsbn("12345");
		
		Book springInAction = new Book();
		springInAction.setAuthor("Cariag Walls");
		springInAction.setTitle("Spring in Action");
		springInAction.setIsbn("54321");
		
		Book hibernateInAction = new Book();
		hibernateInAction.setAuthor("Gavin King");
		hibernateInAction.setTitle("Hibernate in Action");
		hibernateInAction.setIsbn("99999");
		
		Book jqueryInActon = new Book();
		jqueryInActon.setAuthor("Venkat Hari");
		jqueryInActon.setTitle("jQuery in Action");
		jqueryInActon.setIsbn("98765");
		
		List books = new ArrayList();
		
		books.add(headFirstJava);
		books.add(springInAction);
		books.add(hibernateInAction);
		books.add(jqueryInActon);
		
		//Read from List
		Iterator booksIterator = books.iterator();
		while(booksIterator.hasNext())
		{
			Book aBook = (Book) booksIterator.next();
			
			System.out.println("Start printing book details *******");
			System.out.println("Author = " + aBook.getAuthor());
			System.out.println("Title = " + aBook.getTitle());
			System.out.println("ISBN = " + aBook.getIsbn());
			System.out.println("End printing book details *******");
		}
		
		
	}

}
