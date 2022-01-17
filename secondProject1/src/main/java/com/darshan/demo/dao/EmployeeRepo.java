package com.darshan.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.darshan.demo.model.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	List<Employee> findByEname(String ename);
	
	List<Employee> findByEidGreaterThan(int eid);
	
	@Query("from Employee where ename=?1 order by eid")
	List <Employee> findByEnameSorted(String ename);

}
