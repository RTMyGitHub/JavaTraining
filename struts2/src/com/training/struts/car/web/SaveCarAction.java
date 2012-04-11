package com.training.struts.car.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.training.struts.car.domain.Car;
import com.training.struts.car.domain.CarService;
import com.training.struts.car.domain.CarServiceImpl;

public class SaveCarAction extends Action
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		CarForm carForm = (CarForm) form;
		
		CarService service = new CarServiceImpl();
		Car car = new Car(carForm.getType(), carForm.getMake(), carForm.getModel(), carForm.getYear(), carForm.getPrice());
		
		service.create(car);
		
		return mapping.findForward("acknowledgement");
		
	}
}
