package com.myexercises;

public class Task {

	public static void main(String[] args) {
	
	   //Create a String that will hold a sentence. Write a program to get a new String without any spaces.
	    
	    String str=" I love Florida";
	    
	    System.out.println(str.replace(" ", ""));
	    
	    //Create a String that should be combination of letters, numbers and special characters. 
	    //Find out how many alpha characters are there in the String.
	    
	    String x="selmak070791$$$";
	    System.out.println(x.replaceAll("[^A-Za-z]", "").length());
	    
	    //You have a String a=“Is it saturday? Is it raining? 
	    //Do we have a Java Class today?” How would you find out how many sentences are in that String?
	    
	    String a="Is it saturday? Is it raining? Do we have a Java Class today? ";
	    
	    int array=a.split("[?]+").length;
	    
	    System.out.println(array);
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
	}

}
