package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {
		// else if yerine kullaniyoruz kisa yol olarak
	
	    String today;
	    int day=5;
		switch (day) {
		
		case 1:
			today="Monday";
			break;
		case 2:
			today="Tuesday";
			break;
		case 3:
			today="Wednesday";
			break;
		case 4:
			today="Thursday";
			break;
		case 5:
			today="Friday";
			break;
		case 6:
			today="Saturday";
			break;
		case 7:
			today="Sunday";
			break;
		default:
			today="invalid";
		}
		System.out.println("Today is "+ today);
		
		
		
		
		
		
		}
		
		
		
		

	}


