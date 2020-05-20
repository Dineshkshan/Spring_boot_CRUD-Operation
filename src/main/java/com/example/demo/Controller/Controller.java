package com.example.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.EmployeeDao;
import com.example.demo.employee.Employee;

@RestController
public class Controller 
{
	@Autowired
	EmployeeDao employee;
	
	
	@GetMapping("/getall")
	@ResponseBody
	public List<Employee> getall()
	{
		return employee.getall();
	}
	
	
	@GetMapping("/getbyid/{id}")
	@ResponseBody
	public Employee getvalueid(@PathVariable("id") int id)
	{
//		System.out.println(id);
		return employee.getValueid(id);
	}
	
	@PostMapping("/insertemp")
	public String insertEmployee(@RequestBody Employee emp)
	{
		int count=employee.insertEmployee(emp);
		if (count!=0) {
			return "Employee Inserted Successfully";
		} else {
			return "Error in Inserting the data";
		}
		
	}
	
	@PutMapping("/updateemp")
	public String UpdateEmployee(@RequestBody Employee emp)
	{
		int count=employee.updateEmployee(emp);
		if(count!=0)
		{
			return "Employee Updated Successfully";
		}
		else
		{
			return "Error in the Update table";
		}
	}
	
	@DeleteMapping("/deleteemp/{id}")
	public String deleteemployee(@PathVariable int id)
	{
		int count=employee.deleteEmployee(id);
		if (count!=0) {
			return "Employee deleted Successfully";
		} else {
			return "Error in deleting the table";
		}
	}
}
