package com.myexercises;

import java.util.Scanner;

public class LoopsExercises {

	public static void main(String[] args) {
		// Write a program to find the factorial value of any number entered through the keyboard. 
		
		Scanner scan;
		int num;
		int sum=1;
		scan=new Scanner(System.in);
		System.out.println("Enter any number");
		num=scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			sum*=i;
		}
		System.out.println(sum);
		
		
		
		

	}

}
