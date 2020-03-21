package com.myexercises;

public class Review {

	public static void main(String[] args) {
		
		int[][] num = { { 7, 1, 6, 12 }, { 9, 6, 2, 8 }, { 3, 0, 8, 5 } };
        // Iterating a 2D Array
        int rows = num.length;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < num[row].length; col++) {
                int element = num[row][col];
                System.out.print(element + " ");
            }
            System.out.println();
        }
        // Sum a all elements in a 2D Array
        int sum = 0;
        // iterating rows
        for (int row = 0; row < num.length; row++) {
            // iterating elements of a row
            for (int col = 0; col < num[row].length; col++) {
                sum += num[row][col];
            }
        }
        System.out.println("The sum of all number is " + sum);
        
        System.out.println("==============");
        
        int[][][] ddd = {{{3,90,7},{56,78,2}},{{8,5,12,0},{40,67},{80,54}}};
		int sum1=0;	
		for(int[][] x:ddd) {
		for(int[] y:x) {
		for(int z:y) {
	      sum1+=z;
		}
		}
		}
		System.out.println(sum1);


	}

}
