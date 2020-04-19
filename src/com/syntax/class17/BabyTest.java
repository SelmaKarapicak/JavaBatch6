package com.syntax.class17;

public class BabyTest {

	public static void main(String[] args) {
			// if they are inside the same packgae-non need to import
			Baby baby1=new Baby(); // special method constructor
			baby1.cry(); // calling method
			System.out.println(baby1.cry());
			//assign values
	        baby1.firstName= "John";
	        baby1.lastName="Smith";
	        baby1.gender='M';
	        baby1.weight=7;
	        baby1.hairColor="Yellow";
	        // reassign value. You can change the values
	        baby1.weight=8;
	        System.out.println("baby1 firstname is" +baby1.firstName);
	        // assign first
	        String babyLastName=baby1.lastName;
			System.out.println("babyLastName "+babyLastName);
			baby1.cry();
			baby1.talk(4);
			System.out.println("\n---- Done with baby1 -------");
			Baby baby2=new Baby(); // 2 different objects/ 2 different instances
			System.out.println(baby2.cry());
			baby2.firstName="Selin";
			baby2.lastName="Atasoy";
			baby2.gender='F';
			baby2.hairColor="Black";
			baby2.weight=6;
			System.out.println("------------------------------------");
			baby1.displayBabyinfo();
			System.out.println("------------------------------------");
			baby2.displayBabyinfo();
			System.out.println("------------------------------------");
		}

	}

}
