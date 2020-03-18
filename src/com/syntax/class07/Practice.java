package com.syntax.class07;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		//we are playing a lottery and a lucky number is 17
		//we want to keep asking user any number from 1-20
		//until he guess the lucky number -->congrats
		
		Scanner scan;
		int num;
		int luckyNum=17;
		scan=new Scanner(System.in);
		
	    do {
	    	System.out.println("Enter number from 1-20");
	    	num=scan.nextInt();
	   
	    }
	    while(num!=luckyNum) ;
	    System.out.println("Congrats");
	    
	    
	    }	
	
	    }
	


