package com.darshan.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.darshan.bank.dao.BankRepo;

@RestController
public class BankController {
	
	@Autowired
	BankRepo repo;
	
	
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv=new ModelAndView("home");
		return mv;
	}
	
	@RequestMapping("/name")
	public String name() {
		return repo.findByBname("State Bank of India").getBname();
		
	}
	
	@RequestMapping("/address")
	public String address() {
		return repo.findByBname("State Bank of India").getBaddress();
		
	}
	

}
