package com.training.cellstore.service;

import java.util.List;

import com.training.cellstore.domain.Cellphone;
import com.training.cellstore.domain.CellphoneDAO;

public class CellPhoneServiceImpl implements CellPhoneService {

	private CellphoneDAO dao;
	
	@Override
	public void create(Cellphone cp) {
		System.out.println("Inside create method of Service impl");
		dao.create(cp);
	}
	
	@Override
	public Cellphone getByCellPhoneId(int cellid)
	{
		System.out.println("Inside getByCellPhoneId method of Service impl");
		return dao.findByPrimaryKey(cellid);
	}

	public CellphoneDAO getDao() {
		return dao;
	}

	public void setDao(CellphoneDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<Cellphone> getcellphones() {
		System.out.println("Inside getcellphones method of Service impl");
		return dao.getcellphones();
	}

}
