package com.training.jpa2.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
	
	private static EntityManagerFactory emf = null;
	
	static
	{
		emf = Persistence.createEntityManagerFactory("bookStore");
	}
	
	public static EntityManagerFactory getEMF()
	{
		return emf;
	}

}
