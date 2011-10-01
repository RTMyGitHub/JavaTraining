package com.training.cellstore.service;

import java.util.List;

import com.training.cellstore.domain.Cellphone;

public interface CellPhoneService {
	
	void create(Cellphone cp);
	Cellphone getByCellPhoneId(int cellid);
	List<Cellphone> getcellphones();

}
