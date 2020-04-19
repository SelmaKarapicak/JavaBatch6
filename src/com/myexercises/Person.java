package com.myexercises;

public class Person {
	String name;
	  String lastName;
	  int age;
	  
	}
	class Employee extends Person{
		int salary;
		   void employee() {
			System.out.println(name+" "+lastName+" "+age+" "+salary);
		}

	}
	class Student extends Person{
		int grade;
	  public void student() {
			System.out.println(name+" "+lastName+" "+age+" "+grade);
		}
	}
	class Retiree extends Person{
		String seniorActivity;
	
	public void retiree() {
		System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
	}
	
	}


