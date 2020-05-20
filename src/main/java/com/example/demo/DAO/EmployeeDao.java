package com.example.demo.DAO;

import java.util.List;

import com.example.demo.employee.Employee;

public interface EmployeeDao 
{
	public List<Employee> getall();
	public Employee getValueid(int id);
	public int insertEmployee(Employee emp);
	public int updateEmployee(Employee emp);
	public int deleteEmployee(int id);
}
