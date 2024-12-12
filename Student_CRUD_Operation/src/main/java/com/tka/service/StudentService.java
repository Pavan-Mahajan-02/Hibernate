package com.tka.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.tka.dao.StudentDao;
import com.tka.entity.Student;

public class StudentService {

	StudentDao dao = null;

	public void studentInsertService(Student sobj) {

		System.out.println("We Are In StudentInsertService Method");

		dao = new StudentDao();

		dao.insertOneStudentInDB(sobj);

	}

	public List<Student> studentGetAllService() {
		dao = new StudentDao();
		List<Student> slist = dao.selectAllStudentFromDB();

		return slist;

	}

	public Student studentGetOneService(int roll) {

		dao = new StudentDao();
		Student student = dao.selectOneStudentFromDB(roll);

		return student;

	}

	public List<Student> studentTopperService() {
		dao = new StudentDao();
		List<Student> slist = dao.selectAllStudentFromDB();
		List<Student> alltoppers = new ArrayList<Student>();
		for (Student student : slist) {
			if (student.getMarks() >= 90) {
				alltoppers.add(student);
			}
		}
		return alltoppers;
	}

	public List<Student> studentWithNameAService() {

		dao = new StudentDao();

		List<Student> slist = dao.selectAllStudentFromDB();

		List<Student> allnamewitha = new ArrayList<Student>();

		for (Student st : slist) {
			if (st.getName().startsWith("A")) {
				allnamewitha.add(st);
			}
		}

		return allnamewitha;

	}

	public List<Student> studentGetWithMarkService() {

		dao = new StudentDao();

		List<Student> slist = dao.selectAllStudentFromDB();

		List<Student> smark = new ArrayList<Student>();

		for (Student st : slist) {
			if (st.getMarks() == 77) {
				smark.add(st);
			}
		}

		return smark;

	}

	public List<Student> studentGetByNameService() {

		dao = new StudentDao();

		List<Student> slist = dao.selectAllStudentFromDB();

		List<Student> sname = new ArrayList<Student>();

		for (Student student : slist) {
			if (student.getName().equals("Jack")) {
				sname.add(student);
			}

		}
		return sname;

	}

	public List<Student> studentGetByRollService() {

		dao = new StudentDao();

		List<Student> slist = dao.selectAllStudentFromDB();

		List<Student> sroll = new ArrayList<Student>();

		for (Student student : slist) {
			if (student.getRoll() == 14) {
				sroll.add(student);
			}
		}
		return sroll;

	}
	public void studentDeleteService(Student sobj) {

//		System.out.println("We Are In StudentInsertService Method");

		dao = new StudentDao();

		dao.deleteOneStudentInDB(sobj);

	}
	
	

}