package com.syntax.class19;

public class Student {
	
	//Write program as a Student class   that has instance variables name and address.
	//Create a constructor that will initialize those variables. 
	//Print name & address of given  student using displayInfo method.
	
	String name;
	String address;
	
	Student(String name, String address){
		this.name=name;
		this.address=address;
	}
	
	void displayInfo() {
		System.out.println(name+" lives in the "+address);
	}

	
	public static void main(String[] args) {
		Student obj=new Student("Selma", "Florida USA");
		obj.displayInfo();
		
	}
	

}
