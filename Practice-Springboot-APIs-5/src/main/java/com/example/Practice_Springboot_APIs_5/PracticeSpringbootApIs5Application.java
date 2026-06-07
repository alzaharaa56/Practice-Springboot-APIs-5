package com.example.Practice_Springboot_APIs_5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeSpringbootApIs5Application {

	public static void main(String[] args) {
		SpringApplication.run(PracticeSpringbootApIs5Application.class, args);


		UpdateDemo demo = new UpdateDemo();
		demo.updateStudent();


		Student student = new Student(101, "Amaal", "A");
		System.out.println("Original Student details: ");
		System.out.println("Student ID: " + student.getStudentID());
		System.out.println("Student Name : " + student.getStudentName());
		System.out.println("Student grade : " + student.getGrade());

		//update student name using setter method
		student.setStudentName("Noor");
		System.out.println("Updated Student details :");
		System.out.println("Student ID: " + student.getStudentID());
		System.out.println("Student Name : " + student.getStudentName());
		System.out.println("Student grade : " + student.getGrade());

	}
	}


