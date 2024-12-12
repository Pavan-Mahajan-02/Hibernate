package com.tka.client;

import com.tka.contoller.EmployeeController;
import com.tka.entity.Employee;

public class InsertEmployee {
	public static void main(String[] args) {
		
		EmployeeController employeecontroller = new EmployeeController();
		Employee emp = new Employee("Raj", "HR", 5, 50000);
		employeecontroller.insertEmployee(emp);
	}
}
