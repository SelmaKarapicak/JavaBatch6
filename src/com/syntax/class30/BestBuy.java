package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class BestBuy {

	public static void main(String[] args) {
		
		Map <Integer, String> map=new TreeMap<>();
		map.put(12345,"Printer");
		map.put(15578,"Laptop");
		map.put(67889,"TV");
		System.out.println(map);
		
		Set <Entry<Integer, String>> set=map.entrySet();
		System.out.println(set);
		
		for(Entry<Integer, String> s:map.entrySet()) {
			System.out.println("Key: "+s.getKey()+" Value: "+s.getValue());
		}
		
		Iterator<Entry<Integer, String>> it=map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer, String> e=it.next();
			System.out.println(e.getKey()+"--"+e.getValue());
		}
		
		

	}

}
