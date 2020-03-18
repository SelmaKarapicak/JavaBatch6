package com.syntax.class05;

import java.util.Scanner;

public class ScannerLogical0perators {

	public static void main(String[] args) {
		/* Take age input from user then based on the age print output
		 * if age from 0-3   you are baby
		 *        from 4-5   kid
		 *        from6-12   child
		 *        from 13-19 teenager
		 *        from 20-64 adult
		 *  if age more or equal to 65>you are senior
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("How old are you?");
			int age=scan.nextInt();
			
		if (age>0) {	
			if(age<3) {
				System.out.println("You are a baby");
			}else if(age>4 && age<=5) {
				System.out.println("You are a kid");
			}else if(age>6 && age<=12) {
				System.out.println("You are a child");
			}else if(age>13 && age<=19) {
					System.out.println("You are a teenager");
			}else if(age>20 && age<=64) {
				System.out.println("You are an adult");
			}else {
				System.out.println("Enjoy your life");
			}
		}else {
			System.out.println("Please enter valid age");
		}
		
		
		

	}

}
