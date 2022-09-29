package com.restful.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.api.model.Employee;
import com.restful.api.model.Employee2;
import com.restful.api.repository.EmployeeRepository;
import com.restful.api.service.EmployeeService;

//@Transactional  - not needed as spring auto provide
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	// will auto configure service - if it has only one constructor
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee(1, employee.getFirstName(), employee.getLastName(), employee.getEmail());
		return employeeRepository.save(employee1);
	}
}
