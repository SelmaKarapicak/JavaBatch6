package com.syntax.class28;

//Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance. 
//Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute. 
//Create 3 objects of the sub classes and store them in ArrayList.
//Using for loop/advanced for loop/ iterator access all methods of the class. 

public abstract class Insurance {
	
	String insuranceName;
	
	Insurance(String insuranceName){
		this.insuranceName=insuranceName;
	}
	
	 abstract void getQuote();
	 abstract void cancelInsurance();
}

class Car extends Insurance{
	String carModel;
	Car(String insuranceName, String carModel){
		super(insuranceName);
		this.carModel=carModel;
	}

	@Override
	void getQuote() {
	System.out.println(insuranceName+" has the cheapest quote for "+carModel);	
	}

	@Override
	void cancelInsurance() {
		System.out.println(insuranceName+" have an option to cancel for "+carModel);
	}
}

class Pet extends Insurance{
	String petType;
	
	Pet(String insuranceName, String petType){
		super(insuranceName);
		this.petType=petType;
	}

	@Override
	void getQuote() {
		System.out.println(insuranceName+" has the cheapest quote for "+petType);	
		}

	@Override
	void cancelInsurance() {
		System.out.println(insuranceName+" have an option to cancel for "+petType);
	}
}

class Health extends Insurance{

	Health(String insuranceName) {
		super(insuranceName);
	}

	@Override
	void getQuote() {
		System.out.println(insuranceName+" has the cheapest quote");	
		}

	@Override
	void cancelInsurance() {
		System.out.println(insuranceName+" have an option to cancel");
	}
	
}
