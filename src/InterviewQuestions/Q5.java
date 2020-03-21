package InterviewQuestions;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// Write a java program to reverse String? Reverse a string word by word?
		
		Scanner scan;
		String input;
		String reverse = "";
		
		System.out.println("Enter a string");
		scan=new Scanner(System.in);
		input=scan.nextLine();
		
		for(int i=input.length()-1; i>=0; i--) {
			reverse=reverse+input.charAt(i);
		}
		
		System.out.println(reverse);

	}

}
