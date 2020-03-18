package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
	
		boolean isFriday=true;
		int date=10;
		
		if (isFriday) {
			System.out.println("Today is Friday, I am going to a movie");
			
			if(date==13) {
				System.out.println("I will watch scary movie");
			} else {
				System.out.println("I will watch a comedy");
			}
			
			
		} else {
			System.out.println("Today is not Friday, I am staying at home");
		}
		
		
		
		
		

	}

}
