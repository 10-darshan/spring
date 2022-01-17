package com.darshan.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

import com.sun.istack.NotNull;

@Entity
@DynamicUpdate
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@NotNull
    private String name;
    @Column(unique = true)
    @NotNull
    private String email;
    @NotNull
    private String address;
    
	public Customer() {
		super();
	}
	public Customer(long id, String name, String email, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}
    
	
}
