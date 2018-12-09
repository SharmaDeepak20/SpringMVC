package com.employee.infogain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.employee.infogain.bean.Employee;
import com.employee.infogain.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService empSer;

	@RequestMapping(value="/greet",method=RequestMethod.GET)
	public String greet()
	{
		System.out.println("Hello Deepak Sharma Ji!!!");
		return "welcome";
	}
	
	public ModelAndView indexForm()
	{
		return new ModelAndView("index","command",new Employee());
	}//end indexForm
	
	public ModelAndView saveEmployee(@ModelAttribute("employee") Employee emp)
	{
		empSer.saveEmployee(emp);
		return new ModelAndView("welcome");
	}//end saveEmployee
}
