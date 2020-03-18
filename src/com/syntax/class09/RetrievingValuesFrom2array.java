package com.syntax.class09;

public class RetrievingValuesFrom2array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String month[][]= {
				{"January","February","December"},
				{"March","April","May"},
				{"June","July","August","Hello","Hi"},
				{"September","October","November"}
		};
		
		int rows=month.length;//how many arrays
		int firstArray=month.length;
		System.out.println(firstArray);
		
		for(int i=0; i<month.length; i++) { //iterates over rows
			for(int j=0; j<month[i].length; j++) { //iterates over columns
				System.out.print(month[i][j]);
			}
			System.out.println();
		}

	}

}
