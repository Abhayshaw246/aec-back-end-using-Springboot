package com.aec.training.model;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDTO {

	private int EmpId;
	private String EmpName;
	private String EmpCity;
	private String EmpAddress;
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpCity() {
		return EmpCity;
	}
	public void setEmpCity(String empCity) {
		EmpCity = empCity;
	}
	public String getEmpAddress() {
		return EmpAddress;
	}
	public void setEmpAddress(String empAddress) {
		EmpAddress = empAddress;
	}

}
