package com.aec.training.repositry;
import com.aec.training.entity.Employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	Employee findByEmpId(int empId);
	List<Employee> findByEmpCity(String empCity);
}

