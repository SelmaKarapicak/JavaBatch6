package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class CardTest {

	public static void main(String[] args) {
	
		LinkedList <Card> list=new LinkedList<>();
		list.add(new BOA("Charge Card"));
		list.add(new TD("Debit Card"));
		list.add(new WellsFargo("Credit Card"));
		
		for(int i=0; i<list.size(); i++) {
			list.get(i).interest();
			list.get(i).limit();
		}
		System.out.println("====2.way=====");
		
		for(Card s:list) {
			s.interest();
			s.limit();
		}
		System.out.println("====Iterator=====");
		
		Iterator <Card> it=list.iterator();
		while(it.hasNext()) {
			Card str=it.next();
			str.limit();
			str.interest();
		}
		

	}

}
