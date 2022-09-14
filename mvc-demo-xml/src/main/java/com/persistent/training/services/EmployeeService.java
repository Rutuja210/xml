package com.persistent.training.services;

import java.util.List;

import com.persistent.training.model.Employee;

public interface EmployeeService {
	public boolean save(Employee employee);
	public List<Employee> getEmployees();
}
