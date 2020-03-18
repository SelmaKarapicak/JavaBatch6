package com.syntax.class08;

public class PracticeLoopss {

	public static void main(String[] args) {
		// calculate sum of odds and sum of even numbers 1 to 99
		
		int evensum=0;
		int oddsum=0;
		for(int x=1; x<=99; x++ ) {
			
			if(x%2==0) {
				evensum=evensum+x;
			}else {
				oddsum=oddsum+x;
			}
		}

		System.out.println("Sum of evenn= "+evensum);
			
		System.out.println("Sum of odds= "+oddsum);
			
			
			
			
		}

	}


