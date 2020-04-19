package com.syntax.class29;

	
	abstract class Coverage {
	    public void method() {
	        System.out.println("Method of coverage class");
	    }
	}
	abstract public class Insurance extends Coverage {
	    String insuranceName;
	    Insurance(String insuranceName) {
	        this.insuranceName = insuranceName;
	    }
	    public abstract void getQuote();
	    public abstract void cancelInsurance();
	}
	class Car extends Insurance {
	    String carModel;
	    Car(String insuranceName, String carModel) {
	        super(insuranceName);
	        this.carModel = carModel;
	    }
	    public void getQuote() {
	        System.out.println("$1600 offered for 6 months");
	    }
	    public void cancelInsurance() {
	        System.out.println("Due to other offers, ");
	    }
	}
	class Pet extends Insurance {
	    String petType;
	    Pet(String insuranceName, String petType) {
	        super(insuranceName);
	        this.petType = petType;
	    }
	    public void getQuote() {
	        System.out.println("Offers are too high ");
	    }
	    public void cancelInsurance() {
	        System.out.println();
	    }
	}
	class Health extends Insurance {
	    Health(String insuranceName){
	        super(insuranceName);
	    }
	    public void getQuote() {
	        System.out.println("Offers are too high ");
	    }
	    public void cancelInsurance() {
	        System.out.println();
	    }
	}


