package com.syntax.class09;

public class RetrieveElements {

	public static void main(String[] args) {
		
		char[] grades= {'A','B','C','D','E','F'};
		//getting all elements
		for(int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
		}
		
		System.out.println("--PRINTING USING ADVANCED FOR LOOP");
		
		for(char grade:grades) {
			System.out.println(grade+" ");
		}
		
		System.out.println("=======================");
		
		//create an array of fruits and retrieve all elements
		
		String[] fruits= {"Banana","Kiwi","Apple","Mango"};
		
		//advanced for loop
		for(String fruit:fruits) {
			
			if(fruit.equals("Apple")) {
				System.out.println("Your favourite food "+ fruit);
			}else
			System.out.println(fruit);
		}
		
		System.out.println("====================");
		
		//fruits.length=number of element
		for(int x=0; x<fruits.length; x++) {
			System.out.println(fruits[x]);
		}
		
		
		

	}

}
