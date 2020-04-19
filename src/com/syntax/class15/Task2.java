package com.syntax.class15;

public class Task2 {
	//Write a method to return whether given number is prime or not?
	
	boolean num(int a) {
		
		boolean prime=true;
		
		if(a>1) {
			for(int i=2; i<a; i++) {
				if(i%2==0) {
				prime=true;	
				}else {
					prime=false;
				}
				
			}
		}
		return prime;
	}

}
