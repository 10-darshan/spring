package com.darshan.demo.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MapKey;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	private int eid;
	private String ename;
    private String eaddress;
    
    @ElementCollection
    @OneToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "eid")
    //@MapKey(name = "eid")
    
    
    //@CollectionTable(name="media_meta_data")
    //@MapKeyColumn(name="eid")
    //@Column(name="meta_value")
    private Map<Integer,Employee> m=new HashMap<>();
    
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
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + "]";
	}
	
	

}
