package com.darshan.transaction.service;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.darshan.transaction.dao.TransactionRepo;
import com.darshan.transaction.exception.InvalidDateFormatException;
import com.darshan.transaction.exception.ResourceNotFoundException;
import com.darshan.transaction.model.Currency;
import com.darshan.transaction.model.Transaction;

@Service
public class TransactionService {
	Date fromDate;
	Date toDate;
	@Autowired
    TransactionRepo repo;
	public TransactionService() {
	}
	public long performTransaction(Transaction transaction) {
		try {
		repo.save(transaction);
		return transaction.getTransactionNumber();
		}
		catch(Exception exception) {
			return -1;
		}
	}
	public List<Transaction> getAllTransactions() {
		return repo.findAll();
	}
	public List<Transaction> getTransactions(String fromDate, String toDate) throws InvalidDateFormatException {
		try {
		 this.fromDate=Date.valueOf(fromDate);
		 this.toDate=Date.valueOf(toDate);
		}
		catch(Exception exception) {
			throw new InvalidDateFormatException("Please provide date in YYYY-MM-DD format ");
		}
		return repo.findAllBetween(this.fromDate, this.toDate);
	}
	public Transaction getTransactionsByTransactionNumber(long transactionNumber) throws ResourceNotFoundException {
		return repo.findById(transactionNumber).orElseThrow(() -> new ResourceNotFoundException("No such transaction found"));
	}
	
	public List<String> getCurrency() {
		List<String> list=Stream.of(Currency.values()).map(s->s.name()).collect(Collectors.toList());
		return list;
	}
	public long updateTransaction(@Valid Transaction transaction) {
		try {
			repo.save(transaction);
			return transaction.getTransactionNumber();
			}
			catch(Exception exception) {
				return -1;
			}
	}
	public void deleteTransaction(long transactionNumber) throws ResourceNotFoundException {
		try {
		    Transaction transaction=repo.getOne(transactionNumber);
		    repo.delete(transaction);
		}
		catch(Exception exception) {
			throw new ResourceNotFoundException("No such transaction to delete");
		}	
	}
    
}
