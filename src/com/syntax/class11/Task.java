package com.syntax.class11;

public class Task {

	public static void main(String[] args) {
		
		String day="Sunday";
		String reverse ="";
		
		for(int i=day.length()-1; i>=0; i--) {
			reverse=reverse+day.charAt(i);
		}
		System.out.println(reverse);

	}

}
