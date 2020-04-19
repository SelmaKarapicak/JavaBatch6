package com.myexercises;

public class Main {
	
	     final String method(String h){
		 
		   for(int i=h.length()-1; i>=0; i--){
		     
		      System.out.print(h.charAt(i));
		    }
		    return h;
		  }
		  
		    public static void main(String[] args){
		   Main obj=new Main();
		   obj.method("hello");
		   
		    
		   
		  
		}

			

}
	