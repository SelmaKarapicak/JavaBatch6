package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
	
	//Create an arraylist of cars and retrieve all values using 3 different ways
	//Create an arraylist of words. Remove every word that ends with "e". Use iterator
	
	public static void main(String[] args) {
	
	ArrayList <String> cars=new ArrayList<>();
	cars.add("BMW");
	cars.add("Mercedes");
	cars.add("Toyota");
	
	System.out.println("First way "+cars);
	
	for(String c:cars) {
		System.out.println("Second way "+c);
	}
	cars.addAll(cars);
	System.out.println("3. way "+cars);
	
	ArrayList <String> words=new ArrayList<>();
	words.add("fridge");
	words.add("three");
	words.add("two");
	
	Iterator <String> it=words.iterator();
	
	while(it.hasNext()) {
	if(it.next().endsWith("e")) {
			it.remove();
		}
	}
	
	System.out.println("After removing elements which ends e "+words);
	}
}
