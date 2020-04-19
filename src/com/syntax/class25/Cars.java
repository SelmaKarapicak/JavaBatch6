package com.syntax.class25;

//Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice() which should be returning a price of the car.
//Create 2 sub classes: Sedan and Truck. The Truck class has field as weight and has its own implementation of  calculateSalePrice() method in which returned price calculated as following: 
//if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
//The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): 
//if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount

public class Cars {
double carPrice;
String color;
Cars(double carPrice, String color){
	this.carPrice=carPrice;
	this.color=color;
}

public int calculateSalePrice() {
	return (int) carPrice;
}

}
class Truck extends Cars{
 int weight;
 
Truck(double carPrice,String color, int weight){
 super(carPrice,color);	
 this.weight=weight;

}

public int calculateSalePrice() {
	if (weight>2000) {
		carPrice=(carPrice*10)/100;
	}else 
		carPrice=(carPrice*20)/100;
	System.out.println("Truck the color of "+color+" and weight of "+weight+" sale price is "+carPrice);
	return (int) carPrice;
}
}
class Sedan extends Cars{
	 int length;
	 
	Sedan(double carPrice,String color, int length){
	 super(carPrice,color);	
	 this.length=length;

	}
	
	public int calculateSalePrice() {
		if (length>20) {
			carPrice=(carPrice*5)/100;
		}else 
			carPrice=(carPrice*10)/100;
		System.out.println("Sedan the color of "+color+" and length of "+length+" sale price is "+carPrice);
		return (int) carPrice;
	}
	}
