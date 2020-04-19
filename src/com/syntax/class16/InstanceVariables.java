package com.syntax.class16;

public class InstanceVariables {
	
	String name="John";// instance variable


 public static void main(String[] args) {
	
	String name="Yunus";
	System.out.println(name);
	
	InstanceVariables obj= new InstanceVariables();
	
	//object.name="Ali";
	System.out.println(name);
	//System.out.println(object.name);
	
	//change value of local variable
	name="Farid";
	System.out.println(name);
}
}