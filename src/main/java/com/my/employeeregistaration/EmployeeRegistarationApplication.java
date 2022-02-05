package com.my.employeeregistaration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeRegistarationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRegistarationApplication.class, args);
	}
	
	// calling/invoking class steps for this application is 
	//first call ... EmployeeController----->>EmployeeService----->>EmployeeServiceImpl----->>EmployeeRepository-----
	// --->> CrudRepository--->>Query---->>DataBase
     
	// application.properties
	// server.port = 8989
	// spring.h2.console.enabled = true
	
	//Then, after starting the application, we can navigate to http://localhost:8080/h2-console, 
	//which will present us with a login page.
	
	//After run the JDBC, then paste to jdbc url address
	//JDBC URL: jdbc:h2:mem:greeter-quickstart;DB_CLOSE_ON_EXIT=FALSE;DB_CLOSE_DELAY=-1.
	//e.g., Database available at 'jdbc:h2:mem:028cd2ca-60e6-4d0b-8e23-7c562bdc951a
}



