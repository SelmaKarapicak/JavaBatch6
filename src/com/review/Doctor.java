package com.review;

public class Doctor {
	String name;
	String licenceId;
	int salary;
	static String hospitalName;
	public Doctor(String name, String licenceId, int salary){
		this.name=name;
		this.licenceId=licenceId;
		this.salary=salary;
	}
	
	public void checkup(String patientName) {
		System.out.println("Doctor "+name+" has ordered blood test for "+patientName);
	}
	
	public void treatPatient(String patientName) {
		System.out.println("Doctor "+this.name+" gives prescription to "+patientName);
	}
	public void chargePatient() {
		System.out.println("Let me charge $100");
	}
	
	public void displayInfo() {
		System.out.println("Doctor "+name+" with licenced"+licenceId+
				"has a salary"+salary+"works for "+hospitalName);
	}

}
