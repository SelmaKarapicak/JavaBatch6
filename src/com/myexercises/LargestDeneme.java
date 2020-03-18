package com.myexercises;

public class LargestDeneme {

	public static void main(String[] args) {
		// find smallest number 50; 200,5,90
		
		int[]num= {50,200,5,90};
		
		int smallest=num[3];
		
		for(int i=0; i<num.length; i++) {
			if(num[i]<smallest) {
				smallest=num[i];
			}			
		}
		System.out.println(smallest);

	}

}
