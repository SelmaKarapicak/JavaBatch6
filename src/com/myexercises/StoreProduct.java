package com.myexercises;

public class StoreProduct {
	
	 String label, category;
	  double price;
	  int stock;
	   boolean hasExpiration;
	  
	  StoreProduct(String slabel,  double iprice,String scategory, int istock, boolean dhasExpiration){
	    label=slabel; 
	    category=scategory;
	    price=iprice;
	    stock=istock;
	    hasExpiration=dhasExpiration;
	  }
	  StoreProduct(String label, double price, int stock){
	  }
	  StoreProduct(String label,  double price ){
	  }
	  
	  void display(){
	    System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
	  }
	  
	  public static void main(String[] args){
		  StoreProduct obj=new StoreProduct("Eggs",3.0,"Produce",10, true);
		  obj.display();
		  StoreProduct obj1=new StoreProduct("Paper Towels",2.0,"misc",24,false);
		  obj1.display();
		  StoreProduct obj2=new StoreProduct("Paper Towels",2.0,"null",0, false);
		  obj2.display();
		 
		
		}
	  

}
