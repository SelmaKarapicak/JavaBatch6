package com.syntax.class09;

public class TaskPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int x=5; x>=1; x--) {
			for(int y=1; y<=x; y++) {
				System.out.print(x);
			}
			System.out.println();
		}

     System.out.println("-----------------");
     
     for(int i=1; i<=5; i++) {
    	 for(int j=1; j<=i; j++) {
    		 System.out.print("*"+" ");
    	 }
    	 System.out.println();
     }
     for(int i=4; i>=1; i--) {
    	 for(int j=1; j<=i; j++) {
    		 System.out.print("*"+" ");
    	 }
    	 System.out.println();
     }
     
	}

}
