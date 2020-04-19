package com.syntax.class17;

public class Baby {
	 // class
		// properties or varibles of a baby//nouns
		String firstName;
		String lastName;
		char gender;
		int weight;
		String hairColor;
		// behaviour of the baby// verbs//method
		// no parameters
		public void walk() {
			System.out.println("Crawling..");
		}
		public String cry() {// has no parameter but returns string
			return "Cry every minute";
		}
		public void talk(int times) { // has parameter but returns nothing
			for (int i = 1; i <= times; i++) {
				System.out.print("Bla ");
			}
		}
		public void displayBabyinfo() {
			System.out.println("Full name of baby is " +firstName + " +lastName");
			System.out.println("Gender is " +gender);
			System.out.println("Hair color is " +hairColor);
		}

}
