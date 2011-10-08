package com.venkat.cellstore.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class CellPhoneDAOJDBCImpl implements CellPhoneDAO {

	public List<CellPhone> getCells() {

		List<CellPhone> cells = new ArrayList<CellPhone>();

		CellPhone one = new CellPhone();

		one.setCompany("Apple");
		one.setName("iPhone");
		
		CellPhone two = new CellPhone();

		two.setCompany("Google");
		two.setName("Nexus");
		
		cells.add(one);
		cells.add(two);

		return cells;
	}

}
