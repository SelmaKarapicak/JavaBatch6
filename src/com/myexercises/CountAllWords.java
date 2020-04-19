package com.myexercises;

import java.util.Scanner;

public class CountAllWords {
	//Write a Java method to count all words in a string. Go to the editor
	//Test Data:Input the string: The quick brown fox jumps over the lazy dog.
	//Expected Output:Number of words in the string: 9
	
	static String countWords() {
		
		String input;
		System.out.println("Enter a sentence");
		Scanner scan=new Scanner(System.in);
		input=scan.nextLine();
		
		String[] array=input.split(" ");
		for(int i=0; i<input.length(); i++) {
			//System.out.println(array[i]);
		}
		System.out.println(array.length);
		return input;	
	}
	public static void main(String[] args) {
		countWords();
	}

}
