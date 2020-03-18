package com.syntax.class04;

import java.util.Scanner;

public class Task2Scanner {

	public static void main(String[] args) {
		
		Scanner ques=new Scanner(System.in);
		
		System.out.println("What is your age?");
		
		int age=ques.nextInt();
		
		if(age>=18) {
			System.out.println("Issue a driver licence");
		}else {
			System.out.println("Get a learners permit");
		}
		
		
		
	}

}
