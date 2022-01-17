package com.darshan.transaction.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.darshan.transaction.model.Transaction;
@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Long> {
    @Query(value="select * from TRANSACTION where transaction_Date between ?1 and ?2",nativeQuery = true )//where transaction_Date between ?1 and ?2"
	List<Transaction> findAllBetween(Date fromDate, Date toDate);

}
