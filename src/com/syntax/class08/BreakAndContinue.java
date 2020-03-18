package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		//once i=4 --> we want to stop the loop
		
		for(int i=1; i<=10; i++ ) {
			
			if(i==4) {
				System.out.println("I am stopping loop");
				break;
			}
			System.out.println("I am inside the loops");
			System.out.println(i);
			
			System.out.println("----------CONTINUE=========");
			
			for(int y=1; y<=10; y++) {
				
				if(y==2) {
					System.out.println("I am skipping iteration");
					continue;
				}
				System.out.println("I am inside the loops");
				System.out.println(y);
				
				
				
				
				
			}
			
			
			
			
		}

	}

}
