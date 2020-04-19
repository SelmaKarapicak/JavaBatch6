package com.syntax.class17;

public class Task1 {
	//Create a method that will accept an array as parameters and will return a sum of all elements from that array. 
	//Method should be visibly only within same package and accessible by the creating an instance of the class.
	
	 protected int array(int[] nums) {
		 
	int sum=0;
	for(int i=0; i<nums.length; i++) {
		sum=sum+nums[i];
	}
	return sum;
	}
	
	public static void main(String[] args) {
		
		Task1 obj=new Task1();
		
		int[] num= {2,6,9,7};
		
	System.out.println(obj.array(num));
		
		
	}

}
