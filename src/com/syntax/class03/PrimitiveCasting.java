package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d=10;
		System.out.println(d); //10.0
		
		//int i=10.99;-- error saying
		//type mismatch, cannot covert double to it
		
		//narrowing, explicitly implementing
		
		int i=(int)10.99;
		System.out.println(i);
		
		//byte -128 to 127
		byte b=(byte)1280;
		System.out.println(b);

		
	}

}
