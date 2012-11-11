package com.training.java.core.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List books = new LinkedList();
		
		ImmutableBook book1 = new ImmutableBook("Head First Java", "Kathy Sierra", "1234");
		ImmutableBook book2 = new ImmutableBook("Spring in Action", "Craig Walls", "4321");
		ImmutableBook book3 = new ImmutableBook("Java persistance with Hibernate", "Gavin King", "9876");
		ImmutableBook book4 = new ImmutableBook("The pragmatic programmer", "Dave Thomas", "9876");
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		
		//Lets read from the List
		Iterator ite = books.iterator();
		
		while(ite.hasNext())
		{
			ImmutableBook book = (ImmutableBook) ite.next();
			
			System.out.println("Title = " + book.getTitle());
			System.out.println("Author = " + book.getAuthor());
			System.out.println("Isbn = " + book.getIsbn());
		}
		
	}

}
