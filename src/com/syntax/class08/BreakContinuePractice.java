package com.syntax.class08;

public class BreakContinuePractice {

	public static void main(String[] args) {
		// write a program that print numbers from 1-20
		//I dont want to print 5,6,7
		
		for(int i=1; i<21; i++) {
			
			if(i==5 || i==6 || i==7) {
				continue;                   // continue skip yapiyor current yazdigini
				                              //break devam ettirmiyor
			}
			System.out.println(i);
		}
		
		System.out.println("--------------Ex Cont----------------");
		//1 den 100 yaz 35-55 arsi yazma
		
		for( int i=1; i<=100; i++) {
			
			if(i>=35 && i<=55) {
				continue;
			}
			System.out.println(i);
		}
		
		

	}

}
