package com.syntax.class09;

public class Re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
			
			int[] largest=a[0];
			
			for(int i=0; i<a.length; i++ ){
			  
			  if(a[i]>largest){
			  largest=a[i];
			  
			}
	}

	System.out.println(largest);
	}

}
