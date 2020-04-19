package com.myexercises;

public class A {


A(){
	System.out.println("Class A");
}

public static void main(String[] args) {
	B obj=new B();
}

}

class B extends A{

	B(){
		System.out.println("Class B");
	}
	
	
	
}

