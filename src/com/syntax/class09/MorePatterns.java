package com.syntax.class09;

public class MorePatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<5; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("PRINTING 5 ROWS OF 1-9");
		
		for(int x=1; x<=5; x++) {
			
			for(int y=1; y<=9; y++) {
				System.out.print(y);
			}
			System.out.println();
		}

	}

}
