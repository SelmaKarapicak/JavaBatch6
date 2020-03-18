package com.syntax.class04;

import java.util.Scanner;

public class HWTask2 {

	public static void main(String[] args) {
	
		Scanner input= new Scanner(System.in);
		
		System.out.println("What is your worked years?");
		int years=input.nextInt();
		
        System.out.println("What is your annual salary?");
		
		int salary=input.nextInt();
		
		
		if (years>=5) {
			System.out.println("You are eligible for the bonus!");
		
		
		if(salary>50000) {
			System.out.println("You have 5000 bonus");
		}else {
			System.out.println("You have 3000 bonus");
		}
		
		
		} else {
			System.out.println("You are not eligible for the bonus");
		}
		
		
	}

}
