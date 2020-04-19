package com.myexercises;

public class ShoppingStore {
	
	   String item;
	   double price;
	   double quantity;
	  
	  ShoppingStore(String item,double price,double quantity){
	    this.item=item;
	    this.price=price;
	    this.quantity=quantity;
	  }
	    
	  void itemTotalPrice(){
		  
		 double total=this.price*this.quantity;
		  
	   System.out.println(item+" "+"Total Value"+" "+total);
	   
	   
	  }
	  
	 
	  
	  public static void main(String[] args){
		    ShoppingStore obj=new ShoppingStore("Blanket",9.998,10);
		    obj.itemTotalPrice();
		    ShoppingStore obj2=new ShoppingStore("Mattress",43.918,10);
		    obj2.itemTotalPrice();
		    System.out.println("You purchased "+(99.98+439.18)+"Today");
		    
		    
		    
		  }
		  

}
