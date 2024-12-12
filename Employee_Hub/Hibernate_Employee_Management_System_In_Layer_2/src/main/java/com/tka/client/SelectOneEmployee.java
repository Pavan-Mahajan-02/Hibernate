package com.tka.client;

import com.tka.contoller.EmployeeController;

public class SelectOneEmployee {
	public static void main(String[] args) {
		
		EmployeeController employeecontroller = new EmployeeController();
		
		employeecontroller.getEmployee(3);
	}
}
