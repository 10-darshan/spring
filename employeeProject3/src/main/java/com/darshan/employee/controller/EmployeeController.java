package com.darshan.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee(Employee e) {
		repo.save(e);
		ModelAndView mv=new ModelAndView("index");
		return mv;
		
	}
	
	@RequestMapping("/displayAll")
	public List<Employee> displayAll(){
		return repo.findAll();
	}
	
	@RequestMapping("/display/{e_id}")
	public Optional<Employee>  display(@PathVariable int e_id) {
		return repo.findById(e_id);
		
	}

}
