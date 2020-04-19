package com.syntax.class15;

public class MethodsTest {

	public static void main(String[] args) {
		 
		Methods obj=new Methods();
		
		obj.sayWelcome();
		obj.sayAnything("Hello", 3);
		//obj.sayAnything(10, "Hi"); ce becs it is not in order with parameter
		
		obj.isItRaining(true);
		obj.isItRaining(false);

	}

}
