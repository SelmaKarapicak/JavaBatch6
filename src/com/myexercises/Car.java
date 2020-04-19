package com.myexercises;

public class Car {
	String make, model;
	  int numberOfDoors, speed;
	  double price;
	  
	  Car(String smake, String smodel, int inumberOfDoors, int ispeed, double dprice){
		  make=smake;
		  model=smodel; 
		  numberOfDoors=inumberOfDoors; 
		  speed=ispeed;
		  price=dprice;
	  }
	  Car(String make, String model, int speed, double price){
	  }
	  Car( int speed, double price){
	  }
	  Car(String make, String model){
	  }
	  void display(){
	    
	    System.out.println(make+" "+model+" "+numberOfDoors+" "+speed+" "+price);
	  }
	 
	  public static void main(String[] args){
		  Car obj=new Car("Toyota","Prius",4,120,30000.0);
		  obj.display();
		  
		  
		}

}
