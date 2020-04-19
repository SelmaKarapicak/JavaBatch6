package com.syntax.class19;

public class Company {
	///create a class named Company and create 3 instance variables emplId, fullname, year
	//intialize ur instance varibales and create 3 constructors EXECUTE something for each constructor.
	
	String name;
	int empId;
	int year;
	
	Company(String name, int empId ,int year){
		this.name=name;
		this.empId=empId;
		this.year=year;
		
	}
	
	
	Company(String name){
		this(" Kara",12345, 1997);
			System.out.println(name+" id of "+empId+" working since "+year);	
		
	}
	
	public static void main(String[]args) {
		Company obj=new Company("Selma");
	}

}
