package com.darshan.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.darshan.bank.model.Bank;

public interface BankRepo extends JpaRepository<Bank, Integer>{
	@Query("from Bank where name=?1 and city=?2")
	Bank findByNameCity(String name, String city);

}


