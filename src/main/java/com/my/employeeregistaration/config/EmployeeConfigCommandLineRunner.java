package com.my.employeeregistaration.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.my.employeeregistaration.model.Employee;
import com.my.employeeregistaration.service.EmployeeService;

@Component
public class EmployeeConfigCommandLineRunner implements CommandLineRunner {

	@Autowired
	EmployeeService employeeService;

	@Override
	public void run(String... args) throws Exception {// it will be excuted after class loading happend/before any other
														// excution
		employeeService.addEmployee(new Employee(100, "Mike", 4000, 30));
		employeeService.addEmployee(new Employee(101, "Bob", 3000, 31));
		employeeService.addEmployee(new Employee(102, "Tina", 5000, 38));
		employeeService.addEmployee(new Employee(103, "Jhon", 6000, 39));
		employeeService.addEmployee(new Employee(104, "Deris", 3000, 40));

	}

}



