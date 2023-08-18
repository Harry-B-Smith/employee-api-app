package com.api.employeeapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.employeeapplication.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
