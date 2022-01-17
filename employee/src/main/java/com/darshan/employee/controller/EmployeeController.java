package com.darshan.employee.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darshan.employee.exception.ResourceNotFoundException;
import com.darshan.employee.model.Employee;
import com.darshan.employee.service.EmployeeService;

@RestController
@RequestMapping("/vi")
public class EmployeeController {
	@Autowired
    private EmployeeService employeeService;
	public EmployeeController() {}
	
	@PostMapping("/employee")
	public Employee addEmployee(@Valid @RequestBody Employee employee) throws MethodArgumentNotValidException {
		return employeeService.addEmployee(employee);
	}
	
	@PutMapping("/employee")
	public Employee editEmployee(@Valid @RequestBody Employee employee) {
		return employeeService.editEmployee(employee);
	}
	
	@GetMapping("/employee")
    public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/employee/{empid}")
    public Employee getEmployee(@PathVariable("empid") long empId) throws ResourceNotFoundException {
		return employeeService.getEmployee(empId);
	}
	
	@DeleteMapping("/employee/{empId}")
	public void deleteEmployee(@PathVariable("empId") long empId) throws ResourceNotFoundException {
	    employeeService.deleteEmployee(empId);
	}

}
