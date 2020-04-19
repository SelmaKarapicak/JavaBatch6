package com.syntax.class20;

public class CarTest {

	public static void main(String[] args) {
	
		Car obj=new Car();
		System.out.println("==========");
		
		Mercedes obj1=new Mercedes();
		obj1.display();
		
		Mercedes obj2=new Mercedes("Mercedes","M","AMG");
		obj2.display();
		
		Mercedes obj3=new Mercedes("Mercedes","M","NO AMG");
		obj3.display();

	}

}
