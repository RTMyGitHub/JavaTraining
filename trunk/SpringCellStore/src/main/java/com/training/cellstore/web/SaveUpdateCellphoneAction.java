package com.training.cellstore.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.training.cellstore.domain.Cellphone;
import com.training.cellstore.domain.CellphoneDAO;
import com.training.cellstore.domain.CellphoneDAOJDBCImpl;

public class SaveUpdateCellphoneAction extends Action {
	
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		cellphoneform  acellphform = (cellphoneform) form; 
		
		System.out.println("CellId: " +acellphform.getCellid());
		System.out.println("Cell Companyname: " +acellphform.getCellCompanyname());
		System.out.println("Model: " +acellphform.getModel());
		System.out.println("Price: " +acellphform.getPrice());
		
		Cellphone bcph= new Cellphone();
		
		bcph.setCellid(acellphform.getCellid());
		bcph.setCellCompanyname(acellphform.getCellCompanyname());
		bcph.setModel(acellphform.getModel());
		bcph.setPrice(acellphform.getPrice());
		
		CellphoneDAO dao= new CellphoneDAOJDBCImpl("jdbc:mysql://localhost/training", "root", "rajashri");
		dao.Update(bcph);
			
		return mapping.findForward("acknowledgement");
	
	}

}
