package com.darshan.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darshan.employee.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
