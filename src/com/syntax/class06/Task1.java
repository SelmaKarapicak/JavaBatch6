package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scan;
		String country;
		String language;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();

		switch (country) {
		
		
	case "Turkey":
			language="Turkish";
			break;
			
		case "USA":
			language="American";
			break;
			
		case "Russia":
			language="Russian";
			break;
			
		default:
				language="Unknown";
			}
		
		System.out.println("Your country is "+country+" and language is "+language);
			

	}

}
