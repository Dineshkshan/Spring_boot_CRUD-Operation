package com.example.demo.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.employee.Employee;


@Service
public class EmployeeDaoimpl implements EmployeeDao{
	
    @Autowired
	JdbcTemplate jdbctemplate;
	@Override
	public List<Employee> getall() {
		String query="Select * from usertable";
		return jdbctemplate.query(query,new RowMapper());
	}

	@Override
	public Employee getValueid(int id) {
		String query="Select * from usertable where id=?";
		return jdbctemplate.queryForObject(query, new RowMapper(),id);
	}

	@Override
	public int insertEmployee(Employee emp) {
		String query="INSERT INTO usertable (username,salary,designation) VALUES (?,?,?)";
		int count=jdbctemplate.update(query,emp.getUsername(),emp.getSalary(),emp.getDesignation());
		return count;
	}

	@Override
	public int updateEmployee(Employee emp) {
		String query="UPDATE usertable SET designation=? WHERE id=? ";
		int count=jdbctemplate.update(query, emp.getDesignation(),emp.getId());
		return count;
	}

	@Override
	public int deleteEmployee(int id) 
	{
		String query="Delete from usertable where id=?";
		int count=jdbctemplate.update(query,id);
		return count;
	}

}
