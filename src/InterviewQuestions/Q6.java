package InterviewQuestions;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// Write a Java Program to find whether a String is palindrome or not?
		
		Scanner scan;
		String input;
		String reverse = "";
		
		System.out.println("Enter a word");
		scan=new Scanner(System.in);
		input=scan.nextLine();
		
		for(int i=input.length()-1; i>=0; i--) {
			reverse=reverse+input.charAt(i);	
			}
		
		if(input.equals(reverse)) {
			System.out.println("It is a palindrom");
		}else {
			System.out.println("It is not a palindrom");
		}
		
		


	}

}
