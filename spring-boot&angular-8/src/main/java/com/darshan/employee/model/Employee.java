package com.darshan.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int e_id;
	@Column(nullable=false)
	private String e_name;
	@Column(nullable=false,unique=true)
	private String e_email;
	@Column(nullable=false)
	private String e_location;
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getE_email() {
		return e_email;
	}
	public void setE_email(String e_email) {
		this.e_email = e_email;
	}
	public String getE_location() {
		return e_location;
	}
	public void setE_location(String e_location) {
		this.e_location = e_location;
	}
	
	
	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", e_email=" + e_email + ", e_location=" + e_location
				+ "]";
	}
	

}
