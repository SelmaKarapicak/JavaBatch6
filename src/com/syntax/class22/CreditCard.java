package com.syntax.class22;

public class CreditCard {
	//Create a class CreditCard and define variable balance and interest. 
	//Create an instance method that will calculate interest based on the given balance. 
	//Create 2 subclasses: Visa and AX. In AX class override method calculate interest. 
	//Call the method by creating an object of each of the three classes.
	
	
	double balance,interest;
	
	CreditCard(double balance){
		this.balance=balance;
	}
	
	double calculate() {
		interest=balance*0.2;
		return interest;
	}		
}
class Visa extends CreditCard{

	Visa(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}
	
}
class AX extends CreditCard{

	AX(double balance) {
		super(balance);
	}
	double calculate() {
		interest=balance*0.4;
		return interest;
	}		
	
	
}