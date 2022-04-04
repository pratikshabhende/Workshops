package com.cybage.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.model.Employee;
import com.cybage.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/getAllEmployee")
	public ModelAndView getAllEmployee() {
		List<Employee> employeeList= employeeService.getEmployee();
		 return new ModelAndView("displayEmployee","empList",employeeList);
		
	}
	
	
	@GetMapping("/addEmployee")
	public String showForm(Model model) {
		
		model.addAttribute("employee", new Employee());
		
		return "addEmployee";
	}
	
	
	@PostMapping("/addEmployee")
	public ModelAndView addEmployee( @ModelAttribute("employee") Employee employee ) {
		
		
		
		employeeService.addEmployee(employee);
		return new ModelAndView("displayEmployee","empList",employeeService.getEmployee());
		
	}
	
	
	@GetMapping("/deleteEmployee/{id}")
	public ModelAndView deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		return new ModelAndView("displayEmployee","empList",employeeService.getEmployee());
	}
	@GetMapping("/edit/{id}")
	public ModelAndView showUpdateEmployee(@PathVariable int id) {
		Employee employee=employeeService.getEmployeeId(id);
		return new ModelAndView("updateEmployee","employee",employee);
	}
	
	@PostMapping("/updateEmployee")
	public ModelAndView updateEmployee(@ModelAttribute("employee") Employee employee) {
		
		
		employeeService.updateEmployee(employee);
		return new ModelAndView("displayEmployee","empList",employeeService.getEmployee());
		
	}
	
	
	@GetMapping("/getEmployeeById")
	public String showFormId() {
		return "employee";
	}
	
	@PostMapping("/getEmployee")
	public ModelAndView getEmployeeById(@RequestParam("empId") int id) {
		
		
		Employee employee=employeeService.getEmployeeId(id);
		return new ModelAndView("EmployeeDetail","employeeInfo",employee);
		
	}
	
	@GetMapping("/test")
	public void TestAllMethod() {
		System.out.println( employeeService.getEmployeeByName("renu"));
		System.out.println( employeeService.getEmployeeByDesignation("quality"));
		System.out.println( employeeService.findBySalaryGreaterThan(2000));
		System.out.println( employeeService.findBySalaryLessThan(3000));
		//System.out.println( employeeService.getEmployeeByDesignation("quality"));
		System.out.println( employeeService.getEmployeeByDesignation(2000,"quality"));
		 employeeService.getEmployees1().forEach(System.out::println);
		
		
		
	}
}
