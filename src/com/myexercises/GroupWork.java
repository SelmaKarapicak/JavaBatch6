package com.myexercises;

import java.util.Scanner;

public class GroupWork {

	public static void main(String[] args) {
		//write a program which return "fizz" if the number is a multiplier of 3, 
		//return "buzz" if its multiplier of 5 and return "fizzbuzz" if the number is divisible by both 3 and 5.
		//If the number is not divisible by either 3 or 5 then it should just return the number itself.
		
		Scanner scan;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter a number");
		int num=scan.nextInt();
		
		if (num%3==0 && num%5!=0) {
			System.out.println("fizz");
		}else if(num%5==0 && num%3!=0) {
			System.out.println("buzz");
		}else if(num%3==0 && num%5==0) {
			System.out.println("fizzbuzz");
		}else  {
			System.out.println(num);
		}



	}

}
