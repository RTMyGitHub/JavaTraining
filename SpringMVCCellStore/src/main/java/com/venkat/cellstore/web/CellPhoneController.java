package com.venkat.cellstore.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.venkat.cellstore.domain.CellPhone;
import com.venkat.cellstore.domain.CellPhoneService;

@Controller
public class CellPhoneController {
	
	@Autowired
	CellPhoneService service;
	
	@RequestMapping("/list")
	public ModelAndView getCells()
	{
		ModelAndView mv = new ModelAndView();
		
		List<CellPhone> cells = service.getCells();
		
		mv.addObject("cells", cells);
		mv.setViewName("ListCellPhone");
		
		return mv;
	}
	
	@RequestMapping("/add")
	public String add(Model model)
	{
		model.addAttribute(new CellPhone());
		
		return "Add";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String save(@ModelAttribute CellPhone cellPhone)
	{
		System.out.println("name= " + cellPhone.getName());
		System.out.println("company= " + cellPhone.getCompany());
		
		return "Acknowledgement";
	}
	

}
