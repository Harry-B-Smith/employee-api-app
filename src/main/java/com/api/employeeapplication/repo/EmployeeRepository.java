package com.api.employeeapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.employeeapplication.entity.Employee;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("http://localhost:4200")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
