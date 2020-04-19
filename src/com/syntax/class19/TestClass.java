package com.syntax.class19;

public class TestClass {
	
	public static void main(String[] args) {
	Dog dog1 = new Dog();
    //access variables own class
    dog1.breed="husky";
    //access vars from parent(superclass)
    dog1.color="red";
    dog1.size="huge";
    dog1.fur="no-fur";
    
    Dog.age=8;
    Dog.display();
    
    //access method from own class
    dog1.bark();
    //access method from parent class
    dog1.sleep();
    dog1.eat();
    dog1.beWild();
    System.out.println("----------");
    
    
    System.out.println("----------");
    Animals animal = new Animals();
    //can access only features define within the superclass(parent)
    animal.fur="too much";
    animal.size="petite";
    animal.color="grey";
//  animal.bark();
    animal.sleep();
    animal.eat();
    animal.beWild();
    animal.notify();//this methods comes from our Object class (parent of our Animal class)
    
            

	}
}
