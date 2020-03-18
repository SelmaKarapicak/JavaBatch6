package com.syntax.class09;

public class TasksSunday {

	public static void main(String[] args) {
		
		String[] animals= {"Cat","Dog","Bird","Rabbit","Monkey","Donkey"};
		
		for(int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		
		System.out.println("============2. way Advanced Loop=============");
		//2.way
		
		for(String animal:animals) {
			System.out.println(animal);
		}

	}

}
