package com.cybage.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.cybage.model.Employee;
import com.cybage.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeerepository;
	
//	List<Employee> employeeList=new ArrayList<Employee>();
//	
//	public EmployeeService() {
//		employeeList.add(new Employee(1, "renuka", "Software Enginner", 1000000));
//		employeeList.add(new Employee(2, "udit", "Manager", 1500000));
//		employeeList.add(new Employee(3, "radha", "Enginner", 100000));
//		
//		
//	}
//
public List<Employee> getEmployee() {
		return employeerepository.findAll();

		
	}
//
public void addEmployee(Employee employee) {	
	employeerepository.save(employee);
		
	}
//
	public void deleteEmployee(int id) {
//		// TODO Auto-generated method stub
		
		employeerepository.deleteById(id);
		
	}
//
	public Employee getEmployeeId(int id) {
		// TODO Auto-generated method stub/		
		Employee employee1=employeerepository.getById(id);
		return employee1;
	}
//
	public void updateEmployee( Employee employee) {
		employeerepository.save(employee);
		
	}
	
	public List<Employee> getEmployeeByName(String name){
		return employeerepository.findByName(name);
	}
	
	public List<Employee> getEmployeeByDesignation(String designation){
		return employeerepository.findByDesignation(designation);
	}
	public List<Employee>  findBySalaryGreaterThan(int salary)
	{
		return employeerepository.findBySalaryGreaterThan(salary);
	}
	public List<Employee>  findBySalaryLessThan(int salary)
	{
		return employeerepository.findBySalaryLessThan(salary);
	}
//	List<Employee> getEmpByDesignation(String designation){
//		return employeerepository.getEmpByDesignation(designation);
//	}
	
	
	public List<Employee> getEmployeeByDesignation(int i, String string) {
		// TODO Auto-generated method stub
		return employeerepository.getEmpByDesignation(i, string);
	}
	
	

	public List<Employee> getEmployees1() {
		// TODO Auto-generated method stub
		Pageable pageable=PageRequest.ofSize(2);
		//return employeerepository.findAll(pageable).toList();
		//sort
		return employeerepository.findAll(Sort.by(Direction.DESC, "name"));
		
	}
	
	
}
