package com.cybage.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeInfo")
public class Employee {
	
	@Id
	@GeneratedValue
	private int employeeId;
	
	//@Column(name="emp_name")
	private String name;
	
	private String designation;

	private int salary;
	
	//one employee having one address
	///@OneToOne
	//@JoinColumn(name="pincode")
	//foriegn key in employeee table
	@OneToMany
	@JoinTable(name="emp_addresss",
	joinColumns=@JoinColumn(name="emp_id"),
	inverseJoinColumns=@JoinColumn(name="address_id"))
	private List<Address> address;
	
	
//	public Address getAddress() {
//		return address;
//	}
//
//
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}



	public List<Address> getAddress() {
		return address;
	}



	public void setAddress(List<Address> address) {
		this.address = address;
	}



	public Employee() {
		super();
	}



	public Employee(int employeeId, String name, String designation, int salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}



	public int getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", designation=" + designation + ", salary="
				+ salary + "]";
	}
	
	
	
	

}
