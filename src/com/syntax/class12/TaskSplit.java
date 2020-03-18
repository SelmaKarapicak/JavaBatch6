package com.syntax.class12;

public class TaskSplit {

	public static void main(String[] args) {
		//Create a String that will hold a sentence. 
		//Write a program to get a new String without any spaces.
		
		String sentence="Today is my busy day";
		
		String x=sentence.replace(" ", "");
		System.out.println(x);
		
		//Create a String that should be combination of letters, numbers and special characters. 
		//Find out how many alpha characters are there in the String.
		
		String character="Today is my birthday 0706 **8@@22";
		
		String all=character.replaceAll("[^A-Za-z]", " ");
		System.out.println(all);
		
		
		
		
		
		
		
		

	}

}
