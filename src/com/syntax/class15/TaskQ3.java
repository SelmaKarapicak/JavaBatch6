package com.syntax.class15;

public class TaskQ3 {
	
	void word(String p) {
		
		String reverse="";
		for(int i=p.length()-1; i>=0; i--) {
			reverse+=p.charAt(i);
		}
		
		if(p.equals(reverse)) {
			System.out.println(p+" is a palindrome");
		}else {
			System.out.println(p+" is not a palindrome");
		}
	}

}
