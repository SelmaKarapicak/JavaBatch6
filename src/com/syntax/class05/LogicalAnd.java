package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		/*if declared number is
		 * btw 1-10  small
		 * 11-100--big
		 * 101-1000 --large
		 */

		int day=6;
		// to compare two numbers equality operators
		
		if(day==2 && day==3) {
			System.out.println("Today is SDLC class");
		}else if (day==6 || day==7) {
			System.out.println("Today is JAVA class");
		}else if(day==1 && day==5) {
			System.out.println("Today no class");
		}else {
			System.out.println("Invalid day");
		}
		
		System.out.println("-----------using strings---------------");
		// to compare String we use examples
		
		String day1="Saturday";
		
		if(day1.equals("Tuesday")|| day1.equals("Wednesday")) {
			System.out.println("Today is SDLC class");
		}else if (day1.equals("Saturday") || day1.equals("Sunday")) {
			System.out.println("Today is Java Class");
		}else {
			System.out.println("Invalid day");
		}
		
		
		
		
		
	}

}
