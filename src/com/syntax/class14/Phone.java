package com.syntax.class14;

public class Phone {
	
	String name;
	String model;
	int year;
	String color;
	
	void foto() {
		System.out.println(name+" can take a photo");
	}
	void battery () {
		System.out.println(name+" has a strong battery");
	}
	
	
	public static void main (String[] args) {
		
		Phone phone1=new Phone();
		
		phone1.name="Iphone";
		phone1.model="Iphone 10";
		phone1.year=2019;
		phone1.color="White";
		phone1.foto();
		phone1.battery();
		
				
Phone phone2=new Phone();
		
		phone2.name="Android";
		phone2.model="Samsung";
		phone2.year=2018;
		phone2.color="Black";
		phone2.foto();
		phone2.battery();
		
Phone phone3=new Phone();
		
		phone3.name="Nokia";
		phone3.model="3310";
		phone3.year=2000;
		phone3.color="Blue";
		phone3.foto();
		phone3.battery();
		
		}
		
		
	
}


