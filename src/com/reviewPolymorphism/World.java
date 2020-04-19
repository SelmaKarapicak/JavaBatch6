package com.reviewPolymorphism;

public class World {
	
	public static void main(String[] args) {
		
		Human h1=new Human("Turker");
		System.out.println("The best student is "+h1.name);
		
		Human.planet="World";
		
		Human h2=new Human("Gulbahar");
		h2.name="Gulkis";
		h2.planet="Mars";
		System.out.println(h2.name+" lives in "+h2.planet);
		System.out.println(h1.name+" lives in "+h1.planet);
		h1.talk();
		h2.talk();
		
		Turkish t1=new Turkish("Ali");
		System.out.println(t1.name +" lives in "+Human.planet);
		t1.talk();
		t1.makeBaklava();
		
		
		
	}

}
