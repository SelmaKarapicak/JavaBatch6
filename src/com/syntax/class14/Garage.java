package com.syntax.class14;

public class Garage {

	public static void main(String[] args) {
		// build individual objects
		
		Car car1=new Car();
		car1.make="Lamborghini";
		car1.model="Gallardo";
		car1.year=2020;
		car1.color="Blue";
		
		
		Car car2=new Car();
		car2.make="BMW";
		car2.model="m5";
		car2.year=2019;
		car2.color="Pink";
		
		Car car3=new Car();
		car3.make="123";
		car3.speed=200;
		
		//print pink BMW 
		System.out.println(car1.make);
		
		//accessing behavior/methods of car1
		car1.drive();
		car1.accelerate();
		car1.makeNoise();
		car1.stop();
		
		//accessing behavior/methods of car2
				car2.drive();
				car2.accelerate();
				car2.makeNoise();
				car2.stop();
		
		//I drive pink bmw
		
		System.out.println("I drive "+car2.color+" "+car2.make);
		
		//create bike object
		
		//Bike bike1=new Bike();
		//new bike cannot create becs you do not have a class for bike
		
		Car2 anotherCar=new Car2();
		anotherCar.make="Toyota";
		anotherCar.speed=200;
		
		

	}

}
