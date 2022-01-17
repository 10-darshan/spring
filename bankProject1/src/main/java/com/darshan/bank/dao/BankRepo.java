package com.darshan.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darshan.bank.Bank;

public interface BankRepo extends JpaRepository<Bank, Integer>{
	
	public Bank findByBname(String bname);
	
}
