package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {
		/*You are a salesman
		 * ask a user how much his sales are
		 * based on the amount of sales we need to calculate commission
		 * if sales is btw 1-100 ---> commission should be %10
		 *  if sales is btw 100-200-->commisioun wil be 20%
		 *                  200-500-->                 30%
		 *             more 500--->     should be 50%
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your sales amount?");
		double sales;
		double commission;
		sales=scan.nextDouble();
		
		if(sales>1 && sales<=100) {
			commission=sales*0.10;	
		}else if(sales>100 && sales<=200) {
			commission=sales*0.2;
		}else if(sales>200 && sales<=500) {
			commission=sales*0.30;
		}else {
			commission=sales*0.5;
			}
		System.out.println("Based on your sales your commission is "+commission);
		
		if(commission>100) {
			System.out.println("You are an awesome seller");
		}
		
		
		
		
		
		
		
	}

}
