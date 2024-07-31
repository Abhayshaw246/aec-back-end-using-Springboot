package com.aec.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aec.training.entity.Employee;
import com.aec.training.model.EmployeeDTO;
import com.aec.training.service.EmployeeServices;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AecController {
	
	@Autowired(required=true)
	EmployeeServices employeeServices;
	
	@Autowired
	EmployeeDTO employeeDTO;
	/*@Autowired(required=true)
	Employee employee;
	*/
	
	@RequestMapping("/")
	public String getController() {
		System.out.println("Welcome to Spring Boot MVC");
		return "employee-insert.jsp";
	}
	
	@RequestMapping(value = "/insert-emp-data", method = RequestMethod.POST)
	public String insertEmployeeData(HttpServletRequest request) {
		String empId = request.getParameter("EmpID");
		System.out.println(" Emp Id : " + empId);
		String empName = request.getParameter("EmpName");
		System.out.println(" Emp Name : " + empName);
		String empCity = request.getParameter("EmpCity");
		System.out.println(" Emp City : " + empCity);
		String empAddress = request.getParameter("EmpAddress");
		System.out.println(" Emp Address : " + empAddress);

		/*Employee employee = new Employee();
		employee.setEmpId(Integer.parseInt(empId));
		employee.setEmpName(empName);
		employee.setEmpCity(empCity);
		employee.setEmpAddress(empAddress);*/

		
		employeeDTO.setEmpId(Integer.parseInt(empId));
		employeeDTO.setEmpName(empName);
		employeeDTO.setEmpCity(empCity);
		employeeDTO.setEmpAddress(empAddress);
		employeeServices.storeEmployee(employeeDTO);

		
		List<Employee> listOfEmployee = employeeServices.getAllEmployee();
		request.setAttribute("employeeList", listOfEmployee);
		return "view-all-employee.jsp";
	}
}
