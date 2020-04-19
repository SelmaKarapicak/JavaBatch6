package com.syntax.class16;

public class MethodsRecap {
	
	int getLargest(int[] array) {
		//create a method that will accept array of int and return max element
		
		int largest=array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i]>largest) {
				largest=array[i];			
				}
		}
		return largest;
	}
	//create a String that will accept a String and return each word from a String
	
	String[] getWordsFromString(String str) {
		
		String[] array=str.split(" ");
		return array;
			
	}
	public static void main(String[] args) {
		MethodsRecap obj=new MethodsRecap();
		int[] arr= {10,20,40};
		System.out.println(obj.getLargest(arr));
		
		String myString="I love Florida";
		String[] words=obj.getWordsFromString(myString);
		
		for(String word:words) {
			System.out.println(word);
		}
	}

}
