package com.tka.client;

import com.tka.contoller.EmployeeController;

public class SelectEmployeeByDepartment {
	public static void main(String[] args) {
		
		EmployeeController employeecontroller = new EmployeeController();
		
		employeecontroller.getEmployeeByDepartment("HR");
	}

}
