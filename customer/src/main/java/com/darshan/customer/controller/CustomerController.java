package com.darshan.customer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.darshan.customer.dao.CustomerRepo;
import com.darshan.customer.model.Customer;
@RestController
public class CustomerController {
	@Autowired
	private CustomerRepo repo;
	
	@RequestMapping({"/CustomerManager"})
	public ModelAndView manager(@RequestParam(name="customer", required=false) Customer customer) {
		List<Customer> customers=repo.findAll();
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("result", customers);
		mv.addObject("customer", customer);
		return mv;
	}
	@RequestMapping("/addCustomer")
	public ModelAndView addCustomer(Customer customer)
	{
		try {
		repo.save(customer);
		ModelAndView mv=new ModelAndView("AddCustomer");
		mv.addObject("result", "Customer Added");
		return mv;
		}
		catch(Exception e){
			ModelAndView mv=new ModelAndView("AddCustomer");
			mv.addObject("result", "Email already registered");
			return mv;
		}
	}
	@RequestMapping("/searchCustomer")
	public RedirectView searchCustomer(@RequestParam("id") long id, RedirectAttributes attribute) {
		Customer customer=repo.findById(id).orElse(new Customer());
		attribute.addAttribute("customer", customer);
		return new RedirectView("/CustomerManager");
	}
	@RequestMapping("/deleteCustomer/{id}")
	public RedirectView deleteCustomer(@PathVariable("id") long id) {
		repo.deleteById(id);
		return new RedirectView("/CustomerManager");
	}
	@RequestMapping("/editCustomer")
	public RedirectView editCustomer(Customer customer) {
		try {
		repo.save(customer);
		return new RedirectView("/CustomerManager");
		}
		catch(Exception e) {
			return new RedirectView("/CustomerManager");
		}
		
	}

}
