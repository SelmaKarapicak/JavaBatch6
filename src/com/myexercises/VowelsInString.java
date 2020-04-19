package com.myexercises;

import java.util.Scanner;

public class VowelsInString {
	//Write a Java method to count all vowels in a string. Go to the editor
	//Test Data:Input the string: w3resource
	//Expected Output:Number of  Vowels in the string: 4
	
	static String vowels() {
		
		String input;
		System.out.println("Enter a string");
		Scanner scan=new Scanner(System.in);
		input=scan.nextLine();
		
		System.out.println(input.replaceAll("[^aAeEiIoOuU]", "").length());
		return input;
		
	}
	public static void main(String[] args) {
		vowels();
	}

}
