package com.syntax.class16;

public class Employee {
	//Create a Class called Employee:
	//Create three  variables eID , salary and set the CEO to “Sumair” 
	//Create two objects of the class Employee 
	//Set the value of eID, salary for each of the objects
	//Print out the eID , salary and  CEO for each of the objects 
	
	int eID;
	int salary;
	static String CEO;
	
	public static void main(String[] args) {
		
		Employee obj=new Employee();
		obj.eID=4567890;
		obj.salary=4000;
		obj.CEO="Sumair";
		
		System.out.println(obj.eID=4567890);
		System.out.println(obj.salary=4000);
		System.out.println(obj.CEO="Sumair");
		
		
		
		
		
	}

}
