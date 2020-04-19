package com.syntax.class22;

//Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 
//Define common behavior within parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Write example of achieving run time polymorphism
public class Student {

	void course() {
		System.out.println("All students have courses");
	}	
	
}

class SyntaxStudent extends Student{
	@Override
	void course() {
		System.out.println("Syntax students have Java courses");
		}
	void bootcamp() {
		System.out.println("Syntax students have 6 months bootcamp");
	}
}

class CollegeStudent extends Student{
	@Override
	void course() {
		System.out.println("College students have Engineering courses");
	}
	void college() {
		System.out.println("College students have 4 academic years");
	}
	

class SchoolStudent extends Student{
	@Override
	void course() {
		System.out.println("School students have English courses");
	}
	void school() {
		System.out.println("School students have university entrance exam");
	}
	
}
}
