package com.tka.client;

import com.tka.contoller.EmployeeController;
import com.tka.entity.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
		
		EmployeeController employeecontroller = new EmployeeController();
		Employee emp = new Employee(3,"Jay", "Test", 8, 55000);
		employeecontroller.updateEmployee(emp);


	}

}
