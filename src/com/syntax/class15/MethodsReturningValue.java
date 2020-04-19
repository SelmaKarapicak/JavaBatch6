package com.syntax.class15;

public class MethodsReturningValue {
	
	public static void main(String[] args) {
		//create a string and based on the length of the String
		//we define whether String is short or long
		
		String str="Hello my friend";
		
		int length=str.length();
		if(length>10) {
			System.out.println("String is long");
		}else {
			System.out.println("String is short");
		}
	
		//compare 2 numbers and then we identify whether largest
		
		MethodsReturningValue obj=new MethodsReturningValue();
		int num=obj.largest(10, 20);
		System.out.println(num);
}
		//create a method that returns largest num from 2 given nums
		int largest (int a, int b) {
			int largest;
			if(a>b) {
				largest=a;
			}else {
				largest=b;
			}
			return largest;
		}
	
		boolean isOdd(int num) {
			boolean isOdd;
			
			if(num%2==0) {
				isOdd=false;
			}else {
				isOdd=true;
			}
			
		}
		
		
		
		
		
	}

}
