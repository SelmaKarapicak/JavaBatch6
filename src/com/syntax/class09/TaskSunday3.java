package com.syntax.class09;

import java.util.Scanner;

public class TaskSunday3 {

	public static void main(String[] args) {
		
		String[] countries= {"Turkey","USA","Germany","France"};
		

		for(String country:countries) {
			
			if(country.equals("Turkey")) {
			System.out.println("The capital of "+country+" is Ankara");
			
			}else if(country.equals("USA")) {
				System.out.println("The capital of "+country+" is Washington");
				}
				else if(country.equals("Germany")) {
					System.out.println("The capital of "+country+" is Berlin");
				}
				else if(country.equals("France")) {
					System.out.println("The capital of "+country+" is Paris");
				}
				else 
			      System.out.println("Unknown");
		}
		
		//2.way
		
		for(int y=0; y<countries.length; y++) {
			
			switch(countries[y]) {
			
			case "USA":
				System.out.println("The capital is Washington DC");
				break;
				
			case "Turkey":
				System.out.println("The capital is Ankara");
				break;
				
			case "France":
				System.out.println("The capital is Paris");
				break;
			}
		}
		
	}

}
