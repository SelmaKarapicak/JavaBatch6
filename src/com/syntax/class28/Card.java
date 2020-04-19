package com.syntax.class28;

//Create a Card class that will have implemented  and unimplemented methods and a constructor that will initializes credit card type. 
//Create 3 subclasses of a Card card. Create 3 objects of different card and store them into LinkedList.
//Using for loop/advanced for loop/ iterator access all methods of the class.

public abstract class Card {
	
	String cardType;
	
	Card(String cardType){
		this.cardType=cardType;
	}
	
	public void interest() {
		System.out.println(cardType +" interest rate is low");
	}
	
	public abstract void limit();
}

class BOA extends Card{
	BOA(String cardType){
		super(cardType);
	}
	
	public void interest() {
		System.out.println(cardType +" interest rate is low");
	}

	@Override
	public void limit() {
		System.out.println(cardType+" has extra 300$ limit");
	}
}

class TD extends Card{

	TD(String cardType) {
		super(cardType);
		// TODO Auto-generated constructor stub
	}
	
	public void interest() {
		System.out.println(cardType +" interest rate is low");
	}

	@Override
	public void limit() {
   System.out.println(cardType+" has extra 200$ limit");
		
	}
	
}

class WellsFargo extends Card{

	WellsFargo(String cardType) {
		super(cardType);	
	}
	
	public void interest() {
		System.out.println(cardType +" interest rate is low");
	}

	@Override
	public void limit() {
		System.out.println(cardType+" has extra 500$ limit");
	}
	
}
