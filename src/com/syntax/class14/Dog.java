package com.syntax.class14;

public class Dog {
	
	String breed;
	String color;
	String name;
	int age;
	
	void eat() {
    	System.out.println(name+" can eat");
    }
    	
    	void bark() {
    		System.out.println(name+" can bark");
    	}
    	
    	void run() {
    		System.out.println(name+" can run");
    	}
	
public static void main(String[] args) {
		
		Dog dog1=new Dog();
		dog1.breed="Shih tzu";
		dog1.color="yellow";
		dog1.name="lucy";
		dog1.age=2;
		
		dog1.bark();
		dog1.eat();
		dog1.run();

		Dog dog2=new Dog();
		dog2.breed="buuldog";
		dog2.color="black";
		dog2.name="dock";
		dog2.age=5;
		
		dog2.bark();
		dog2.eat();
		dog2.run();

		
}
        
    
		

}
