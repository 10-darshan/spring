package com.darshan.employee.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;

import com.darshan.employee.dao.EmployeeRepo;
import com.darshan.employee.dao.UserRepo;
import com.darshan.employee.exception.ResourceNotFoundException;
import com.darshan.employee.model.Employee;
@Service
public class EmployeeService {
	@Autowired
    private EmployeeRepo employeeRepo;
	@Autowired
	private UserRepo userRepo;
	public EmployeeService() {}
	
	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll();
	}

	public Employee getEmployee(long empId) throws ResourceNotFoundException {
		return employeeRepo.findById(empId).orElseThrow(()->new ResourceNotFoundException("No such employee found"));
	}

	public Employee addEmployee(Employee employee) throws MethodArgumentNotValidException{
		try
		{
			return employeeRepo.save(employee);
		}
		catch(Exception exception) {
			return new Employee();
		}
	}

	public Employee editEmployee(Employee employee) {
		try
		{
			return employeeRepo.save(employee);
		}
		catch(Exception exception) {
			return new Employee();
		}
	}

	public void deleteEmployee(long empId) throws ResourceNotFoundException {
		try
		{
			Employee employee=employeeRepo.getOne(empId);
			employeeRepo.delete(employee);
		}
		catch(Exception exception) {
			throw new ResourceNotFoundException("No such employee to delete");
		}
	}

}
