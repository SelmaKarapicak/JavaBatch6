package com.syntax.class12;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		 System.out.println("What is Mom's first name");
		 String name1=scan.nextLine();
		 
		 System.out.println("What is Dad's first name");
		 String name2=scan.nextLine();
		 
		 System.out.println("Boy or Girl");
		 String babyName=scan.nextLine();
		 String SuggestedBName=null;
		 int half1=name1.length()/2;
		 int half2=name2.length()/2;
		 if(babyName.equalsIgnoreCase("Girl")) {
			 SuggestedBName=name1.substring(0,half1)+name2.substring(half2);
			 System.out.println(SuggestedBName);
			 
		 }else if(babyName.equalsIgnoreCase("Boy")) {
			SuggestedBName=name2.substring(0,half2)+name1.substring(half1);
			 System.out.println(SuggestedBName);
		 }

		
	}

}
