package com.darshan.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.darshan.customer.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long>{

}
