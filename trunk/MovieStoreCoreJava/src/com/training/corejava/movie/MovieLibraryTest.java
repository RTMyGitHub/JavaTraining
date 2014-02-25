package com.training.corejava.movie;

import static org.junit.Assert.assertTrue;
import junit.framework.Assert;

import org.junit.Test;

public class MovieLibraryTest {
	
	@Test
	public void testInStock() throws Exception {
		
		
		MovieLibrary library = new MovieLibrary();
		
		assertTrue(library.inStock("LEGo"));
		
	}
	
	@Test
	public void testDeleteMovie()
	{
		MovieLibrary library = new MovieLibrary();
		
		library.deleteMovie("Lego", MovieType.DVD);
		library.deleteMovie("Lego", MovieType.Blueray);
		library.deleteMovie("Lego", MovieType.Blueray);
		
		Assert.assertFalse(library.inStock("LEGo"));
	}
}
