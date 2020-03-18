package com.syntax.class09;

public class Task2 {

	public static void main(String[] args) {
		// Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).
		
		String[] names=new String[6];
		names[0]="Selma";
		names[1]="Reyhane";
		names[2]="Senel";
		names[3]="Gulsum";
		names[4]="Yunus";
		names[5]="Turker";
		
		System.out.println(names[0]);
		
		//2. way
		
		String[] name= {"Selma","Reyhane","Gulsum","Senel","Yunus","Turker"};
		
		System.out.println(name[0]);

	}

}
