package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {
		
		Insurance[] insuranceArray= {new Car("Guarantee","BMW"),new Pet("SavePet","Dog"),new Health("UnitedHealth")};
		
		ArrayList <Insurance> list=new ArrayList<>();
		list.add(new Car("Guarantee","BMW"));
		list.add(new Pet("SavePet","Dog"));
		list.add(new Health("UnitedHealth"));
		
		for(Insurance i:list) {
			i.getQuote();
			i.cancelInsurance();
		}
		System.out.println("========2.way======");
		
		for(int i=0; i<list.size(); i++) {
			list.get(i).getQuote();
			list.get(i).cancelInsurance();
		}
		
		System.out.println("======Iterator====");
		Iterator <Insurance> it=list.iterator();
		while(it.hasNext()) {
			Insurance ins=it.next();
			ins.getQuote();
			ins.cancelInsurance();
		}
		
		

	}

}
