package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		/*write a program to ask user if there is a sale
		 * if no sale-->not going shopping
		 * if sale ---> we will ask price of the item
		 * based on the price we will apply discount and calculate final price
		 * 
		 * if price less than 20-->apply 10%
		 * if price btw 20 and 100-->apply 20%
		 * if price btw 100 and 500-->apply 30%
		 * if price more than 500-->apply 50%
		 * 
		 * after discount---- the price of the item reduced from original price to final price
		 */
		
		
		String sale;
		double price = 0;
		double discount = 0;
		double finalPrice = 0;
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Do you have sale?");
		sale=scan.nextLine();
		
		if (sale.equalsIgnoreCase("yes")) {
			System.out.println("What is the price of the item?");
		    price=scan.nextDouble();
	
		if(price>20 && price<100) {
			discount=price*0.2;	
		}else if(price>100 && price<=500) {
			discount=price*0.3;	
		}else {
			discount=price*0.5;	
		}	
		finalPrice=price-discount;
		System.out.println("After " + discount + " discount the price of the item reduced from "+price+ " to "+finalPrice);
		}else {
				System.out.println("We wont go shopping" );
			}
		
			
		

	}

}
