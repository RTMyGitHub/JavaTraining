package com.training.cellstore.domain;

import java.util.List;

public interface CellphoneDAO {
	
	void create(Cellphone cp);
	
	List<Cellphone> getcellphones();
	
	void Update(Cellphone cp);
	Cellphone findByPrimaryKey(int cellid);
	void delete(int cellid);
	
	

}
