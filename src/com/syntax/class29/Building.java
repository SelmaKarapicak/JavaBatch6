package com.syntax.class29;

import java.util.Map;
import java.util.TreeMap;

//Create a map of a building. Store floor number and it is associated company name. 
//(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values. 
//Check how many entries you have?
//Update company on a 4th floor 
//Remove company on the 7th floor
//Print your map

public class Building {

	public static void main(String[] args) {
		
		Map<Integer, String> building=new TreeMap<>();
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Ebay");
		building.put(4, "Amazon");
		building.put(5, "Google");
		building.put(6, "Syntax");
		building.put(7, "Apple");
		
		System.out.println(building);
		
		int size=building.size();
		System.out.println(size);
		
		building.put(4, "Microsoft");
		System.out.println(building);
		
		building.remove(7);
		System.out.println(building);
		
		
		
		
	

	}

}
