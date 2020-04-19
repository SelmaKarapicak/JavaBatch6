package com.myexercises;

public class 	AnotherClass {
	
	static int maxValue(int[] arr){
	    int largest=arr[3];
	    
	    for(int i=0; i<arr.length; i++){
	      if(arr[i]>largest){
	        largest=arr[i];
	      }
	    }
	    return largest;
	  }
		public static void main(String[] args) {
			int[] arr = {5,12,-3,7,3,22};
			System.out.println(maxValue(arr)); //should print 22
		}
		  
		}


