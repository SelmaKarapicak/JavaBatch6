package com.syntax.class08;

import java.util.Scanner;

public class Task4Quest {

	public static void main(String[] args) {
		// Write a program to ask a user to enter item they want to buy and the price of that item. 
		//Every time user enters money accumulate the amount and tell the user how much is left to pay off the amount.
		//If user give more money program should return a change. 
		//Whenever a user done with payments program should say “Thank you for shopping!”
		
		Scanner scan;
		String item;
		double price;
		double money;
		double amount=0;
		double change;
		double balance;
		
		scan=new Scanner(System.in);
		System.out.println("what do you want to buy?");
		item=scan.nextLine();
		System.out.println("Enter price of " +item);
		price=scan.nextInt();
		
		do {
			System.out.println("Please give payment");
			money=scan.nextDouble();
			amount=amount+money;
			
			if(amount<price) {
				balance=price-amount;
				System.out.println("Please give more "+ balance);
			}else if(amount>price) {
				change=amount=price;
				System.out.println("Here is your change "+change);
				break;
			}
			
			
		}
		
	
	

	}

}
