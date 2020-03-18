package com.syntax.class09;

public class ArrayContinue {

	public static void main(String[] args) {
		
		int[] numbers=new int[3];
		numbers[0]=100;
		numbers[1]=200;
		numbers[2]=300;
		
		//change value of numbers[1]
		numbers[1]=2000;
		System.out.println(numbers[1]+numbers[0]);
		
		System.out.println("========================");
		
		String[] students=new String[3];
		students[0]="Hassna";
		students[1]="Faisal";
		students[2]="Kemal";
		students[3]="Aoran"; // bu olmaz fazla
		
		System.out.println(students[2]);

	}

}
