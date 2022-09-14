package com.persistent.training.dao;

import java.util.List;

import com.persistent.training.model.Employee;

public interface EmployeeDAO {
	public boolean createEmployee(Employee emp);
	public List<Employee> getEmployees();

}
