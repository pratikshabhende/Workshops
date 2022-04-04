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
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", street=" + street + ", city=" + city + ", state=" + state + "]";
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
