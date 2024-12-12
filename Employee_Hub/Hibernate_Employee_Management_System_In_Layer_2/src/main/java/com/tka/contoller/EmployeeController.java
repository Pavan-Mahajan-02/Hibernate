package com.tka.contoller;

import java.util.List;

import com.tka.entity.Employee;
import com.tka.service.EmployeeService;

public class EmployeeController {

	EmployeeService employeeservice = null;

	public void insertEmployee(Employee emp) {
		System.out.println("We Are In EmployeeController.insertEmployee");
		employeeservice = new EmployeeService();
		employeeservice.insertEmployee(emp);
	}

	public List<Employee> insertEmployeeList() {
		System.out.println("We Are In EmployeeController.insertEmployeeList");
		employeeservice = new EmployeeService();
		List<Employee> elist = employeeservice.insertEmployeeList();
		return elist;
	}

	public void updateEmployee(Employee emp) {
		System.out.println("We Are In EmployeeController.updateEmployee");
		employeeservice = new EmployeeService();
		employeeservice.updateEmployee(emp);
	}

	public void deleteEmployee(int id) {
		System.out.println("We Are In EmployeeController.deleteEmployee");
		employeeservice = new EmployeeService();
		employeeservice.deleteEmployee(id);
	}

	public Employee getEmployee(int id) {
		System.out.println("We Are In EmployeeController.getEmployee");
		employeeservice = new EmployeeService();
		Employee emp = employeeservice.getEmployee(id);
		return emp;
	}

	public List<Employee> getEmployeeList() {
		System.out.println("We Are In EmployeeController.getEmployeeList");
		employeeservice = new EmployeeService();
		List<Employee> elist = employeeservice.getEmployeeList();
		return elist;
	}

	public List<Employee> getEmployeeByName(String name) {
		System.out.println("We Are In EmployeeController.getEmployeeByName");
		employeeservice = new EmployeeService();
		List<Employee> sn = employeeservice.getEmployeeByName(name);
		return sn;
	}

	public List<Employee> getEmployeeByDepartment(String department) {
		System.out.println("We Are In EmployeeController.getEmployeeByDepartment");
		employeeservice = new EmployeeService();
		List<Employee> dl = employeeservice.getEmployeeByDepartment(department);
		return dl;
	}

	public List<Employee> getHighSalaryEmployee(double salary) {
		System.out.println("We Are In EmployeeController.getHighSalaryEmployee");
		employeeservice = new EmployeeService();
		List<Employee> hse = employeeservice.getHighSalaryEmployee(salary);
		return hse;
	}

	public List<Employee> getEmployeeByExperience() {
		System.out.println("We Are In EmployeeController.getEmployeeByExperience");
		employeeservice = new EmployeeService();
		List<Employee> el = employeeservice.getEmployeeByExperience();
		return el;

	}
}
