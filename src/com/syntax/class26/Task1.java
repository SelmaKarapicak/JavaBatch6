package com.syntax.class26;

import java.util.ArrayList;

//Create a generic ArrayList that will store 5 names into it. 
//Find out whether the given ArrayList is empty or not? 
//Check whether the specific name is present in an ArrayList or not?
//Find the size of your arrayList and print all values from that

public class Task1 {
	
public static void main(String[] args) {
	
	ArrayList <String> list=new ArrayList<>();
	
	list.add("Selma");
	list.add("Senel");
	list.add("Gulsum");
	list.add("Reyhan");
	list.add("Turker");
	
	boolean flag=list.isEmpty();
	System.out.println(flag);
	
	boolean given=list.contains("Senel");
	System.out.println(given);
	
	System.out.println(list.contains("yunus"));
	
	int size=list.size();
	System.out.println("Arraylist size is "+size);
	
	for(String lists:list) {
		System.out.println("All values are "+lists);
		
		ArrayList <Integer> list2=new ArrayList<>();
		
		list2.add(333);
		
		System.out.println(list2);
	}

	
	
	
}

}
