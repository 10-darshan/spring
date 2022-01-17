package com.darshan.bank.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Bank {
	
	@Id
	private String name;
	private String city;
	@ElementCollection
	private List<String> branch=new ArrayList<String>();
	@ElementCollection
	private List<String> service=new ArrayList<String>();

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getBranch() {
		return branch;
	}
	public void setBranch(List<String> branch) {
		this.branch = branch;
	}
	public List<String> getService() {
		return service;
	}
	public void setService(List<String> service) {
		this.service = service;
	}
	


}
