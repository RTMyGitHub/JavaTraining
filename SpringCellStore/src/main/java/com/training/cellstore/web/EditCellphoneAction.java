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

public class EditCellphoneAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String id = request.getParameter("id");
		
		CellphoneDAO dao= new CellphoneDAOJDBCImpl("jdbc:mysql://localhost/training", "root", "rajashri");
		Cellphone cellPhoneToEdit = dao.findByPrimaryKey(Integer.parseInt(id));
		
		cellphoneform cellphForm = (cellphoneform) form;
		
		cellphForm.setCellCompanyname(cellPhoneToEdit.getCellCompanyname());
		cellphForm.setCellid(cellPhoneToEdit.getCellid());
		cellphForm.setModel(cellPhoneToEdit.getModel());
		cellphForm.setPrice(cellPhoneToEdit.getPrice());
		
		return mapping.findForward("editCellphone");
	}

}
