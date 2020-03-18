package com.syntax.class06;

import java.util.Scanner;

public class CalculatorHw {

	public static void main(String[] args) {
		Scanner scan;
		double num1;
		double num2;
		
	    scan=new Scanner(System.in);
		System.out.println("Enter first number");
		num1=scan.nextDouble();
		System.out.println("Enter second number");
		num2=scan.nextDouble();
		System.out.println("Enter the operator: +,-,*,/ ");
		char operator=scan.next().charAt(0);
		double result = 0;
		
		
		
		switch(operator) {
		case '+':
		result=num1+num2;
		break;
		case '-':
		result=num1-num2;
			break;
		case '*':
		result=num1*num2;
			break;
		case '/':
		result=num1/num2;
			break;
		}
		
		System.out.println("Result of "+num1+operator+num2+"="+result);
		
		

	}

}
