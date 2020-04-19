package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Countries {

	public static void main(String[] args) {
		
		Map<String, String> map=new TreeMap<>();
		map.put("Turkey", "Ankara");
		map.put("USA", "Washington");
		map.put("France", "Paris");
		map.put("Germany", "Berlin");
		
		System.out.println(map);
		
		for(String m:map.keySet()) {
			System.out.println("Key: "+m);
		}
		
		Iterator<String> it=map.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(String v:map.values()) {
			System.out.println("Values: "+v);
		}
		
		Iterator<String> it2= map.values().iterator();
		while(it2.hasNext()) {
			System.out.println("Values with iterator "+it2.next());
		}
		
	
		
		

	}

}
