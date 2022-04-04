package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.exception.CustomerNotFoundException;
import com.cybage.model.Customer;
import com.cybage.service.CustomerService;



@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	@RequestMapping("/addCustomer")

	public ResponseEntity<String> addCustomer(@RequestBody Customer customer) {
		
		customerService.addCustomer(customer);
		return new ResponseEntity<>("customer added successfully", HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getAllCustomer")
	public  ResponseEntity<List<Customer>> getAllCustomer() {
		customerService.getCustomer();
	
		 return new ResponseEntity<List<Customer>>(customerService.findAll(), HttpStatus.CREATED);
		
	}
	

	@GetMapping("/getAllCustomer/{id}")
	public  ResponseEntity<Customer> getCustomer(@PathVariable int id) {
		Customer customer=customerService.getCustomer(id);
		if(customer==null) {
			
			throw new CustomerNotFoundException("customer not found");
		}
		
	
		 return new ResponseEntity<Customer>(customer, HttpStatus.FOUND);
		
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public ResponseEntity<String>deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomer(id);
		return new ResponseEntity<String>("customer deleted", HttpStatus.FOUND);
	}
	
	@PutMapping("/updateCustomer/{id}")
	public ResponseEntity<String> updateCustomer(@PathVariable int id,@RequestBody Customer customer)
	{
		customerService.updateCustomer(id,customer);
		return new ResponseEntity<String>("customer UPDATED", HttpStatus.OK);
	}
	
	@GetMapping("/getAllCustomerByName")
	public  ResponseEntity<List<Customer>> getAllCustomerByName() {
		customerService.getCustomerByName("renu");
	
		 return new ResponseEntity<List<Customer>>(customerService.getCustomerByName("renu"), HttpStatus.CREATED);
		
	}
	
	
}
