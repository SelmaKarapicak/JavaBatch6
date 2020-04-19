package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList <String> list=new LinkedList<>();
		list.add("Yunus"); //comes from collection
		list.add(0, "Reyhan"); //comes from List
		list.add("Pavel");
		list.add("Farid");
		list.add("Farid");
		list.add("Farid");
		
		int size=list.size();
		System.out.println(size);
		
		//get all elements 1 by 1 in 3 different ways
		System.out.println(list);
		
		for(String l:list) {
			System.out.println(l);
		}
		System.out.println("===========");
		
		Iterator <String> it=list.iterator();
		while(it.hasNext()) {
			String str=it.next();
			System.out.println(str);
		}
		
		//can we store objects of user defined classes?
		
		LinkedList <Food> food=new LinkedList<>();
		food.add(new Salad("salad","tomato and cucumber",100));
		food.add(new Dessert("dessert","chocolate",1000));
		food.add(new MainDish("pasta","mushrooms",800));
		
		for(Food f:food) {
			f.calories();
			f.foodType();
			f.ingredient();
			
			System.out.println("---------");
		}
		
		
		
		
		
	}

}
