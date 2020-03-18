package com.myexercises;

import java.util.Scanner;

public class InterviewQuestion {

	public static void main(String[] args) {
	//Welcome
		
		//Write a java program to reverse String? Reverse a string word by word?
		
		Scanner scan=new Scanner(System.in);
		String input;
		String reverse ="";
		
		System.out.println("Enter your input");
		input=scan.nextLine();
		
		for(int i=input.length()-1; i>=0; i--) {
		reverse=reverse+input.charAt(i);
		}
		
             System.out.println(reverse);
	}

}
