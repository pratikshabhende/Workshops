package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.CustomerRepository;
import com.cybage.model.Customer;


@Service
public class CustomerService {

	

	@Autowired
	CustomerRepository customerRepository;
	
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
		
	}
	public List<Customer > getCustomer() {
		// TODO Auto-generated method stub
		
			return customerRepository.findAll();
			
		}
	public Customer  getCustomer(int id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id).orElse(null);
	}
	public List<Customer > findAll() {
		return customerRepository.findAll();
	}
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);
	}
	public void updateCustomer(int id,Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save( customer);
	}
	
	public List<Customer> getCustomerByName(String name){
		return customerRepository.findByName(name);
	}
}
