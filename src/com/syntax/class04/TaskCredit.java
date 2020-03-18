package com.syntax.class04;

import java.util.Scanner;

public class TaskCredit {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		
		boolean card=input.nextBoolean();
		if(card) {
			System.out.println("What is your balance?");
		
		int balance=input.nextInt();
		
		if(balance>1000) {
			System.out.println("Pay off immediately");	
		}else {
			System.out.println("You can spend more");
		}
		
		
		
		
		
		
		
		
		}else {
			System.out.println("Would you want to card?");
		}

	}

}
