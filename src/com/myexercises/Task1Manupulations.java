package com.myexercises;

public class Task1Manupulations {

	public static void main(String[] args) {
		//1. Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		
		String str="Welcome to Florida";
		
		System.out.println(str.replace(" ", ""));
		
		//2. Create a String that should be combination of letters, numbers and special characters.
		//Find out how many alpha characters are there in the String.
		
		String c="Selmak070791***";
		
		System.out.println(c.replaceAll("[^A-Za-z]", " "));
		
		//3.You have a String a=“Is it saturday? Is it raining? Do we have a Java Class today?” 
		//How would you find out how many sentences are in that String?
		
		String a="Is it Saturday? Is it raining? Do we have a Java Class today?";
		
		System.out.println(a.length());
		
		
		
		
		
		

	}

}
