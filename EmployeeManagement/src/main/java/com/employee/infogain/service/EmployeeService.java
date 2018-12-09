package com.employee.infogain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.infogain.bean.Employee;
import com.employee.infogain.repository.EmployeeRepository;

@Service("empSer")
public class EmployeeService {

	
	@Autowired
	EmployeeRepository empRes;
	
	public List<Employee> findAll()
	{
		return (List<Employee>)empRes.findAll();
	}//end findAll
	
	public void saveEmployee(Employee emp)
	{
		empRes.save(emp);
	}//end saveEmployee
	
}//end EmployeeService
