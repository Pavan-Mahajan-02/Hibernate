package com.tka.client;

import java.util.List;

import com.tka.controller.StudentController;
import com.tka.entity.Student;

public class StudentClient {

	public static void main(String[] args) {
		System.out.println("We Are In StudentClient Method");

		StudentController sc = new StudentController();

//		Student sobj = new Student(15, "Jack", 65);
//		sc.studentInsertController(sobj);

		
//		Student sobj = new Student(14, "Sam", 85);
//		sc.studentdeleteController(sobj);

//		List<Student> list = sc.studentGetAllController();
//		System.out.println("---------------------------");
//		for (Student st : list) {
//			System.out.println("Roll:"+st.getRoll()+", Name:"+st.getName()+", Marks:"+st.getMarks());
//			System.out.println("---------------------------");
//		}

//		Student st = sc.studentGetOneController(14);
//		System.out.println("Roll:"+st.getRoll()+", Name:"+st.getName()+", Marks:"+st.getMarks());
//
//		List<Student> aname = sc.studentTopperController();
//		for (Student student : aname) {
//			System.out.println(
//					"Roll:" + student.getRoll() + ", Name:" + student.getName() + ", Marks:" + student.getMarks());
//		}
		
	
//		List<Student> sname = sc.studentGetByNameController();
//		System.out.println("---------------------------");
//		for (Student student : sname) {
//			System.out.println(
//					"Roll:" + student.getRoll() + ", Name:" + student.getName() + ", Marks:" + student.getMarks());
//			System.out.println("---------------------------");
//		}

		List<Student> sroll = sc.studentGetByRollController();
		System.out.println("---------------------------");
		for (Student student : sroll) {
			System.out.println(
					"Roll:" + student.getRoll() + ", Name:" + student.getName() + ", Marks:" + student.getMarks());
			System.out.println("---------------------------");
		}
	}

}