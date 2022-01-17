package com.darshan.transaction.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;




@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long transactionNumber;
	@NotNull
	@Min(value=1000000000,message="Account Number must have greater than 9 digits")
	private long toAccountNumber;
	@NotNull
	@Min(value=100,message ="Amount cannot be less than 100")
	private long transactionAmount;
	@NotNull
	@Enumerated(EnumType.ORDINAL)
	private Currency transactionCurrency;
	@NotNull
	private Date transactionDate;

	public Transaction() {
	}

	public Transaction(long transactionNumber, long toAccountNumber, long transactionAmount, Currency transactionCurrency,
			Date transactionDate) {
		super();
		this.transactionNumber = transactionNumber;
		this.toAccountNumber = toAccountNumber;
		this.transactionAmount = transactionAmount;
		this.transactionCurrency = transactionCurrency;
		this.transactionDate = transactionDate;
	}

	public long getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(long transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public long getToAccountNumber() {
		return toAccountNumber;
	}

	public void setToAccountNumber(long toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}

	public long getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(long transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Currency getTransactionCurrency() {
		return transactionCurrency;
	}

	public void setTransactionCurrency(Currency transactionCurrency) {
		this.transactionCurrency = transactionCurrency;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	@Override
	public String toString() {
		return "Transaction [transactionNumber=" + transactionNumber + ", toAccountNumber=" + toAccountNumber
				+ ", transactionAmount=" + transactionAmount + ", transactionCurrency=" + transactionCurrency
				+ ", transactionDate=" + transactionDate + "]";
	}

}
