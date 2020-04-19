package com.myexercises;

import java.util.Scanner;

public class MethodMiddleCharacter {
	//Write a Java method to display the middle character of a string. Go to the editor
	//Note: a) If the length of the string is odd there will be two middle characters.
	//b) If the length of the string is even there will be one middle character.
	//Test Data:
	//Input a string: 350
	//Expected Output:The middle character in the string: 5
	
	static String middle() {
		int position;
		 String character;
		 int length;
		 System.out.println("Enter a character");
		Scanner scan=new Scanner(System.in);
		character=scan.nextLine();
		
		if(character.length()%2==0) {
			position=character.length()/2-1;
			length=2;
		}else {
			position=character.length()/2;
			length=1;
		}
		return character.substring(position, position+length);
	}
	
	 
	 public static void main(String[] args) {
		
		System.out.println(middle()); 
	 }

}
