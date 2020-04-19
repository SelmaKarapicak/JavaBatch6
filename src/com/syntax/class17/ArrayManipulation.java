package com.syntax.class17;

public class ArrayManipulation {
	
	public int largestNumber(int[] array) {
		int largest = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i]>largest) 
				largest=array[i];
			}
		return largest;
			
		}
		
		
		int smallestNumber (int[] array) {
			int smallest=array[0];
			for(int num:array) {
				if(num<smallest) {
					smallest=num;
				}
			}
			return smallest;
		}	
	
	
	public static void main(String[] args) {
		
		int[] arr= {5,2,9,7,1};
		
		ArrayManipulation obj=new ArrayManipulation();
		int largest=obj.largestNumber(array);
		System.out.println("largest num is "+largest);
		
		System.out.println("smallest num is "+obj.smallestNumber(array));
		

	}

}
