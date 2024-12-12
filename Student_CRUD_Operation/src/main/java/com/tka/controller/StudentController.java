package com.tka.controller;

import java.util.List;

import com.tka.entity.Student;
import com.tka.service.StudentService;

public class StudentController {

	StudentService ss = null;

	public void studentInsertController(Student sobj) {

		System.out.println("We Are In StudentInsertController Method");

		ss = new StudentService();

		ss.studentInsertService(sobj);
	}

	public List<Student> studentGetAllController() {

		ss = new StudentService();
		List<Student> sService = ss.studentGetAllService();
		return sService;

	}

	public Student studentGetOneController(int roll) {
		ss = new StudentService();
		Student st = ss.studentGetOneService(roll);
		return st;
	}

	public List<Student> studentTopperController() {

		ss = new StudentService();
		List<Student> topper = ss.studentTopperService();

		return topper;

	}

	public List<Student> studentWithNameAController() {

		ss = new StudentService();

		List<Student> alist = ss.studentWithNameAService();

		return alist;
	}

	public List<Student> studentGetWithMarksController() {

		ss = new StudentService();

		List<Student> smarks = ss.studentGetWithMarkService();

		return smarks;

	}
	
	public List<Student> studentGetByNameController(){
		
		ss = new StudentService();
		
		List<Student> sname = ss.studentGetByNameService();
		
		return sname;
	}
	
	public List<Student> studentGetByRollController(){
		
		ss = new StudentService();
		
		List<Student> sroll = ss.studentGetByRollService();
		
		return sroll;
	}
	public void studentdeleteController(Student sobj) {

//		System.out.println("We Are In StudentDeleteController Method");

		ss = new StudentService();

		ss.studentDeleteService(sobj);
	}

	
}