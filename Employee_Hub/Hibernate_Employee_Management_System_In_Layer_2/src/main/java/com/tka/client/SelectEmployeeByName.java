package com.tka.client;

import java.util.List;

import com.tka.contoller.EmployeeController;
import com.tka.entity.Employee;

public class SelectEmployeeByName {

	public static void main(String[] args) {
		
		EmployeeController employeecontroller = new EmployeeController();
		
		List<Employee> sn = employeecontroller.getEmployeeByName("Jay");

	}

}
