package com.myexercises;

import java.util.Scanner;

public class Methods {
	
	public static void faktoriyel() {
		
		int num;
		int faktoriyel = 1;
		
		 Scanner scan=new Scanner (System.in);
		 System.out.println("Sayi giriniz");
		 num=scan.nextInt();
		 
		 while(num>1) { 
      
	 faktoriyel=faktoriyel*num;
		 num--;
		 } 
		 System.out.println(faktoriyel);
		 	
	}

	public static void main(String[] args) {
		
		faktoriyel();
		faktoriyel();
		faktoriyel();
		

	}

}
