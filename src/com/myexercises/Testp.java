package com.myexercises;

 class Testp {
	 
		int number;
		  Testp(){
		    System.out.println("Parent Constructor without argument");
		  }
		  Testp(int number){
		    this.number=number;
		    System.out.println(10);
		  }
		  
		  public static void main(String[] args){
			    
			    Child obj=new Child();
			    Child obj2=new Child(10);
			    
			  }

	}
	class Child extends  Testp{
		 int number;
		  Child(){
		    System.out.println("Child Constructor without argument");
		  }
		  Child(int number){
			  super(number);
			  this.number=number;
		  }
		  
		  
		}


