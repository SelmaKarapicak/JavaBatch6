package com.syntax.class11;

public class Example2Array {

	public static void main(String[] args) {
		// Lets create 2d array in which we store professions
		
		String[][] professions= {
				{"QA Tester","Developers","Product Owner","Scrum Master"},
				{"Math Teacher","Science Teacher","ESL Teacher"},
				{"Dentist","Surgeon"}
		};
		
		//get elements using advanced for loop
		
		for(String[] occupation:professions) {
			for(String m:occupation) {
				System.out.print(m+" ");
			}
		}

	}

}
