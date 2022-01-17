package com.darshan.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.darshan.employee.dao.EmployeeRepo;
import com.darshan.employee.model.Employee;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepo repo;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv=new ModelAndView("index");
		return mv;
	}
	
	@GetMapping("/employees")
	public List<Employee> findAllEmployees(){
		return repo.findAll();
	}
	
	@GetMapping("/employees/{e_id}")
	public Optional<Employee> findEmployee(@PathVariable("e_id") int e_id){
		return repo.findById(e_id);
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee e) {
		repo.save(e);
		return e;
	}
	
	@PutMapping("/employees")
	public Employee saveOrUpdateEmployee(@RequestBody Employee e) {
		repo.save(e);
		return e;
	}
	
	@DeleteMapping("employees/{e_id}")
	public List<Employee> deleteEmployee(@PathVariable int e_id) {
		Employee e=repo.getOne(e_id);
		repo.delete(e);
		return repo.findAll();
	}

}
