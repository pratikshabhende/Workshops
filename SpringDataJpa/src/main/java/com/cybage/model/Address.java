package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Address {
	
	@Id
	private long pincode;
	private String street;
	private String city;
	private String state;
	//bidirectional example mapped by always refercing the reference entity(adreesss) and employee is owner entity
	//added foreign key constraint to owner entity
	//@OneToOne(mappedBy="address")
//	private Employee employee;
//	
//	public Employee getEmployee() {
//		return employee;
//	}
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address(long pincode, String street, String city, String state) {
		super();
		this.pincode = pincode;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	public Address() {
		super();
	}
	
	
	

}
