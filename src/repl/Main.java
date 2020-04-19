package repl;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
			 
			  ArrayList <Boolean>listA=new ArrayList<>();
			  listA.add(true);
			  listA.add(false);
			  listA.add(false);
			  
			   ArrayList <Boolean>listB=new ArrayList<>();
			  listB.addAll(listA);
			  
			  Iterator <Boolean>it=listB.iterator();
			  while(it.hasNext()){
			    it.next();
			  }
			  System.out.println(listB);
			  
			  
			  
			}
			

	}


