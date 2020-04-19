package com.syntax.class30;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class Store{
	
	String type, name;
	
	public Store(String type, String name) {
		this.name=name;
		this.type=type;
	}
	
	public void display() {
		System.out.println("This is store "+name);
	}
	
	public abstract void workingHours();	
}

class Nike extends Store{
	
	public Nike(String type, String name) {
		super(type,name);
	}

	@Override
	public void workingHours() {
		System.out.println(name+" works from 10 am till 6 pm");
	}	
}

class Costco extends Store{
  public Costco(String type, String name) {
		super(type, name);
	}

	@Override
	public void workingHours() {
		System.out.println(name+" works from 8 am until 8 pm");
	}	
}
class Amazon extends Store{

	public Amazon(String type, String name) {
		super(type, name);
	}

	@Override
	public void workingHours() {
		System.out.println(name+" works 7/24");
	}
}

public class UserDefinedClassesInMap {
	
	public static void main(String[] args) {
		//we want to store stores in form 1-->amazon, 2-->Costco, 3-->Nike
		
		Map <Integer, Store> storeMap=new LinkedHashMap<>();
		storeMap.put(1, new Amazon("online","Amazon"));
		storeMap.put(2, new Costco("wholesale","Costco"));
		storeMap.put(3, new Nike("retail","Nike"));
		
		System.out.println(storeMap);
		
		//to get an access to all methods of our store objects:values(), entrySet, keySet()()
		
		// 1.way--> get all value objects
		Collection <Store> col=storeMap.values();
		for(Store c:col) {
			c.workingHours();
			c.display();
			System.out.println("================");
		}
		
		System.out.println("---------USING ENTRY SET--------");
		//2. way --> get all entry objects --> getValue
		Set<Entry<Integer, Store>> set=storeMap.entrySet();
		for(Entry<Integer, Store> entry:set) {
			entry.getValue().workingHours();
			entry.getValue().display();
			System.out.println("---------------");
		}
		
		//3. way--> get all keys --> get value of specified key
		Set <Integer> keys=storeMap.keySet();
		for(Integer key:keys) {
			Store obj=storeMap.get(key);
			storeMap.get(key).workingHours();
			storeMap.get(key).display();
		}
		
		
		
	}

}
