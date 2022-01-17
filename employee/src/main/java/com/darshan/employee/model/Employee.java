package com.darshan.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", initialValue=100)
	@Column(name="EmpId")
	private long empId;
	@Column(name="EmpName")
	@NotBlank
	@Size(min = 3,max=20)
	private String empName;
	@NotBlank
	@Email
	@Column(name="EmpEmail")
	@Size(min = 3,max = 20)
	private String empEmail;
	@NotBlank
	@Column(name="EmpDesignation")
	private String empDesignation;
	
	public Employee() {
	
	}
	public Employee(long emp_id, String emp_name, String emp_email, String emp_designation) {
		super();
		this.empId = emp_id;
		this.empName = emp_name;
		this.empEmail = emp_email;
		this.empDesignation = emp_designation;
	}
	public long getEmp_id() {
		return empId;
	}
	public void setEmp_id(long emp_id) {
		this.empId = emp_id;
	}
	public String getEmp_name() {
		return empName;
	}
	public void setEmp_name(String emp_name) {
		this.empName = emp_name;
	}
	public String getEmp_email() {
		return empEmail;
	}
	public void setEmp_email(String emp_email) {
		this.empEmail = emp_email;
	}
	public String getEmp_designation() {
		return empDesignation;
	}
	public void setEmp_designation(String emp_designation) {
		this.empDesignation = emp_designation;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + empId + ", emp_name=" + empName + ", emp_email=" + empEmail
				+ ", emp_designation=" + empDesignation + "]";
	}
	
	
}
