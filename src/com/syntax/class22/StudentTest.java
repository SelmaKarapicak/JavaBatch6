package com.syntax.class22;

public class StudentTest {

	public static void main(String[] args) {
		Student student=new Student();
		student.course();
		
		Student syntax=new SyntaxStudent();
		syntax.course();
		SyntaxStudent syntax1=new SyntaxStudent();
		syntax1.bootcamp();
		
		CollegeStudent college=new CollegeStudent();
		college.course();
		college.college();

	}

}
