package com.myexercises;

public class WhileDemo {

	public static void main(String[] args) {
		//sum of even and odd numbers
		
		int num=1;
		int sumOdd=0;
		int sumEven=0;
		
		while(num<=50) {
			if(num%2==0) {
				sumEven+=num;
			}else {
				sumOdd+=num;
				
			}
			num++;		
		}
		System.out.println("sumodd is "+ sumOdd);
		System.out.println("sumEven is "+ sumEven);
		


	}

}
