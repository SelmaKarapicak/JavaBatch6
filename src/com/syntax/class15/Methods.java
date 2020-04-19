package com.syntax.class15;

public class Methods {
	
	//create a method that will say welcome 10 times
	
	void sayWelcome() {
		
		for(int i=0; i<10; i++) {
			System.out.println("Welcome");
		}	
	}
	
	//creat method that will say any word number of times
	
	void sayAnything(String word, int times) {
		
		for(int i=0; i<times; i++) {
			System.out.println(word);
		}	
	}
	
	//create a method isItRaining
	//that will accept boolean values as a param
	//and based on the value it will print message accordingly
	
	void isItRaining(boolean rain) {
		
		if(rain) {
			System.out.println("Stay home and learn Java");
		}else {
			System.out.println("It is not raining go for a walk");
		}
	}
	
	

}
