package com.tka.client;

import java.util.List;

import com.tka.contoller.EmployeeController;
import com.tka.entity.Employee;

public class SelectEmployeeByExperience {

	public static void main(String[] args) {
		
		EmployeeController employeecontroller = new EmployeeController();
		
		List<Employee> el = employeecontroller.getEmployeeByExperience();

	}

}
