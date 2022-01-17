package com.darshan.demo.Controller;


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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.darshan.demo.dao.EmployeeRepo;
import com.darshan.demo.model.Employee;
@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepo repo;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv=new ModelAndView("index1.jsp");
		return mv;
	}
	
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee(Employee e) {
		repo.save(e);
		ModelAndView mv=new ModelAndView("index1.jsp");
		return mv;
	}
	
	@RequestMapping("/getEmployeeById")
	 public ModelAndView getEmployeeById(@RequestParam int eid) {
		ModelAndView mv=new ModelAndView("showEmployee.jsp");
		Employee e=repo.findById(eid).orElse(new Employee());
		mv.addObject("e",e);
		return mv;
	}
	@RequestMapping("/getEmployeeByName")
	public ModelAndView getEmployeeByName(@RequestParam String ename) {
		ModelAndView mv=new ModelAndView("showEmployee.jsp");
		List<Employee> e=repo.findByEname(ename);
		System.out.println(repo.findByEidGreaterThan(102));
		System.out.println(repo.findByEnameSorted("bcd"));
		mv.addObject("e",e);

		return mv;
	}
	
	@PostMapping("/employees")              //,consumes= {"application/xml"}
	public Employee addEmployee1(@RequestBody Employee e) {
		repo.save(e);
		return e;
	}
	
	@GetMapping(path="/employees")          //,produces= {"application/xml"}
	public List<Employee> getEmployees() {
		return repo.findAll();
	}
	
	@RequestMapping("/employees/{eid}")
	public Optional<Employee> getEmployeeById1(@PathVariable("eid") int eid) {
		return repo.findById(eid);
	}
	
	@DeleteMapping("/employees/{eid}")
	public String deleteEmployee(@PathVariable int eid) {
		Employee e=repo.getOne(eid);
		repo.delete(e);
		return "deleted";
	}
	
	@PutMapping("/employees")
	public Employee saveOrUpdateEmployee(@RequestBody Employee e) {
		repo.save(e);
		return e;
	}

}
