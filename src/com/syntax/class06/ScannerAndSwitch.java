package com.syntax.class06;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {
		/* ask user a gender: M or F
		 * based on gender will provide description
		 * 
		 */
      
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter gender M or F");
		char gender=scan.next().charAt(0);
		String genderType;
		
		switch(gender) {
		
		case 'M':
			genderType="Male";
			break;
			
		case 'F':
		    genderType="Female";
		    break;
		    default:
		    	genderType="Unknown";
		
			}
		
		System.out.println("Your gender is "+genderType);
		
		
		
		
	}

}
