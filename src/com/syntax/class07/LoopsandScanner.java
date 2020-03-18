package com.syntax.class07;

import java.util.Scanner;

public class LoopsandScanner {

	public static void main(String[] args) {
		// ask users name 5 times and print Good Afternoon 5 time
		
		Scanner input;
		String name=null;
		int num=1;
		
		input=new Scanner(System.in);
		
		while(num<=5) {
		System.out.println("What is your name?");
		
		name=input.nextLine();	
		num++;
		}	
		System.out.println("Good Afternoon "+ name);
		
		//we are playing a lottery and a lucky number is 17
		//we want to keep asking user any number from 1-20
		//until he guess the lucky number -->congrats
		
		System.out.println("Enter number from 1-20");
		
		
		
		
		
		
		
		
		
	}

}
