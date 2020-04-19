package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EntrySet {

	public static void main(String[] args) {
		Map <String, String> map=new TreeMap<>();
		map.put("Turkey", "Ankara");
		map.put("USA", "Washington");
		map.put("France", "Paris");
		map.put("Germany", "Berlin");
		
		System.out.println(map);
		
		//storing all entry objects
		Set <Entry<String, String>> entries=map.entrySet();
		System.out.println(entries);
		
		//loop through all entries to get a key and values
		for(Entry<String, String> e:entries) {
			System.out.println("Keys: "+e.getKey());
			System.out.println("Values: "+e.getValue());
			System.out.println(e);
		}
		
		System.out.println("==iterate through all entries to get a key and value");
		
		Iterator <Entry<String,String>> entryit=entries.iterator();
		while(entryit.hasNext()) {
			Entry<String, String> e=entryit.next();
			String keyvalue=e.getKey()+":::"+e.getValue();
			System.out.println(keyvalue);
		}

	}

}
