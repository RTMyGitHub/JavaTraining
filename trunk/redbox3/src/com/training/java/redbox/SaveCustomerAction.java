package com.training.java.redbox;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.training.java.redbox.domain.Customer;
import com.training.java.redbox.domain.CustomerDAO;
import com.training.java.redbox.domain.CustomerDaoJdbcImpl;
import com.training.java.redbox.domain.DAOException;

public class SaveCustomerAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		
		CustomerForm customerForm = (CustomerForm) form;
		
		System.out.println(customerForm);

		CustomerDAO dao = new CustomerDaoJdbcImpl();

		Customer customer = new Customer(0, customerForm.getFirstName(), customerForm.getLastName());
		customer.setAddress(customerForm.getAddress());
		customer.setCity(customerForm.getCity());
		customer.setState(customerForm.getState());
		customer.setZipCode(customerForm.getZipCode());
		customer.setUserName(customerForm.getUserName());
		customer.setPassword(customerForm.getPassword());

		try {
			dao.addCustomer(customer);
		} catch (DAOException e) {
			e.printStackTrace();
		}
		
		return mapping.findForward("login");


	}

}
