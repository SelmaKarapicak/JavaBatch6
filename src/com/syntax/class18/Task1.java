package com.syntax.class18;

public class Task1 {
	//Write a program that will have a constructor: one with parameters and second without any parameters. 
	//Create a separate Test class where you will execute both of the constructors.
	
	Task1(String str){
		System.out.println("This is a constructor with string parameter");
	}
	
	Task1(){
		System.out.println("This is a constructor without parameter");
	}
	
	public static void main(String[] args) {
		new Task1();
		new Task1("str parameter");
	}

}
