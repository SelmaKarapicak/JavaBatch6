package com.syntax.class16;

public class Students {
	//Create a Class called Students
	//Create three  variables studentName , studentID  and numberOfStudents
	//Create three objects of the Students Class 
	//Set the value for  studentName , studentID and increment  the numberOfStudents for each object
	//Print out  total number of students
	
	String studentName;
	int studentID;
	static int numberOfStudents;
	
	public static void main(String[] args) {
		
		Students obj=new Students();
		obj.studentName="Selma";
		obj.studentID=467;
		numberOfStudents++;
		
		Students obj2=new Students();
		obj2.studentName="Ece";
		obj2.studentID=465;
		numberOfStudents++;
		
		System.out.println(obj.studentName);
		System.out.println(obj.studentID);
		System.out.println(numberOfStudents);
	}

}
