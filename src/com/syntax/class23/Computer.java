package com.syntax.class23;

public class Computer {
	
	String make;
	
	Computer(String make){
		this.make=make;
	}
	
	void keybord() {
		System.out.println("All computers have keybord");
	}

}

class Apple extends Computer{
	
	Apple(String make){
		super(make);
	}
	
	void keybord() {
		System.out.println(make+ " has a keybord");
	}
	
	void ios() {
		System.out.println(make+" has ios");
	}
}

class Lenovo extends Computer{
	
	Lenovo (String make){
		super(make);
	}
	void keybord() {
		System.out.println(make+" has a keybord");
	}
	
	void hd() {
		System.out.println(make+" has hd display");
	}
	
}

class HP extends Computer{
	
	HP(String make){
		super(make);
	}
	
	void keybord() {
		System.out.println(make+" has a keybord");
	}
	
	void hdmi() {
		System.out.println(make+" has hdmi");
	}
}

class Dell extends Computer{
	
	Dell(String make){
		super(make);
	}
	
	void keybord() {
		System.out.println(make+" has a keybord");
	}
}

