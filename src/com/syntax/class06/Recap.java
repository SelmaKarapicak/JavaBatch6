package com.syntax.class06;

import java.util.Scanner;

public class Recap {
	
	public static void main(String[]args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("What time is it?");
		
		int hour=input.nextInt();
		String timeOfDay;
		
		if(hour>=1 && hour<=11) {
			timeOfDay="It is morning";
		}else if(hour>12 && hour<=15) {
			timeOfDay="It is afternoon";
		}else if(hour>16 && hour<=20) {
			timeOfDay="It is Evening";
		}else {
			timeOfDay="Unknown";
		}
		//if time of day is not unknown-->only then I want to see the message
		if(!timeOfDay.contentEquals("Unknown")) {
		System.out.println("Right now is "+timeOfDay);
		}
		
		
		
		
		
	}

}
