package com.syntax.class19;

public class BookClass {
	//Write program as a Book class   that will have 2 Constructors. While creating an object make sure:
	//Instance variables are being initialized
	//Both Constructors are being executed
	
	 int page_num;
	  String name;
	  
	  public BookClass(String name, int page_num) {
	        this.name = name;
	        this.page_num = page_num;
	        System.out.println("Name of the book is " + this.name + " and has " + this.page_num + " pages.");
	    }
	  
	    public BookClass() {
	        this("Java", 500);
	    }
	    
	   
	    
	    public static void main(String[] args) {
	        BookClass obj = new BookClass(); // "JAVA",500
	    }

}
