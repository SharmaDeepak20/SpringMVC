package com.employee.infogain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.infogain.bean.Employee;

@Repository("empRes")
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
