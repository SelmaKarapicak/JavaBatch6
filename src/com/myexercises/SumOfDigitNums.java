package com.myexercises;

import java.util.Scanner;

public class SumOfDigitNums {
	//Write a Java method to compute the sum of the digits in an integer. Go to the editor
	//Test Data:Input an integer: 25
    //Expected Output:The sum is 7 
	
	static int digitNum () {
		int num;//girdigin numara
		int rem=0;// remainder==>kalan sayi
		int sum = 0;// toplami
		
		System.out.println("Enter an integer");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		
		//256 dusun
		while(num>0) {
			rem=num%10;//kalan 6 
			sum=sum+rem;//burdada kalanlari ekle
			num=num/10;//25 kaldi?10 a bol tekrar yukarda topla
		}
		System.out.println(sum);
		return sum;
		
		
		
	}
	public static void main(String[] args) {
		digitNum ();
	}

}
