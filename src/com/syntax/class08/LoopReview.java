package com.syntax.class08;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {
		/*ask user to pay for a candy
		 * entered price is not 2 we need to keep asking for paying
		 * amount correct>"Enjoy your candy"
		 */
		
		Scanner scan;
		double price;
		
		scan=new Scanner(System.in);
		
		do {
		System.out.println("Pay for a candy");
		price=scan.nextDouble();
		
		}while(price!=2);{
			
			System.out.println("Enjoy your candy");		
		}
		
		
		
		
		//2. way
		
       while(price!=2);
       System.out.println("Pay for a candy");
       price=scan.nextDouble();
       {
    	   System.out.println("Enjoy your candy");		
		}

		
		
		
		
		
		
	}

}
