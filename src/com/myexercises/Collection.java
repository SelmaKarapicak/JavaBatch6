package com.myexercises;

import java.util.ArrayList;

public class Collection {
	
	public static void main(String[] args) {
	
	//list1 can only store String objects
	ArrayList<String> list1=new ArrayList();
	
	//list2 can store any type of objects
	ArrayList list2=new ArrayList();
	
	//add data in list
	list1.add("Gulsum");
	list1.add("Selma");
	
	list2.add("Senel");
	list2.add(30);
	list2.add(20);
	list2.add(30.3);
	list2.addAll(list2);
	
	
	System.out.println("List1 is : "+list1);
	System.out.println("List2 is "+ list2);
	
	list2.remove(2);
	System.out.println(list2);
	

	
	}
}
