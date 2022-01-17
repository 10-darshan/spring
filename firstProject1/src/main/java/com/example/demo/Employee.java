package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class Employee {
	public Employee() {
		super();
		System.out.println("object created");
	}
	private int eid;
	private String ename;
	private String eaddress;
	@Autowired
	@Qualifier("org")
	private Organisation o;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public void show()
	{
	    System.out.println("Employee class show method");
	    o.details();
	}
	public Organisation getO() {
		return o;
	}
	public void setO(Organisation o) {
		this.o = o;
	}

}
