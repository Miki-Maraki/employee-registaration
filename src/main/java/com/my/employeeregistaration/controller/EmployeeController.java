package com.my.employeeregistaration.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.employeeregistaration.model.Employee;
import com.my.employeeregistaration.service.EmployeeService;

@RestController          //means class is web layer ... it uses URL to display result
@RequestMapping("/api")  //use to put common things for all methods
public class EmployeeController {

	@Autowired  // to make communication b/n EmployeeController and EmployeeService
	EmployeeService service;

	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {
		Iterable<Employee> emps = service.getAllEmployee();
		List<Employee> employees = new ArrayList<>();
		for (Employee employee : emps) {
			employees.add(employee);
		}
		return employees;
	}
	
	@PostMapping("/employee")
	public List<Employee> addEmployee(@RequestBody Employee empl){
		service.addEmployee(empl);
		Iterable<Employee> emps = service.getAllEmployee();		
		List<Employee> employees = new ArrayList<>();
		for (Employee employee : emps) {
			employees.add(employee);
		}
		return employees;
	}
	
	@GetMapping("/byid/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable long id){ // perfect
		Optional<Employee> em = service.getEmployeeById(id);	
		return em;
	}
	
	@DeleteMapping("/del/{id}")           // perfect
	public Optional<Employee> deleteEmployeeById(@PathVariable long id){
		Optional<Employee> emply = service.deleteEmployeeById(id);
		return emply;
	}
	
}
