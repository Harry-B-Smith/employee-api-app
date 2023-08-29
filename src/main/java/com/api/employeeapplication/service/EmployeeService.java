package com.api.employeeapplication.service;

import java.util.List;
import java.util.Optional;

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


    public Optional<Employee> findById(Long id) {
		return employeeRepo.findById(id);
    }

	public Employee save(Employee employee) {
		return employeeRepo.save(employee);
	}

	public boolean existsById(Long id) {
		return employeeRepo.existsById(id) ? true : false;
	}
}
