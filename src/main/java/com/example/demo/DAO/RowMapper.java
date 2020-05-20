package com.example.demo.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;

import com.example.demo.employee.Employee;

public class RowMapper implements org.springframework.jdbc.core.RowMapper<Employee> {
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp=new Employee();
		emp.setId(rs.getInt("id"));
		emp.setUsername(rs.getString("Username"));
		emp.setSalary(rs.getString("salary"));
		emp.setDesignation(rs.getString("designation"));
		return emp;
	}

}
