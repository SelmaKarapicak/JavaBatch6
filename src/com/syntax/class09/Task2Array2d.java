package com.syntax.class09;

public class Task2Array2d {

	public static void main(String[] args) {
		// Create a 2D array that first row will contain 4 names and second row will contain grades. 
		//Then you program should print name of the students that has A and B grade
		
		String[][] name= { {"Selma","Reyhane","Gulsum","Senel"},{"A","B"} };
		
		System.out.println(name[0][0]+" "+name[1][0]);
		System.out.println(name[0][1]+" "+name[1][1]);
		System.out.println(name[0][2]+" "+name[1][1]);
		System.out.println(name[0][3]+" "+name[1][0]);

	}

}
