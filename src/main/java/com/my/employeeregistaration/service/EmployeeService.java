package com.my.employeeregistaration.service;

import java.util.Optional;

import com.my.employeeregistaration.model.Employee;


// we make our class interface bc it help us to hide the method

public interface EmployeeService {
	
	public Iterable<Employee> getAllEmployee();
	
	public void addEmployee(Employee employee);
	
	public Optional<Employee> deleteEmployeeById(long id);
	
	public Optional<Employee> getEmployeeById(long id);
	
	/*
	@Override      // EmployeeServiceImpl class
	public Optional<Employee> getEmployeeById(long id) {
		return employeeRepository.findById(id);
	}
	
	@GetMapping("/byid/{id}")   // EmployeeController class
	public Optional<Employee> getEmployeeById(@PathVariable long id){ // perfect
		Optional<Employee> em = service.getEmployeeById(id);	
		return em;
	}
	 */
	
}
