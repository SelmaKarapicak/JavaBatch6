package com.myexercises;

public class MergeTwoStrings {
	
static String mixString(String s1, String s2){
	    
	    String firstValue ="";
	    int length;
	    
	    if(s1.length()>s2.length()){
	      length=s1.length();
	    }else {
	    	length=s2.length();
	    }
	    for(int i=0; i<length; i++) {
	    	if(i<s1.length()) {
	    		firstValue+=s1.charAt(i);
	    	}
	    	if(i<s2.length()) {
	    		firstValue+=s2.charAt(i);
	    	}
	    }
		return firstValue;
	  }
		
		public static void main(String[] args){
		  String firstValue = mixString("12345","abcde"); 
			System.out.println(firstValue); 
			String secondValue = mixString("howdy","hello");
			System.out.println(secondValue); 
		}
		  
	   

}
