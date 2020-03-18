package com.syntax.class04;

import java.util.Scanner;

public class ScannerandVerification {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter first number");
		
		int num1=input.nextInt();
		
		System.out.println("Please enter second number");
		
		int num2=input.nextInt();
		
		if(num1>num2) {
			System.out.println(num1 +" is bigger than "+num2);
		}
		else if(num1==num2) {
			System.out.println(num1+ " is equal to "+num2);
		}
		
		else {
			System.out.println(num2+" is bigger than "+num1);
		}
		
		

	}

}
