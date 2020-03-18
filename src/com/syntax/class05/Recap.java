package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		Scanner scan;
		int quiz;
		int midterm;
		int finalex;
		int averagescore;
		scan=new Scanner(System.in);
		System.out.println("Enter your quiz score");
		quiz=scan.nextInt();
		System.out.println("Enter your midterm score");
		midterm=scan.nextInt();
		System.out.println("Enter your final exam score");
		finalex=scan.nextInt();
		averagescore=(quiz+midterm+finalex)/3;
		
		if(averagescore>=90){
			System.out.println("Your grade is A");
		} else if (averagescore>=70 && averagescore<90){
			System.out.println("Your grade is B");
		}else if(averagescore>=50 && averagescore<70){
			System.out.println("Your grade is C");
		}else if (averagescore<50) {
			System.out.println("Your grade is D");
		}
	
		
		
		
	

	}

}
