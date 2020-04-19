package com.review;

public class Dermatologist extends Doctor {
	
	String dermaId;
	
	public Dermatologist(String name, String licenceId, int salary, String dermaId) {
		super(name,licenceId,salary);
		this.dermaId=dermaId;
	}
	
	public void skinTest() {
		System.out.println("Lets apply some skin test");
	}
	

}
