package com.aec.training.restcontroller;


import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aec.training.entity.Employee;
import com.aec.training.model.EmployeeDTO;
import com.aec.training.service.EmployeeServices;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/")
public class AECRestController {
	@Autowired
	EmployeeServices employeeServices;
	
	@Autowired
	EmployeeDTO employeeDTO;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		List<Employee> listOfEmployee = employeeServices.getAllEmployee();
		return listOfEmployee;
	}
	
	@PostMapping("/storedata")
	public Employee createEmployee(@RequestBody EmployeeDTO employeeDTO) {
		return employeeServices.storeEmployee(employeeDTO);
	}
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteEmployee(@PathVariable int id){
		employeeServices.deleteEmployee(id);
		
		Map<String, Boolean> response = new HashMap<String, Boolean>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	@PutMapping("/update-employee/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Integer id,@RequestBody EmployeeDTO employeeDTO){
		Employee emp = employeeServices.updateEmployee(employeeDTO,id);
		return ResponseEntity.ok(emp);
	}
	
	@GetMapping("/emp-by-empid/{empId}")
	public Employee findEmployeeByEmpId(@PathVariable int empId) {
		Employee emp = employeeServices.findEmployeeByEmpId(empId);
		return emp;
	}
	
	@GetMapping("/emp-by-city/{empCity}")
	public List<Employee> getEmployeeByEmpCity(@PathVariable String empCity) {
		List<Employee> empList = employeeServices.findEmployeeByEmpCity(empCity);
		return empList;
	}
}
