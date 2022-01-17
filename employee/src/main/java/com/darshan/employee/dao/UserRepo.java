package com.darshan.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.darshan.employee.model.User;
@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}
