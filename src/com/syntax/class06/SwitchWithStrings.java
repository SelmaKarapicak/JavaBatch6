package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {

	public static void main(String[] args) {
		/* ask a user where she is from
		 * based on country we will define fav food
		 * your fav food is ----
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		String country=scan.nextLine();
		String favFood;
		
		switch (country) {
		case "Morocco":
			favFood="couscous";
			break;
			
		case "Belarus":
			favFood="Potato";
			break;
			
		case "Tajikistan":
			favFood="Osh";
			break;
			
		case "Turkey":
			favFood="Baklava";
			break;
			default:
				favFood="Unknown";
		}
		
		System.out.println("Your favourite food is "+favFood);
	

	}

}
