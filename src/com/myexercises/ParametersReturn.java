package com.myexercises;

public class ParametersReturn {
	
	public static int besicarpma(int a) {
		return a*5;
	}
		
		public static int dortcikar(int a) {
		
		return a -4;
	}
		public static int ikicarpma(int a) {
			
			return a*2;
		}
		public static int dokuzekleme(int a) {
			
			return a+9;
		}

	public static void main(String[] args) {
		
		System.out.println("Sonuc "+ dokuzekleme(ikicarpma(dortcikar(besicarpma(3)))) );
		
		

	}

}
