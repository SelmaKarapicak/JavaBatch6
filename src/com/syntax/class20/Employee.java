package com.syntax.class20;

public class Employee {
	public static String company;
	protected int empNumber;
	double salary;
	private long ssn;
	
	void getPaid() {
		System.out.println("Employee gets "+salary);
	}
	
	static void work() {
		System.out.println("Employee work in "+company);
	}
	
	
	
	

}
