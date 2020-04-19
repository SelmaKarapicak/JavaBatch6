package com.syntax.class16;

public class LocalVariables {
	
	void nameInside() {
	String name="John";//local variable that visible only within method it was declared
	}
	public static void main(String[] args) {
		//syso(name);CE: name wont be visible to another method
		//since its scope only within nameinside method	
	}
	
	void anotherName() {
		
		String name="Jane";
	}
	
	

}
