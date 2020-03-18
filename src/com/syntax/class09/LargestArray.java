package com.syntax.class09;

public class LargestArray {

	public static void main(String[] args) {
		// find largest element from an array
		
		int[] nums= {200, 30, -1, 900, 56, 787};
		
		int largest=nums[1];
		
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i]>largest) {
				largest=nums[i];
			}
		}
			
System.out.println("Largest num is "+largest);
	}

}
