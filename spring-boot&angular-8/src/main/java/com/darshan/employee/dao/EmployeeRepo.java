package com.darshan.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.darshan.employee.model.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
