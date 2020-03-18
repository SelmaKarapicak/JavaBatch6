package com.syntax.class09;

public class RecapSunday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cities= {"Washington","New York","Dallas","Los Angeles","Miami"};
		
		System.out.println("I live in "+cities[2]);
		
		int x=1;
		System.out.println(cities[x]);
		x+=3;
		System.out.println("I moved to "+cities[x]);
		
		System.out.println("=================");
		
		//how many elements stored inside an array?
		int arraySize=cities.length;
		System.out.println("Total elements "+arraySize);
		
		System.out.println("====================");
		
		//how we can access last element from an array?
		System.out.println(cities[arraySize-1]);
		
		System.out.println("================");
		
		//access all elements from an array
		for(int i=0; i<arraySize; i++) {
			System.out.println(cities[i]);
		}

	}

}
