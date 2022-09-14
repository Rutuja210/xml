package com.persistent.training.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.persistent.training.dao.EmployeeDAO;
import com.persistent.training.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO dao;

	@Override
	public boolean save(Employee employee) {
		System.out.println("At service.save(): " + employee);

		return dao.createEmployee(employee);
	}

	@Override
	public List<Employee> getEmployees() {
		return dao.getEmployees();
	}
}
