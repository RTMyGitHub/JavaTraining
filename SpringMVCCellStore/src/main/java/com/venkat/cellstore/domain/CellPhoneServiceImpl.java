package com.venkat.cellstore.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CellPhoneServiceImpl implements CellPhoneService {

	@Autowired
	private CellPhoneDAO dao;

	public List<CellPhone> getCells() {
		return dao.getCells();
	}

}
