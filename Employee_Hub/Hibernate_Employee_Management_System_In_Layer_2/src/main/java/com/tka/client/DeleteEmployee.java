package com.tka.client;

import com.tka.contoller.EmployeeController;

public class DeleteEmployee {

	public static void main(String[] args) {
		EmployeeController employeecontroller = new EmployeeController();
		
		employeecontroller.deleteEmployee(4);

	}

}
