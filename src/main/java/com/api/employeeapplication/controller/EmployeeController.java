package com.api.employeeapplication.controller;

import java.util.List;
import java.util.Optional;

import io.swagger.v3.oas.annotations.Operation;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.api.employeeapplication.entity.Employee;
import com.api.employeeapplication.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:4200/")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}


	@GetMapping("/")
	@Operation(summary = "Returns a list of employees",
			description = "A method to return list of employees to do something with."
	)
	public List<Employee> getAllEmployees() {

		return employeeService.getAllEmployees();
	}
//
//	@GetMapping("/{id}")
//	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
//		Optional<Employee> emp = employeeService.findById(id);
//		return emp.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
//	}
//
//	@PostMapping
//	public Employee createEmployee(@RequestBody Employee employee) {
//		return employeeService.save(employee);
//	}
//
//	@PutMapping("/{id}")
//	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee newEmployee) {
//		if (!employeeService.existsById(id)) {
//			return ResponseEntity.notFound().build();
//		}
//		newEmployee.setId(id);
//		Employee updatedEmployee = employeeService.save(newEmployee);
//		return ResponseEntity.ok(updatedEmployee);
//	}
//
//	@DeleteMapping("/{id}")
//	public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
//		if(!employeeService.existsById(id)) {
//			return ResponseEntity.notFound().build();
//		}
//
//		employeeService.deleteById(id);
//		return ResponseEntity.noContent().build();
//	}

}
