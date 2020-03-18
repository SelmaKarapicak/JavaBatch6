package com.syntax.class04;

import java.util.Scanner;

public class TaskScanner {

	public static void main(String[] args) {
		
		Scanner loan=new Scanner(System.in);
		
		System.out.println("What is the amount of loan is needed?");
		
		int amount=loan.nextInt();
	 
		if(amount<=200.000) {
			System.out.println("Lend the money");
		}else {
			System.out.println("Reject the client");
		}
		
		

	}

}
