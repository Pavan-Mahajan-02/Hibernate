package com.tka.service;

import java.util.ArrayList;
import java.util.List;

import com.tka.dao.EmployeeDao;
import com.tka.entity.Employee;

public class EmployeeService {

	EmployeeDao employeedao = null;

	public void insertEmployee(Employee emp) {
		System.out.println("We Are In EmployeeService.insertEmployee");
		employeedao = new EmployeeDao();
		employeedao.insertEmployee(emp);
	}

	public List<Employee> insertEmployeeList() {
		System.out.println("We Are In EmployeeService.insertEmployeeList");
		employeedao = new EmployeeDao();
		List<Employee> elist = employeedao.insertEmployeeList();

		return elist;
	}

	public void updateEmployee(Employee emp) {
		System.out.println("We Are In EmployeeService.updateEmployee");
		employeedao = new EmployeeDao();
		employeedao.updateEmployee(emp);
	}

	public void deleteEmployee(int id) {
		System.out.println("We Are In EmployeeService.deleteEmployee");
		employeedao = new EmployeeDao();
		employeedao.deleteEmployee(id);
	}

	public Employee getEmployee(int id) {
		System.out.println("We Are In EmployeeService.getEmployee");
		employeedao = new EmployeeDao();
		Employee emp = employeedao.getEmployee(id);
		return emp;
	}

	public List<Employee> getEmployeeList() {
		System.out.println("We Are In EmployeeService.getEmployeeList");
		employeedao = new EmployeeDao();
		List<Employee> elist = employeedao.getEmployeeList();
		return elist;
	}

	public List<Employee> getEmployeeByName(String name) {
		System.out.println("We Are In EmployeeService.getEmployeeByName");
		employeedao = new EmployeeDao();
		List<Employee> elist = employeedao.getEmployeeList();
		List<Employee> sn = new ArrayList<Employee>();
		System.out.println("--------------------------------------------------------------");
		for (Employee e : elist) {
			if (e.getName().equals(name)) {
				sn.add(e);
				System.out.println("Id:" + e.getId() + "  Name:" + e.getName() + "  Department:" + e.getDepartment()
						+ "  Experience:" + e.getExperience() + "  Salary:" + e.getSalary());
				System.out.println("--------------------------------------------------------------");
			}
		}
		return sn;
	}


	public List<Employee> getEmployeeByDepartment(String department) {
		System.out.println("We Are In EmployeeService.getEmployeeByDepartment");
		employeedao = new EmployeeDao();
		List<Employee> elist = employeedao.getEmployeeList();
		List<Employee> dl = new ArrayList<Employee>();
		System.out.println("--------------------------------------------------------------");
		for (Employee e : elist) {
			if (e.getDepartment().equals(department)) {
				dl.add(e);
				System.out.println("Id:" + e.getId() + "  Name:" + e.getName() + "  Department:" + e.getDepartment()
						+ "  Experience:" + e.getExperience() + "  Salary:" + e.getSalary());
				System.out.println("--------------------------------------------------------------");
			}
		}
		return dl;
	}
	
	public List<Employee> getHighSalaryEmployee(double salary) {
		System.out.println("We Are In EmployeeService.getHighSalaryEmployee");
		employeedao = new EmployeeDao();
		List<Employee> elist = employeedao.getEmployeeList();
		List<Employee> hse = new ArrayList<Employee>();
		System.out.println("--------------------------------------------------------------");
		for (Employee e : elist) {
			if (e.getSalary()>=salary) {
				hse.add(e);
				System.out.println("Id:" + e.getId() + "  Name:" + e.getName() + "  Department:" + e.getDepartment()
						+ "  Experience:" + e.getExperience() + "  Salary:" + e.getSalary());
				System.out.println("--------------------------------------------------------------");
			}
		}
		return hse;
	}
	
	public List<Employee> getEmployeeByExperience() {
		System.out.println("We Are In EmployeeService.getEmployeeByExperience");
		employeedao = new EmployeeDao();
		List<Employee> elist = employeedao.getEmployeeList();
		List<Employee> el = new ArrayList<Employee>();
		System.out.println("--------------------------------------------------------------");
		for (Employee e : elist) {
			if (e.getExperience()>4) {
				el.add(e);
				System.out.println("Id:" + e.getId() + "  Name:" + e.getName() + "  Department:" + e.getDepartment()
						+ "  Experience:" + e.getExperience() + "  Salary:" + e.getSalary());
				System.out.println("--------------------------------------------------------------");
			}
		}
		return el;
	}
}
