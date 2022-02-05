

package com.my.employeeregistaration.repository;

import org.springframework.data.repository.CrudRepository;

import com.my.employeeregistaration.model.Employee;

// CrudRepository interface is come from JPA
// we extend, bc we want to use all methods from CrudRepository

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    }






