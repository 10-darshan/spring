package com.darshan.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.darshan.bank.dao.BankRepo;
import com.darshan.bank.model.Bank;



@RestController
public class BankController {
	@Autowired
	BankRepo repo;
	@RequestMapping("/")
	public ModelAndView home() {
		Bank b=repo.findByNameCity("State Bank of India","Bengaluru");
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("bank",b);
		return mv;
	}
	
	@RequestMapping("/services")
	public ModelAndView services() {
		Bank b=repo.findByNameCity("State Bank of India","Bengaluru");
		ModelAndView mv=new ModelAndView("services");
		mv.addObject("bank",b);
		return mv;
	}
	
}

