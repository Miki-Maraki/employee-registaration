package com.my.employeeregistaration.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.employeeregistaration.model.Employee;
import com.my.employeeregistaration.repository.EmployeeRepository;
import com.my.employeeregistaration.service.EmployeeService;

@Service        //means class is business layer
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Iterable<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	@Override
	public Optional<Employee> getEmployeeById(long id) {
		return employeeRepository.findById(id);
	}
	
	@Override
	public Optional<Employee> deleteEmployeeById(long id){
		employeeRepository.deleteById(id);
		Optional<Employee> emp = Optional.empty();
		return emp;
	}

}
