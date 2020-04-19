package com.review;

public class Hospital {
	
	public static void main(String[] args) {
		
		Doctor doc=new Doctor("John Smith","12345",120000);
		
		Doctor.hospitalName="Hackensack Hospital";// string olunca class ismiyle belirtiyorsun obj degil
		
		System.out.println("Doctors name is "+doc.name);
		
		doc.displayInfo();
		doc.treatPatient("Adam Smith");
		
	}
	
	

}
