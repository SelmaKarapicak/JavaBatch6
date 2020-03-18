package com.myexercises;

import java.util.Scanner;

public class SumEvenForLoop {

	public static void main(String[] args) {
		
		
		Scanner scan;
		int num;
		int total = 0;
		
		scan=new Scanner(System.in);
		System.out.println("Enter positive number");
		num=scan.nextInt();
		
		while(num!=-1) {
			total+=num;
			System.out.println();
		}
		
		
		

	}

}
