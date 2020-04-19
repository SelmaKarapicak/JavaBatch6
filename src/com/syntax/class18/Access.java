package com.syntax.class18;

public class Access {
	
    //Write a program  that will have 4 different access levels of constructors and create 3 objects of this class:
	////1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.
	
	//static Access(){
	//	System.out.println("inside same class");	CE: invalid modifier
	//}
	
	public Access(){
		System.out.println("Public constructor");
	}
	
	Access(int num){
		System.out.println("Default constructor");
	}
	
	protected Access(int num, int num1){
		System.out.println("protected constructor");
	}
	private Access(String str) {
		System.out.println("private constructor");
	}
	
	public static void main(String[] args) {
		Access obj=new Access();
		Access obj1=new Access(12);
		Access obj2=new Access(12,14);
		Access obj3=new Access("hi");
		
	}

}
