package com.myexercises;

public class Employee2Test {

	public static void main(String[] args) {
		
		Employee2 emp=new Employee2(400,10);
		emp.addSal();
		emp.addWork();
		
		Intern intern=new Intern(200,12,50);
		intern.addSal();
		intern.addWork();
		intern.display();
		
		System.out.println("=======");
	
		

	}

}
