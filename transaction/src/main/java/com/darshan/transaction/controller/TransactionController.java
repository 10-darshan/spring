package com.darshan.transaction.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.darshan.transaction.exception.InvalidDateFormatException;
import com.darshan.transaction.exception.ResourceNotFoundException;
import com.darshan.transaction.model.Transaction;
import com.darshan.transaction.service.TransactionService;

@RestController
@CrossOrigin(origins = "*")
public class TransactionController {
    @Autowired
    TransactionService service;
    
	public TransactionController() {
	}
	
	@PostMapping("/transaction")
    public long performTransaction(@Valid @RequestBody Transaction transaction) {
    	return service.performTransaction(transaction);
    }
	
	@PutMapping("/transaction")
	public long updateTransaction(@Valid @RequestBody Transaction transaction) {
		return service.updateTransaction(transaction);
	}
	
	@GetMapping("/transaction")
	public List<Transaction> getAllTransactions() {
		return service.getAllTransactions();
	}
	
	@GetMapping("/transaction/{transactionNumber}")
	public Transaction getTransactionsByTransactionNumber(@PathVariable("transactionNumber") long transactionNumber) throws ResourceNotFoundException {
		return service.getTransactionsByTransactionNumber(transactionNumber);
	}
	
	@DeleteMapping("transaction/{transactionNumber}") 
	public void deleteTransaction(@PathVariable("transactionNumber") long transactionNumber) throws ResourceNotFoundException {
		service.deleteTransaction(transactionNumber);
	}
	
	@GetMapping("/transaction/{fromDate}/{toDate}")
	public List<Transaction> getTransactions(@PathVariable("fromDate") String fromDate, @PathVariable("toDate") String toDate) throws InvalidDateFormatException {
		return service.getTransactions(fromDate, toDate);
	}
	
	@GetMapping("/transaction/currency")
	public List<String> getCurrency() {
		//service.getCurrency().stream().forEach(System.out::println);
		return service.getCurrency();
	}
}
