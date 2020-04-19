package com.myexercises;

public class Array {

	protected static int maxLength (String[] arr){
		  
		  int largest=arr[0].length();
		  for(int i=0; i<arr.length; i++){
		    if (arr[i].length()>largest){
		      largest=arr[i].length();
		    }
		  }
		return largest;
		  
		  
	}
	
	
public static void main(String[] args) {
			String[] arr = {"hey","yolo","hi","this is long"};
			System.out.println(maxLength(arr));
			//should print "this is long"
		}

}
