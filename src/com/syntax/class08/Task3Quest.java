package com.syntax.class08;

import java.util.Scanner;

public class Task3Quest {

	public static void main(String[] args) {
		//Write a program that reads a range of integers (start and end point), provided by a user
		// and then from that range prints the sum of the even and odd integers.

		Scanner scan;
		int num1;
		int num2;
		int evensum = 0;
		int oddsum = 0;
		
		scan=new Scanner(System.in);
		System.out.println("Enter numbers from 1 to 100");
		num1=scan.nextInt();
		num2=scan.nextInt();
		
		for(int x=num1; x<=num2; x++) {
			
			if(x%2==0) {
				evensum=evensum+x;
			}else {
				oddsum=oddsum+x;
			}
		}
			System.out.println(evensum);
			System.out.println(oddsum);
		}
		
	}


