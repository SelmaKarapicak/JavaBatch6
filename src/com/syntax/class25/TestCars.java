package com.syntax.class25;

public class TestCars {

	public static void main(String[] args) {
	
		Truck truck=new Truck(30000,"Red",25);
		truck.calculateSalePrice();
		
		Sedan sedan=new Sedan(20000,"Blue",10);
		sedan.calculateSalePrice();

	}

}
