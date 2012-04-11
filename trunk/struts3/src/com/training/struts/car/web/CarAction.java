package com.training.struts.car.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.training.struts.car.domain.Car;
import com.training.struts.car.domain.CarService;
import com.training.struts.car.domain.CarServiceImpl;

public class CarAction extends DispatchAction
{
	public ActionForward list(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		CarService service = new CarServiceImpl();
		List<Car> cars = service.getAllCars();
		
		request.setAttribute("cars", cars);
		
		return mapping.findForward("list");
	}
	
	public ActionForward add(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		return mapping.findForward("add");
	}
	
	public ActionForward save(ActionMapping mapping, ActionForm form,
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
