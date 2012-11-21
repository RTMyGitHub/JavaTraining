package com.training.java.jdbc.teamdao.television;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class TelevisionDaoTest {
	@Test
	public void testgetTelevision() throws DAOException{
		TelevisionDAO dao=new TelevisionDAOImpl("jdbc:oracle:thin:@localhost:1521:XE", "television", "password");
		List<Television>  televisions=dao.getAllTelevision();
		Assert.assertNotNull(televisions);
		
	}

}
