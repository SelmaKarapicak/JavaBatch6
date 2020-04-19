package com.syntax.class16;

public class Dog {
	
	String name,size; // method yapmadan yazinca instance variable oldu.
	int age;          //local variable {} icine yazilinca oluyor
	
	void displayDog() {
		System.out.println("Dog name is "+name+"dog size is "+size+"dog age is "+age);
	}

	
public static void main(String[] args) {
	
	Dog dog1=new Dog();
	dog1.name="Lucy";
	dog1.size="Big";
	dog1.age=5;
	
	dog1.displayDog();
	
	System.out.println("Dog 1 name is "+dog1.name);
	
	Dog dog2=new Dog();
	dog2.name="Lucy";
	dog2.size="Big";
	dog2.age=5;
	
	dog2.displayDog();
	System.out.println("Dog 2 name is "+dog2.name);
	
}	
		
}
