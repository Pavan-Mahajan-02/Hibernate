package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Student;

public class StudentDao {

	Configuration cfg = null;
	SessionFactory sf = null;
	Session os = null;
	Criteria criteria = null;

	public void insertOneStudentInDB(Student sobj) {

		System.out.println("We Are In InsertOneStudentInDB Method");

		cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");

		cfg.addAnnotatedClass(Student.class);

		sf = cfg.buildSessionFactory();

		try {

			os = sf.openSession();

			os.beginTransaction();

//			Student sobj = new Student(1, "Sam", 87);

			os.save(sobj);

			os.getTransaction().commit();

			System.out.println("One Student Record Added In DB");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public List<Student> selectAllStudentFromDB() {

		cfg = new Configuration();
		
		cfg.configure();
		
		cfg.addAnnotatedClass(Student.class);
		
		sf = cfg.buildSessionFactory();
		
		os = sf.openSession();

		criteria = os.createCriteria(Student.class);
		
		List<Student> allstudentlist = criteria.list();

		return allstudentlist;

	}

	public Student selectOneStudentFromDB(int roll) {

		cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		cfg.addAnnotatedClass(Student.class);
		
		sf = cfg.buildSessionFactory();
		
		os = sf.openSession();

		Student s1 = os.load(Student.class, roll);

		return s1;

	}
	
	public void deleteOneStudentInDB(Student sobj) {

//		System.out.println("We Are In DeleteOneStudentInDB Method");

		cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");

		cfg.addAnnotatedClass(Student.class);

		sf = cfg.buildSessionFactory();

		try {

			os = sf.openSession();

			os.beginTransaction();

//			Student sobj = new Student(1, "Sam", 87);

			os.delete(sobj);

			os.getTransaction().commit();

			System.out.println("One Student Record Deleted In DB");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}