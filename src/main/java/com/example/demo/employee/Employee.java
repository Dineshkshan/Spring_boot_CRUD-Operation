package com.example.demo.employee;

public class Employee 
{
	private int id;
	private String username;
	private String salary;
	private String designation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee(String username, String salary, String designation) {
		super();
		this.username = username;
		this.salary = salary;
		this.designation = designation;
	}
	public Employee() {
	}

	
}
