package com.cybage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cybage.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
//<bean object,primary key type>
	
	List<Employee> findByName(String name);
	List<Employee> findByDesignation(String name);
	
	List<Employee>  findBySalaryGreaterThan(int salary);
	List<Employee>  findBySalaryLessThan(int salary);
	
//	@Query("select e from Employee e where e.designation=?1")
//	List<Employee> getEmpByDesignation(String designation);
//	
	

	@Query("select e from Employee e where e.designation=:desg and e.salary=:sal")
	List<Employee> getEmpByDesignation(@Param("sal") int salary,@Param("desg") String designation);
	
	
	@Query("update Employee set name=:prefix || name ")
	@Modifying
	List<Employee> addPrefixToFirstNmae(@Param("prefix") String prefix);
}
