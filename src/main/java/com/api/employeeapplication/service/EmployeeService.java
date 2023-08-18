package com.api.employeeapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.employeeapplication.entity.Employee;
import com.api.employeeapplication.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
	EmployeeRepository employeeRepo;

	@Autowired
	public EmployeeService(EmployeeRepository employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}

	public List<Employee> getAllEmployees() {
		
		return employeeRepo.findAll();
	}
	


}
