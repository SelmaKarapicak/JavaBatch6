package com.syntax.class17;

public class StaticKeyword {
	
	//create a template for a phone
	
	String color;
	int memory;
	
	static String brand;
	static boolean touchscreen;
	
	//return type, name, parameters
	
	static void displayGeneralInfo() {
		System.out.println("We are building "+brand+"with touch screen ="+touchscreen);
	}
	//instance members of the class can access ALL STATIC members
	 void displaySpecifications() {
		System.out.println("We build"+brand+" with "+memory+"GB memory in "+color+"color");
	}
	 
	 //STATIC METHODS CANNOT ACCESS NON-STATIC MEMBERS OF THE CLASS
	//static void displaySpecifications() {
	//		System.out.println("We build phone with "+memory+"GB memory in "+color+"color");
		
	 
	public static void main(String[] args) {
		//accessing static variables in a static way
		brand="Iphone";
		touchscreen=true;
		//accessing instance variables through the instance of the class
		StaticKeyword obj=new StaticKeyword();
		obj.color="Black";
		obj.memory=64;
		
		//accessing static method in a static way
		displayGeneralInfo();
		obj.displaySpecifications();
		
		//accessing static method
	}

}
