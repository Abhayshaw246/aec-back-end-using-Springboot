package com.aec.training.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aec.training.entity.Employee;
import com.aec.training.model.EmployeeDTO;
import com.aec.training.repositry.EmployeeRepository;

@Service
public class EmployeeServices {
	
	@Autowired
	EmployeeRepository employeeRepository;

	/*public Employee storeEmployee(Employee emp) {
		//EmployeeRepository employeeRepository ;
		return employeeRepository.save(emp);
	}*/
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}
	//void
	public Employee storeEmployee(EmployeeDTO emp) {
		Employee employees = new Employee();
		employees.setEmpId(emp.getEmpId());
		employees.setEmpName(emp.getEmpName());
		employees.setEmpCity(emp.getEmpCity());
		employees.setEmpAddress(emp.getEmpAddress());
		
		return employeeRepository.save(employees);
		//dont return if u do "GET" method is used//
	}
	
	public void deleteEmployee(int id) {
		Employee employee = employeeRepository.findById(id).get();
		employeeRepository.delete(employee);
	}
	
	public Employee updateEmployee(EmployeeDTO emp,Integer id) {
		Employee employee = employeeRepository.findById(id).get();
		System.out.println(" Employee "+ employee);
		employee.setEmpId(emp.getEmpId());
		employee.setEmpName(emp.getEmpName());
		employee.setEmpCity(emp.getEmpCity());
		employee.setEmpAddress(emp.getEmpAddress());
		Employee updatedEmployee = employeeRepository.save(employee);
		System.out.println(" End of the method updateEmployee()");
		return updatedEmployee;
	}
	
	public Employee findEmployeeByEmpId(int empId) {
		return employeeRepository.findByEmpId(empId);
	}
	
	public List<Employee> findEmployeeByEmpCity(String empCity) {
		return employeeRepository.findByEmpCity(empCity);
	}
}
