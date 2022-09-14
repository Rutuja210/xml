package com.persistent.training.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.persistent.training.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean createEmployee(Employee emp) {
		try {
			System.out.println("At dao.save(): " + emp);

			String sql = "INSERT INTO EMPLOYEE VALUES (?, ?, ?)";
			jdbcTemplate.update(sql, emp.getId(), emp.getName(), emp.getCity());
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
			System.out.println("At dao.save() EXCEPTION: " + e.getMessage());
			return false;
		}
	}

	public List<Employee> getEmployees() {
		String sql = "SELECT * FROM EMPLOYEE";
		List<Employee> allEmployees = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Employee>(Employee.class));
		return allEmployees;
	}
	
}
