package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Employee;

public class EmployeeDao {
	Configuration cfg = null;
	SessionFactory sessionfactory = null;
	Session session = null;
	Criteria criteria = null;

	public void insertEmployee(Employee emp) {
		System.out.println("We Are In EmployeeDao.insertEmployee");
		cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		sessionfactory = cfg.buildSessionFactory();
		try {
			session = sessionfactory.openSession();
			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("One Employee Record Added In DB");
	}

	public List<Employee> insertEmployeeList() {
		System.out.println("We Are In EmployeeDao.insertEmployeeList");
		List<Employee> elist = new ArrayList<Employee>();
		elist.add(new Employee("Riya", "Dev", 3, 42000));
		elist.add(new Employee("Ram", "Test", 4, 37000));
		elist.add(new Employee("Jay", "HR", 4, 45000));

		cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		sessionfactory = cfg.buildSessionFactory();
		try {
			session = sessionfactory.openSession();
			for (Employee emp : elist) {
				session.save(emp);
				session.beginTransaction().commit();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Employee List Added In DB");
		return elist;
	}

	public void updateEmployee(Employee emp) {
		System.out.println("We Are In EmployeeDao.updateEmployee");
		cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		sessionfactory = cfg.buildSessionFactory();
		try {
			session = sessionfactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(emp);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Employee Updated In DB");
	}

	public void deleteEmployee(int id) {
		System.out.println("We Are In EmployeeDao.deleteEmployee");
		cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		sessionfactory = cfg.buildSessionFactory();
		try {
			session = sessionfactory.openSession();
			session.beginTransaction();
			Employee emp = session.load(Employee.class, id);
			session.delete(emp);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Employee Deleted In DB");
	}

	public Employee getEmployee(int id) {
		System.out.println("We Are In EmployeeDao.getEmployee");
		cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		sessionfactory = cfg.buildSessionFactory();
		Employee emp = null;
		try {
			session = sessionfactory.openSession();
			emp = session.load(Employee.class, id);
			System.out.println("Id:" + emp.getId() + "  Name:" + emp.getName() + "  Department:" + emp.getDepartment()
					+ "  Experience:" + emp.getExperience() + "  Salary:" + emp.getSalary());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("One Employee Selected...");
		return emp;
	}
	
	public List<Employee> getEmployeeList() {
		System.out.println("We Are In EmployeeDao.getEmployeeList");
		cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		sessionfactory = cfg.buildSessionFactory();
		List<Employee> elist = null;
		try {
			session = sessionfactory.openSession();
			criteria = session.createCriteria(Employee.class);
			elist = criteria.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Employee List Selected...");
		return elist;
	}
}
