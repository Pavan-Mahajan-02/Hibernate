package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee", schema = "adv_java_practice")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String department;
	private int experience;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(String name, String department, int experience, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.experience = experience;
		this.salary = salary;
	}
	
	

	public Employee(int id, String name, String department, int experience, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.experience = experience;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", experience=" + experience
				+ ", salary=" + salary + "]";
	}

}
