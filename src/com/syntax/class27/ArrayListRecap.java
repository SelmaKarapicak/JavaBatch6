package com.syntax.class27;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListRecap {

	public static void main(String[] args) {
		
		//lets arraylist taht store double type of objs
		//generic arraylist
		
		ArrayList <Double> list=new ArrayList<>();
		list.add(10.43);
		list.add(12.67);
		list.add(100.90);
		
		System.out.println(list);
		System.out.println(list.size());
		
		//replace element
		list.set(1, 12.89);
		System.out.println(list);
		
		//remove element
		list.remove(12.89);
		System.out.println(list);
		
		//retrieve single element
		System.out.println(list.get(1));
		
		//retrieve all elements from collection
		//1. use advanced/enhanced for loop
		for(double a:list) {
			System.out.println(a);
		}
		//2. for loop
		
		//3. Iterator
		Iterator <Double> iterator=list.iterator();
		while(iterator.hasNext()) {
			double d=iterator.next();
			System.out.println(d);
		}
		
		
		System.out.println("====Non generics====");
		
		//2. non generic collction/arraylist
		ArrayList obj=new ArrayList();
		obj.add("hello");
		obj.add(10);
		obj.add('c');
		obj.addAll(list);//store collection objects
		
		System.out.println(obj);
		
		//retrieve all elements from collection
		for(Object o:obj) {
			System.out.println(o);
		}
		

	}

}
