package com.darshan.bank;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	private String bname;
	private String baddress;
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBaddress() {
		return baddress;
	}
	public void setBaddress(String baddress) {
		this.baddress = baddress;
	}
	@Override
	public String toString() {
		return "Bank [bname=" + bname + ", baddress=" + baddress + "]";
	}
	

}
