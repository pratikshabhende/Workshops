package com.cybage.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cybage.model.Customer;


public interface CustomerRepository extends  JpaRepository<Customer,Integer> {

	List<Customer> findByName(String name);
}
