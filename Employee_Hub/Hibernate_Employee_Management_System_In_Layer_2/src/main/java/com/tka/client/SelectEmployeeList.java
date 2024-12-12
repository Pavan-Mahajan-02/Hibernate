package com.tka.client;

import java.util.List;

import com.tka.contoller.EmployeeController;
import com.tka.entity.Employee;

public class SelectEmployeeList {

	public static void main(String[] args) {

		EmployeeController employeecontroller = new EmployeeController();

		List<Employee> elist = employeecontroller.getEmployeeList();
		for (Employee e : elist) {
			System.out.println("Id:" + e.getId() + "  Name:" + e.getName() + "  Department:" + e.getDepartment()
					+ "  Experience:" + e.getExperience() + "  Salary:" + e.getSalary());
			System.out.println("--------------------------------------------------------------");
		}

	}

}
