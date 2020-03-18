package com.syntax.class08;

import java.util.Scanner;

public class Task2Quest {

	public static void main(String[] args) {
		// Create a program that will be asking user to apply for a credit card 10 times. As soon you get an “yes” from a user program should stop asking.
		
		Scanner scan;
		String creditcard=null;
		
		scan=new Scanner(System.in);
		for(int x=1; x<=10; x++) {
			System.out.println("Apply for a credit card");
			creditcard=scan.nextLine();
			
			if(creditcard.equals("yes")) {
				System.out.println("Stop asking");
				break;
			}
		}
		
		
		
		
		
		}
	}


