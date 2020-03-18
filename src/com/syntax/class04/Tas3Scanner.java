package com.syntax.class04;

import java.util.Scanner;

public class Tas3Scanner {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("What is your city ?");
		
		String city=input.nextLine();
		
		System.out.println("What is temperature?");
		
		double temperature=input.nextDouble();
		
		double fah=75;
		double cel=(fah-32)*5/9;
		
		
		
		System.out.println("The temperature in the "+ city +" is "+cel);
		
		
		
		

	}

}
