package com.myexercises;

public class Dog {

		 String name;
		  double weight;
		  static String dogBreed;
		  
		  Dog(String name,String dogBreed,double weight){
			  this.name=name;
			  this.weight=weight;
			  this.dogBreed=dogBreed;
		  }
		  void display(){
			 System.out.println(name+" "+dogBreed+" "+weight); 
		  }
		  
		  public static void main(String[]args) {
			  Dog obj=new Dog("Tarzan","Mutt",50);
			  obj.display();
			  
			  Dog obj2=new Dog("Lucy","Mutt",10);
			  obj2.display();
			  
		  }

}
